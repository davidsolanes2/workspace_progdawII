package UF1.herenciaStucomRoyal;

/*
 * Created by david on 24/11/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    private static fichero miFichero;
    private static listaJugador miJuego;


    public static void main(String[] args) {
        miFichero = new fichero("juego.xml");
        miJuego =(listaJugador) miFichero.read();
        if (miJuego == null) {
            miJuego = new listaJugador();
        }

        boolean error;
        int opcio = 0;
        do try {
            while (opcio !=8) {
                opcio = menu_cartas.menu();
                switch (opcio) {
                    case 1:
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
                        System.out.println("\nOpcion incrrecta, seleccione de 1 a 8");
                }
            }

        }
        catch (IOException e) {
            e.printStackTrace();
            error = false;
        } catch (NumberFormatException ex) {
            System.out.println("\nNo has introducido un numero entero");
            error = false;
        } while(true && opcio != 8);

    }

        private static class menu_cartas {
            static int menu() throws IOException {
                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                int opcio;
                System.out.println("\n\t             STUCOM ROYAL             ");
                System.out.println("-----------------------------------------------");
                System.out.println("\t1.- Listado de cartas                   ");
                System.out.println("\t2.- Añadir cartas                       ");
                System.out.println("\t3.- Batalla                             ");
                System.out.println("\t4.- Ranking                             ");
                System.out.println("\t5.-          ");
                System.out.println("\t6.-          ");
                System.out.println("\t7.-          ");
                System.out.println("\t8.- Salir               \n");
                System.out.print("Seleccione una opcion : ");
                opcio = Integer.parseInt(buffer.readLine());

                return opcio;
            }
        }

}
