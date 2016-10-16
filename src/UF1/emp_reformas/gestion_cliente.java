package UF1.emp_reformas;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/*
 * Created by dsg on 13/10/16.
 */

public class gestion_cliente {

    private static Lista_presupuesto misPresupuestos;

    private static Lista_cliente misClientes;

    private static fichero miFichero;

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        miFichero = new fichero("clientes.xml");

        misClientes = (Lista_cliente) miFichero.read();

        if (misClientes == null) {
            misClientes = new Lista_cliente();
            misPresupuestos = new Lista_presupuesto();
        }


        int opcio = 0;
        do {
            menu_clientes menu_01 = new menu_clientes();

            opcio = menu_clientes.menu();

            switch (opcio) {
                case 1:
                    altaCliente();
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

    public static String pedirInformacion(String mensaje) {
        String aux_titulo = null;
        try {
            System.out.println(mensaje);
            aux_titulo = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return aux_titulo;
    }

    private static void altaCliente() {
        boolean existe = false;
        String aux_01="";
        do {
            aux_01 = pedirInformacion("Nº telefono : ");



        }while(existe);

    }

    private static class menu_clientes {
        public static int menu() throws IOException {

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

