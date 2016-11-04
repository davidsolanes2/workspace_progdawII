package UF1.emp_reformas;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/*
 * Created by dsg on 13/10/16.
 */

public class gestionCliente {

    private static fichero miFichero;
    private static listaCliente misClientes;

    public static void main(String[] args) {
        miFichero = new fichero("cliente.xml");
        misClientes = (listaCliente) miFichero.read();
        if (misClientes == null) {
            misClientes = new listaCliente();
        }
        int opcio=0;
        boolean error;
        do {
            try {
                opcio = menu_clientes.menu();
                while (opcio != 8) {
                    switch (opcio) {
                        case 1:
                            altaCliente();
                            break;
                        case 2:
                            altaPresupuesto();
                            break;
                        case 3:
                            presupuestosPendientes();
                            break;
                        case 4:
                            listadoPresupuestosClientes();
                            break;
                        case 5:
                            presupuestosRechazados();
                            break;
                        case 6:
                            listadoClientes();
                            break;
                        case 7:
                            cambiarEstado();
                            break;
                        case 8:
                            System.out.println("Cerrando el sistema");
                            break;
                        default:
                            System.out.println("\nOpcion incorrecta, seleccione de 1 a 8");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException ex) {
                System.out.println("\nNo has introducido un numero entero");
                error = false;
            }

        }while(error = true); //controlar que no puedan ponerme caracter alfanumerico
    }

    public static void altaCliente() {
        boolean existe = false;

        String aux = InputData.pedirCadena("Telefono : ");

        if (misClientes.existe(aux)) {
            System.out.println("Este Cliente ya existe");
        }
        else {
            String nombre = InputData.pedirCadena("Nombre   : ");
            String apellido = InputData.pedirCadena("Apellido : ");
            String telefono = aux;

            boolean vip = false;
            String respuesta;
            do {
                respuesta = InputData.pedirCadena("Es Cliente Vip (Si/No) ? ");
                if (respuesta.equalsIgnoreCase("si")) {
                    vip = true;
                }
                else if (respuesta.equalsIgnoreCase("no")) {
                    vip = false;
                }
                else {
                    System.out.println("Respuesta incorrecta");
                }

            }while(!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));

            cliente c = new cliente(nombre, apellido, telefono, vip);
            misClientes.altaCliente(c);
            miFichero.grabar(misClientes);
        }
    }

    public static void altaPresupuesto() {
        String telefono = InputData.pedirCadena("Telefono ? : ");
        if (misClientes.existe(telefono)) {
            System.out.println("Este Cliente ya existe !! ");
            String num_01 = InputData.pedirCadena("Numero del presupuesto : ");
            for ( cliente c : misClientes.getLista()) {
                for (presupuesto p : c.getLista().getLista_p()){
                    if (p.getCodigo() == num_01) {
                        System.out.println("Este numero ya esta dado de alta");
                    }
                    else if (!Objects.equals(p.getCodigo(), num_01)) {
                        String codigo = num_01;
                        String concepto = InputData.pedirCadena("Concepto : ");
                        double precio_tot = InputData.pedirDouble("Importe : ");
                        String estado = InputData.pedirCadena("Estado (aceptado/rechazado/pendiente) A/R/P : ");
                        c = misClientes.obtenerTelefono(telefono);
                        p = new presupuesto(codigo, concepto, precio_tot, estado);
                        c.getLista().altaPresupuesto(p);
                        miFichero.grabar(misClientes);
                    }
                    else {
                        altaCliente();
                        altaPresupuesto();
                    }
                }
            }
        }
    }

    private static void presupuestosPendientes() {
        for (cliente c : misClientes.getLista()) {
            for (presupuesto p : c.getLista().getLista_p()){
                if (p.getEstado().equalsIgnoreCase("P")) {
                    System.out.println("El Cliente " + c.getNombre() + "" + c.getApellido() + " esta " + p);
                }
            }
        }
    }

    private static void  listadoPresupuestosClientes() {
        String telefono = InputData.pedirCadena("Telefono ? : ");
        cliente c = misClientes.obtenerTelefono(telefono);
        if (c != null) {
            for (presupuesto p : c.getLista().getLista_p()) {
                System.out.println(p.toString());
            }
        }
    }

    private static void presupuestosRechazados() {
        for (cliente c : misClientes.getLista()) {
            for (presupuesto p : c.getLista().getLista_p()) {
                if (p.getEstado().equalsIgnoreCase("R")) {
                    System.out.println("El Cliente " + c.getNombre() + "" + c.getApellido() + " esta " + p);
                }
            }
        }
    }

    private static void listadoClientes() {
        for (cliente c : misClientes.getLista()) {
            for (presupuesto p : c.getLista().getLista_p()) {
                System.out.println("El Cliente " + c + "" + " tiene " + p);
            }
        }
    }

    private static void  cambiarEstado() {
        String num_01 = InputData.pedirCadena("Presupuesto nº ? : ");
        for (cliente c : misClientes.getLista()) {
            for (presupuesto p : c.getLista().getLista_p()) {
                if (num_01 == p.getCodigo()) {
                    System.out.println(p.getEstado());
                    String estado = InputData.pedirCadena("Estado (aceptado/rechazado/pendiente) A/R/P : ");
                    p.setEstado(estado);
                    miFichero.grabar(misClientes);
                }
                else {
                    System.out.println("Este presupuesto no existe");
                }
            }
        }
    }

    private static class menu_clientes {
        static int menu() throws IOException {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio;
            System.out.println("\n\t             GESTION TIENDA ");
            System.out.println("-----------------------------------------------");
            System.out.println("\t1.- Alta cliente                        ");
            System.out.println("\t2.- Nuevo presupuesto                   ");
            System.out.println("\t3.- Presupuestos pendientes             ");
            System.out.println("\t4.- Listado de presupuestos/cliente     ");
            System.out.println("\t5.- Listado de presupuestos rechazados  ");
            System.out.println("\t6.- Listado clientes (mas total presupuestos) ");
            System.out.println("\t7.- Cambiar estado presupuestos         ");
            System.out.println("\t8.- Salir               \n");
            System.out.print("Seleccione una opcion : ");
            opcio = Integer.parseInt(buffer.readLine());

            return opcio;
        }
    }
}

