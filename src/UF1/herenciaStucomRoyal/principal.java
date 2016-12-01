package UF1.herenciaStucomRoyal;

/*
 * Created by david on 1/12/16.
 */

public class principal {

    private static fichero miFichero;
    private static listaJugador miJuego;

    public static void main(String[] args) {

        miFichero = new fichero("juego.xml");
        miJuego =(listaJugador) miFichero.read();
        if (miJuego == null) {
            miJuego = new listaJugador();
        }

        listaJugador listj = new listaJugador();
        jugador j1 = new jugador("David", "d4v1d001", 5);
        cartas c1 = new cartas("brujo", 1 , 50);
        cartas c2 = new cartas("duende", 3 , 60);
        cartas c3 = new cartas("arquero", 4, 65);
        cartas c4 = new cartas("guerrero", 4,65);
        cartas c5 = new cartas("mago", 3, 75);
        cartas c6 = new cartas("druida", 2, 80);
        jugador j2 = new jugador("Julian", "1234567", 4);
        cartas c7 = new cartas("arquero", 2, 55);
        cartas c8 = new cartas("juglar", 4, 45);
        cartas c9 = new cartas("duende", 4, 45);
        cartas c10 = new cartas("druida", 3, 35);
        cartas c11 = new cartas("mago", 5, 85);
        cartas c12 = new cartas("brujo", 3, 55);
        jugador j3 = new jugador("Ivan", "1234567", 6);
        cartas c13 = new cartas("brujo", 1 , 50);
        cartas c14 = new cartas("duende", 3 , 60);
        cartas c15 = new cartas("arquero", 4, 65);
        cartas c16 = new cartas("mago", 3, 75);
        cartas c17 = new cartas("druida", 3, 35);
        cartas c18 = new cartas("guerrero", 4,65);
        jugador j4 = new jugador("Cristina", "1234567", 7);
        cartas c19 = new cartas("juglar", 4, 45);
        cartas c20 = new cartas("brujo", 3, 55);
        cartas c21 = new cartas("mago", 5, 85);
        cartas c22 = new cartas("guerrero", 4,65);
        cartas c23 = new cartas("duende", 3 , 60);
        cartas c24 = new cartas("druida", 3, 35);

        listj.getListaJugador().add(j1);
        listj.getListaJugador().add(j2);
        listj.getListaJugador().add(j3);
        listj.getListaJugador().add(j4);

        miJuego.altaJugador(j1);
        miJuego.altaJugador(j2);
        miJuego.altaJugador(j3);
        miJuego.altaJugador(j4);





        miFichero.grabar(miJuego);

    }
}
