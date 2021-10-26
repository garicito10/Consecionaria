package model;

public abstract class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String marca;
    protected String color;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehiculo(String matricula, String modelo, String marca, String color) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }
}
