package model;

import java.util.List;

public class Reparacion {

    private Repuesto repuesto;
    private double total;
    private List<Repuesto> repuestos;
    public void addRepuesto(Repuesto repuesto){

        repuestos.add(repuesto);
        total += repuesto.getPrecio();
    }
}
