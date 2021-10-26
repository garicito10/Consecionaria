package model;

public abstract class Persona {

    protected String ci;
    protected String nombre;
    protected String apellidos;

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Persona(String ci, String nombre, String apellidos) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
