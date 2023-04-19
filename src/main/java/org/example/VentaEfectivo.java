package org.example;

import java.time.LocalDate;
import java.util.List;

public class VentaEfectivo extends Venta {
  public VentaEfectivo(LocalDate fecha, List<Item> items){
    super(items, fecha);
  }


}
