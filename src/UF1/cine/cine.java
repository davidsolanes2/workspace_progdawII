package UF1.cine;

/*
 * Created by dsg on 22/09/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class cine {

    private static ArrayList<cine_01> micine = new ArrayList<>();  //revisar no es correcto

    private static fichero miFichero;

    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        miFichero = new fichero("peliculas.xml");

        miFichero = (fichero) miFichero.read();

        boolean error;
        int opcio = 0;
        do {
            try {
                menu_cine nenu_01 = new menu_cine();

                while (opcio != 6) {
                    opcio = menu_cine.menu();

                    switch (opcio) {
                        case 1:
                            altaRegistro();
                            break;
                        case 2:
                            consultarRegistro();
                            break;
                        case 3:
                            listadoGenero();
                            break;
                        case 4:
                            favorita();
                            break;
                        case 5:
                            totales();
                            break;
                        case 6:
                            System.out.println("Cerrando el sistema");
                            break;
                        default:
                            System.out.println("\nOpcion incorrecta, seleccione de 1 a 6");
                    }
                }

            } catch (IOException ex) {
                System.out.println("\nError de entrada/salida");
                error = false;
            } catch (NumberFormatException ex) {
                System.out.println("\nNo has introducido en numero entero");
                error = false;
            }
        } while (error = true && opcio != 6);

    }

    private static class menu_cine {
        public static int menu() throws IOException {

            int opcio;
            System.out.println("\n\tFICHA DE PELICULAS ");
            System.out.println("----------------------------");
            System.out.println("\t1.- Añadir pelicula       ");
            System.out.println("\t2.- Consultar datos       ");
            System.out.println("\t3.- Listado por genero    ");
            System.out.println("\t4.- Pelicula favorita     ");
            System.out.println("\t5.- Totales               ");
            System.out.println("\t6.- Salir               \n");
            System.out.print("Seleccione una opcion : ");
            opcio = Integer.parseInt(buffer.readLine());

            return opcio;
        }

    }

    public static void altaRegistro() {
        boolean error = true;
        cine_01 apli = new cine_01();

        do {
            try {
                System.out.println(" ALTA REGISTRO  ");
                System.out.println("================");
                System.out.print("Codigo          : ");
                apli.setCodigo(buffer.readLine());
                System.out.print("Titulo          : ");
                apli.setTitulo(buffer.readLine());
                System.out.print("Director        : ");
                apli.setDirector(buffer.readLine());
                System.out.print("Duracion        : ");
                apli.setMinutos(Integer.parseInt(buffer.readLine()));
                System.out.print("Genero          : ");
                apli.setGenero(buffer.readLine());
                System.out.print("Valoracion      : ");
                apli.setValoracion(Integer.parseInt(buffer.readLine()));
                System.out.print("Visto si/no     : ");
                String aux;
                aux = buffer.readLine();
                if (aux.equalsIgnoreCase("si")) {
                    apli.setVisto("true");
                }
                else {
                    apli.setVisto("false");
                }
                micine.add(apli);
                break; //no puede ser

            } catch (IOException ex) {
                System.out.println("\nError de entrada/salida");
                error = false;
            } catch (NumberFormatException ex) {
                System.out.println("\nNo has introducido el numero entero");
                error = false;
            }

            miFichero.grabar(micine);

            //comprobar que no se repiten los codigos

        }while(error = true);
    }

    public static void consultarRegistro() {

        String aux = pedirinformacion("Introducir Titulo : ");

        for (int i = 0; i < micine.size(); i++) {
            if (aux.equalsIgnoreCase(micine.get(i).getTitulo())) {
                System.out.println( micine.get(i).toString());
            }
         }
    }

    public static void listadoGenero() {

        String aux_01 = pedirinformacion("Introducir Genero : ");

        for (int i = 0; i < micine.size(); i++) {
            if (aux_01.equalsIgnoreCase(micine.get(i).getGenero())) {
                System.out.println( micine.get(i).toString());
            }
        }

    }

    public static void favorita() {
        int min = 0;
        if (micine.isEmpty()) {
            System.out.println("No existe ningun registro");
        }
        else {
            cine_01 favorita;
            favorita = micine.get(0);
            for (cine_01 c : micine) {
                if (c.getValoracion() > favorita.getValoracion()) {
                    favorita = c;
                }
            }
            System.out.println("La pelicula favorita es : " + favorita.getTitulo());
        }
    }

    public static void totales(){
        if (micine.isEmpty()){
            System.out.println("No tiene ningún registro");
        }
        else {
            int cont_01=0, cont_02=0, tot=0;
            double tot_time=0;
            for (cine_01 a: micine) {
                if (a.isVisto() == true) {
                    cont_01++;
                }
                else if (a.isVisto() == false) {
                    cont_02++;
                }
                tot_time = tot_time + a.getMinutos();
            }
            tot = cont_01 + cont_02;
            System.out.println("Te quedan por ver " + (tot - cont_01) + " peliculas");
            System.out.println("Tienes un total de " + tot + " peliculas");
            System.out.println("Tu colección es de " + tot_time + " minutos");
        }

    }

    public static String pedirinformacion(String mensaje) {
        String aux_titulo = null;
        try {
            System.out.println(mensaje);
            aux_titulo = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return aux_titulo;
    }


    /*public static String cadenaNoVacia(String msg) {
        String cadena;
        do{
            cadena = InputData.altaRegistro(msg);
            if (cadena.equals("")) {
                System.out.println("El Campo no puede estar en blanco");
            }
        }while (cadena.equals(""));

        return cadena;
    }*/
}

//exception para no dejar campos en blanco