package model;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Cliente> clientes;
    private List<Mecanico> mecanicos;
    private List<Usado> usados;
    private List<Nuevo> nuevos;
    private List<Repuesto> repuestos;
    private List<Venta> ventas;
    private List<OrdenTrabajo> ots;

    public Sistema() {
        clientes = new ArrayList<>();
        clientes.add(new Cliente("123456", "juan", "perez", "cotoca","3536569"));
        clientes.add(new Cliente("1234567", "juanito", "lopez", "banzer","35365698"));
        clientes.add(new Cliente("1234568", "juanote", "chavez", "urubo","35365699"));

        mecanicos = new ArrayList<>();
        mecanicos.add(new Mecanico("456123", "carlos", "arauz", "01/09/2021", 1000));
        mecanicos.add(new Mecanico("4561239", "jose", "higa", "01/08/2021", 1500));

        usados = new ArrayList<>();
        usados.add(new Usado("123xxx", "rav4", "toyota", "blanco",100));
        usados.add(new Usado("123xcv", "crv", "honda", "plata",150));
        usados.add(new Usado("123xvb", "creta", "hyundai", "negro",200));

        nuevos = new ArrayList<>();
        nuevos.add(new Nuevo("123qqq", "frontier", "nissan", "blanco",2));

        ventas = new ArrayList<>();

        ots = new ArrayList<>();

    }

    private Cliente getCliente(String nombre){
        for (Cliente c: clientes){
            if (c.getNombre()== nombre){
                return c;
            }
        }
        return null;
    }

    private Mecanico getMecanico(String nombre){
        for (Mecanico m: mecanicos){
            if (m.getNombre()== nombre){
                return m;
            }
        }
        return null;
    }

    private Usado getMatriculaUsado(String matricula){
        for (Usado u: usados){
            if (u.getMatricula()== matricula){
                return u;
            }
        }
        return null;
    }

    private Nuevo getMatriculaNuevo(String matricula){
        for (Nuevo n: nuevos){
            if (n.getMatricula()== matricula){
                return n;
            }
        }
        return null;
    }

    public void crearVentaUsado(String nombre, String matricula){
        Cliente cliente = getCliente(nombre);
        Usado usado = getMatriculaUsado(matricula);
        Venta venta = new Venta(cliente,usado);
        ventas.add(venta);

    }

    public void crearVentaNuevo(String nombre, String matricula){
        Cliente cliente = getCliente(nombre);
        Nuevo nuevo = getMatriculaNuevo(matricula);
        Venta venta = new Venta(cliente,nuevo);
        ventas.add(venta);

    }

    public void crearOT(String fechaini, String fechafin, double tiempo, String nombre_cliente, String nombre_mecanico){
        Cliente cliente = getCliente(nombre_cliente);
        Mecanico mecanico = getMecanico(nombre_mecanico);
        OrdenTrabajo ot = new OrdenTrabajo(fechaini,fechafin,tiempo,cliente,mecanico);
        ots.add(ot);

    }

    public String mostrarVentaUsado(){
        StringBuilder builder = new StringBuilder();
        for(Venta v : ventas) {
            builder.append(v).append("\n");
        }
        return builder.toString();
    }

    public String mostrarOTS(){
        StringBuilder builder = new StringBuilder();
        for(OrdenTrabajo ot : ots) {
            builder.append(ot).append("\n");
        }
        return builder.toString();
    }
}
