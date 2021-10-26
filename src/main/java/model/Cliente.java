package model;

public class Cliente extends Persona{

    private String direccion;
    private String telefono;
    public Cliente(String ci, String nombre, String apellidos, String direccion, String telefono) {
        super(ci, nombre, apellidos);
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
