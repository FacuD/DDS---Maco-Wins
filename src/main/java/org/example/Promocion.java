package org.example;

public class Promocion implements EstadoPrenda{
  private double descuento;
  public Promocion(double descuento){
    this.descuento = descuento;
  }

  @Override
  public double precioFinal(double precioOriginal) {
    return precioOriginal - descuento;
  }
}
