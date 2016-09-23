package UF1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Created by dsg on 22/09/16.
 */
public class InputData {



        public static int menu() throws IOException {        //menu

            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

            int opcio;
            System.out.println("\n\tFICHA MENU ");
            System.out.println("----------------------------");
            System.out.println("\t1.-  ");
            System.out.println("\t2.-  ");
            System.out.println("\t3.-  ");
            System.out.println("\t4.-  ");
            System.out.println("\t5.- Salir               \n");
            System.out.print("Seleccione una opcion : ");
            opcio = Integer.parseInt(buffer.readLine());

            return opcio;
        }





}
