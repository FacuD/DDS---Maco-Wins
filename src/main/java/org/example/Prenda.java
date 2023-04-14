package org.example;

public class Prenda {
  private double precioBase;
  private EstadoPrenda estado;

  public Prenda(double precioBase, EstadoPrenda estado){
    this.precioBase = precioBase;
    this.estado = estado;
  }

  public double precio(){
    return estado.precioFinal(precioBase);
  }
}
