package model;

public class Mecanico extends Persona{

    private String fechaContrato;
    private Double salario;

    public Mecanico(String ci, String nombre, String apellidos, String fechaContrato, double salario) {
        super(ci, nombre, apellidos);
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
