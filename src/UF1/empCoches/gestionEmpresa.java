package UF1.empCoches;

/*
 * Created by david on 10/11/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gestionEmpresa {

    private static fichero miFichero;
    private static listaCoches misVehiculos;

    public static void main(String[] args) {
        miFichero = new fichero("rentcar.xml");
        misVehiculos = (listaCoches) miFichero.read();
        if (misVehiculos == null) {
            misVehiculos = new listaCoches();
        }

        boolean error;
        int opcio = 0;

        do try {
            while (opcio != 8){
                opcio = menu_tienda.menu();
                switch (opcio) {
                    case 1:
                        altaVehiculo();
                        System.out.println("Ficha del Vehiculo");
                        System.out.println("------------------");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 8:
                        System.out.println("Cerrando el sistema");
                        break;
                    default:
                        System.out.println("\nOpcion incorrecta, seleccione de 1 a 8");
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
            error = false;
        } catch(NumberFormatException ex){
            System.out.println("\nNo has introducido un numero entero");
            error = false;

        }while(true && opcio !=8);
    }

    public static void altaVehiculo() {
        boolean existe = false;

        String aux = InputData.pedirCadena("Matricula : ");
        if (misVehiculos.existe(aux)) {
            System.out.println("Esta matricula ya existe");
        }
        else {
            String tipo = InputData.pedirCadena("Categoria : ");
            int pax = InputData.pedirEntero("Nº plazas : ");
        }
    }

    private static class menu_tienda {
        static int menu() throws IOException {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio;
            System.out.println("\n\t             GESTION TIENDA ");
            System.out.println("-----------------------------------------------");
            System.out.println("\t1.- Alta vehiculo                       ");
            System.out.println("\t2.- Listado de vehiculos                ");
            System.out.println("\t3.- Alquiler vehiculo                   ");
            System.out.println("\t4.- Listado vehiculo alquilado          ");
            System.out.println("\t5.-                               ");
            System.out.println("\t6.- Baja vehiculo                 ");
            System.out.println("\t7.-                               ");
            System.out.println("\t8.- Salir               \n");
            System.out.print("Seleccione una opcion : ");
            opcio = Integer.parseInt(buffer.readLine());

            return opcio;
        }
    }
}
