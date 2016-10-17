package UF1.emp_reformas;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/*
 * Created by dsg on 13/10/16.
 */

public class gestionCliente {

    private static listaPresupuesto misPresupuestos;
    private static listaCliente misClientes;

    private static fichero miFichero;

    //static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        miFichero = new fichero("clientes.xml");

        misClientes = (listaCliente) miFichero.read();


        if (misClientes == null && misPresupuestos == null) {
            misClientes = new listaCliente();
            misPresupuestos = new listaPresupuesto();
        }


        int opcio = 0;
        do {
            menu_clientes menu_01 = new menu_clientes();

            opcio = menu_clientes.menu();

            switch (opcio) {
                case 1:
                    altaClientes();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Cerrando el sistema");
                    break;
                default:
                    System.out.println("\nOpcion incorrecta, seleccione de 1 a 6");
            }
        } while (opcio != 8);



    }

    private static void altaClientes() {
        boolean existe = false;
        String aux_01;
        do {
            aux_01 = InputData.pedirCadena("Nº telefono : ");
            cliente aux = new cliente();
            aux.setTelefono(aux_01);
            existe = misClientes.existe(aux);
            if (existe) {
                System.out.println("Este telefono ya existe");
            }
        }while(existe);

        String nombre = InputData.pedirCadena("Nombre   : ");
        String apellido = InputData.pedirCadena("Apellido : ");
        String telefono = aux_01;
        boolean vip = false;
        String respuesta = "";
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
        }while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

        cliente c = new cliente(nombre, apellido, telefono, vip);
        misClientes.altaCliente(c);
        miFichero.grabar(misClientes);
        //miFichero.grabar(misPresupuestos);
    }

    private static class menu_clientes {
        public static int menu() throws IOException {
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

