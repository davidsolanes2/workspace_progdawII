package UF1.emp_reformas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Created by dsg on 22/09/16.
 */

public class InputData {

    public static String pedirCadena(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cadena = "";
        boolean error;
        do {
            try {
                do {
                    System.out.print(mensaje);
                    cadena = br.readLine();
                    error = false;
                    if (cadena.equalsIgnoreCase("")) {
                        System.out.println("No se puede dejar en blanco");
                    }
                }while(cadena.equalsIgnoreCase(""));

            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            }
        } while (error);
        return cadena;
    }

    public static int pedirEntero(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean error;
        do {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un nº entero.");
                error = true;
            }
        } while (error);    // es lo mismo que error == true
        return numero;
    }

    public static double pedirDouble(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean error;
        do {
            try {
                System.out.print(mensaje);
                numero = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error entrada salida");
                error = true;
            } catch (NumberFormatException ex) {
                System.out.println("No has introducido un número.");
                error = true;
            }
        } while (error);
        return numero;
    }

}
