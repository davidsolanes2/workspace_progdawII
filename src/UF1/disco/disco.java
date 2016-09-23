package UF1.disco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Created by dsg on 16/09/16.
 */

public class disco {
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    disco_01 apli = new disco_01();

    public static void main(String[] args) {
        boolean error;
        do {
            try {
                menu_disco nenu_01 = new menu_disco();

                int opcio = 0;
                while (opcio != 5) {
                    opcio = menu_disco.menu();

                    switch (opcio) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:
                            System.out.println("Cerrando el sistema");
                            break;
                        default:
                            System.out.println("\nOpcion incorrecta, seleccione de 1 a 5");
                    }
                }

            } catch (IOException ex) {
                System.out.println("\nError de entrada/salida");
                error = false;
            } catch (NumberFormatException ex) {
                System.out.println("\nNo has introducido en numero entero");
                error = false;
            }
        } while (error = true);

    }


    private static class menu_disco {
        public static int menu() throws IOException {        //menu

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            int opcio;
            System.out.println("\n\tFICHA DE PELICULAS ");
            System.out.println("----------------------------");
            System.out.println("\t1.- Añadir disco a colección   ");
            System.out.println("\t2.- Modificar disco            ");
            System.out.println("\t3.- Eliminar disco             ");
            System.out.println("\t4.- Mostrar disco               ");
            System.out.println("\t5.- Salir               \n");
            System.out.print("Seleccione una opcion : ");
            opcio = Integer.parseInt(buffer.readLine());

            return opcio;
        }
    }

    public void altaRegistro() {
        boolean error;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(" ALTA REGISTRO  ");
            System.out.println("================");
            System.out.print("Titulo          : ");
            apli.setTitulo(buffer.readLine());
            System.out.print("Grupo/Artista   : ");
            apli.setGrupo(buffer.readLine());
            System.out.print("Número de temas : ");
            apli.setTemas(Integer.parseInt(buffer.readLine()));
            System.out.print("Duracion        : ");
            apli.setDuracion(Double.parseDouble(buffer.readLine()));
        } catch (IOException ex) {
            System.out.println("\nError de entrada/salida");
            error = false;
        } catch (NumberFormatException ex) {
            System.out.println("\nNo has introducido en numero entero");
            error = false;
        }
    }
}
