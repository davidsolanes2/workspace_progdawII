package UF1.herenciaStucomRoyal;

/*
 * Created by david on 24/11/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    private static fichero MiFichero;
    private static listaJugador miJuego;


    public static void main(String[] args) {


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
