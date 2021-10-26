package model;

public class Usado extends Vehiculo{

    private int nroKms;
    public Usado(String matricula, String modelo, String marca, String color, int nroKms) {
        super(matricula, modelo, marca, color);
    }

    public int getNroKms() {
        return nroKms;
    }

    public void setNroKms(int nroKms) {
        this.nroKms = nroKms;
    }
}
