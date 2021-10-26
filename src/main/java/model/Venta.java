package model;

public class Venta {
    private Cliente cliente;
    private Usado usado;
    private Nuevo nuevo;

    public Venta(Cliente cliente, Usado usado){
        this.cliente= cliente;
        this.usado= usado;
    }
    public Venta(Cliente cliente, Nuevo nuevo){
        this.cliente= cliente;
        this.nuevo= nuevo;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cliente=" + cliente.getNombre() +
                ", usado=" + (usado == null ? "NO ES USADO" : usado.getMatricula())  +
                ", nuevo=" + ( nuevo == null ? "NO ES NUEVO" : nuevo.getMatricula())  +
                '}';
    }


}
