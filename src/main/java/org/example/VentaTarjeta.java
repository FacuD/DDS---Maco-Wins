package org.example;

import java.time.LocalDate;
import java.util.List;

public class VentaTarjeta extends Venta{
    private int cantCuotas;
    private double coeficiente;

    public VentaTarjeta(List<Item> items, LocalDate fecha, int cantCuotas, double coeficiente){
      super(items, fecha);
      this.cantCuotas = cantCuotas;
      this.coeficiente = coeficiente;
    }

  @Override
  public double importe() {
    return (coeficiente * cantCuotas + 0.01 * super.importe()) + super.importe();
  }
}
