package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prenda remera = new Prenda(300, new NuevaPrenda());
        Prenda zapas = new Prenda(2000, new Liquidacion());
        Prenda pantalon = new Prenda( 3000, new Promocion(1000));

        Item item1 = new Item(remera, 3);
        Item item2 = new Item(zapas, 2);
        Item item3 = new Item(pantalon, 5);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

        Venta ventaEfectivo = new VentaEfectivo(LocalDate.now(), items);
        //items, LocalDate fecha, int cantCuotas, double coeficiente
        VentaTarjeta ventaTarjeta = new VentaTarjeta(items, LocalDate.now(), 5, 0.3);

        // Crear un negocio y registrar las ventas
        Tienda macoWins = new Tienda();
        macoWins.agregarVenta(ventaEfectivo);
        macoWins.agregarVenta(ventaTarjeta);

        // Calcular las ganancias
        double gananciasHoy = macoWins.gananciasSegunFecha(LocalDate.now());
        System.out.println("Las ganancias de hoy son: $" + gananciasHoy);
    }
}