package org.example;

import java.time.LocalDate;
import java.util.List;

public class Venta {
  protected List<Item> items;
  protected LocalDate fecha;

  public Venta(List<Item> items, LocalDate fecha){
    this.items = items;
    this.fecha = fecha;
  }

  public boolean esFecha(LocalDate fecha){
    return this.fecha.equals(fecha);
  }

  public double importe(){
    return items.stream().mapToDouble(Item::importe).sum();
  }
}
