package model;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.crearVentaUsado("juan","123xxx");

        sistema.crearVentaNuevo("juanito","123qqq");

        sistema.crearOT("07/10/2021","08/10/2021",2,"juan","carlos");

        System.out.println(sistema.mostrarVentaUsado());

        System.out.println(sistema.mostrarOTS());
    }
}
