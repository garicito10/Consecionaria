package model;

public class OrdenTrabajo {

    private String fechaIni;
    private String fechaFin;
    private double tiempo;
    private Cliente cliente;
    private Mecanico mecanico;

    public OrdenTrabajo(String fechaIni, String fechaFin, double tiempo, Cliente cliente, Mecanico mecanico) {
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.tiempo = tiempo;
        this.cliente = cliente;
        this.mecanico = mecanico;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }


    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "OrdenTrabajo{" +
                "fechaIni='" + fechaIni + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", tiempo=" + tiempo +
                ", cliente=" + cliente.getNombre()+" "+ cliente.getApellidos()+
                ", mecanico=" + mecanico.getNombre() +" "+ mecanico.getApellidos() +
                '}';
    }
}
