package model;

public class Nuevo extends Vehiculo{

    private int nroUnidad;

    public Nuevo(String matricula, String modelo, String marca, String color, int nroUnidad) {
        super(matricula, modelo, marca, color);
    }
    public int getNroUnidad() {
        return nroUnidad;
    }

    public void setNroUnidad(int nroUnidad) {
        this.nroUnidad = nroUnidad;
    }


}
