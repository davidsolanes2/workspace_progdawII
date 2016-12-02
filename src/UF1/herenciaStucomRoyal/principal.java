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
        listaCartas lisc = new listaCartas();
        jugador j1 = new jugador("David", "d4v1d001", 5);
        jugador j2 = new jugador("Julian", "1234567", 4);
        jugador j3 = new jugador("Ivan", "1234567", 6);
        jugador j4 = new jugador("Cristina", "1234567", 7);

        modoTipo mt01 = new modoTipo("guerrero", 4, 65, "tropa", "ataque");
        modoTipo mt02 = new modoTipo("juglar", 4, 4, "estructura", "defensa");
        modoTipo mt03 = new modoTipo("brujo", 3, 55, "hechizo", "ataque");
        modoTipo mt04 = new modoTipo("mago", 5, 85, "hechizo", "defensa");
        modoTipo mt05 = new modoTipo("druida", 3, 35, "hechizo", "defensa");
        modoTipo mt06 = new modoTipo("duende", 3 , 60, "tropa", "ataque");
        modoTipo mt07 = new modoTipo("guerrero", 4, 65, "tropa", "ataque");
        modoTipo mt08 = new modoTipo("juglar", 4, 4, "estructura", "defensa");
        modoTipo mt09 = new modoTipo("brujo", 3, 55, "hechizo", "ataque");
        modoTipo mt10 = new modoTipo("druida", 3, 35, "hechizo", "defensa");
        modoTipo mt11 = new modoTipo("arquero", 2, 55, "tropa", "defensa");
        modoTipo mt12 = new modoTipo("duende", 3 , 60, "tropa", "ataque");
        modoTipo mt13 = new modoTipo("guerrero", 4, 65, "tropa", "ataque");
        modoTipo mt14 = new modoTipo("druida", 3, 35, "hechizo", "defensa");
        modoTipo mt15 = new modoTipo("juglar", 4, 4, "estructura", "defensa");
        modoTipo mt16 = new modoTipo("brujo", 3, 55, "hechizo", "ataque");
        modoTipo mt17 = new modoTipo("arquero", 2, 55, "estructura", "ataque");
        modoTipo mt18 = new modoTipo("guerrero", 4, 65, "tropa", "ataque");
        modoTipo mt19 = new modoTipo("druida", 3, 35, "hechizo", "defensa");
        modoTipo mt20 = new modoTipo("arquero", 2, 55, "estructura", "ataque");
        modoTipo mt21 = new modoTipo("guerrero", 4, 65, "tropa", "ataque");
        modoTipo mt22 = new modoTipo("arquero", 2, 55, "estructura", "ataque");
        modoTipo mt23 = new modoTipo("juglar", 4, 4, "estructura", "defensa");
        modoTipo mt24 = new modoTipo("druida", 3, 35, "hechizo", "defensa");

        listj.getListaJugador().add(j1);
        listj.getListaJugador().add(j2);
        listj.getListaJugador().add(j3);
        listj.getListaJugador().add(j4);

        lisc.getListaCartas().add(mt01);
        lisc.getListaCartas().add(mt02);
        lisc.getListaCartas().add(mt03);
        lisc.getListaCartas().add(mt04);
        lisc.getListaCartas().add(mt05);
        lisc.getListaCartas().add(mt06);
        lisc.getListaCartas().add(mt07);
        lisc.getListaCartas().add(mt08);
        lisc.getListaCartas().add(mt09);
        lisc.getListaCartas().add(mt10);
        lisc.getListaCartas().add(mt11);
        lisc.getListaCartas().add(mt12);
        lisc.getListaCartas().add(mt13);
        lisc.getListaCartas().add(mt14);
        lisc.getListaCartas().add(mt15);
        lisc.getListaCartas().add(mt16);
        lisc.getListaCartas().add(mt17);
        lisc.getListaCartas().add(mt18);
        lisc.getListaCartas().add(mt19);
        lisc.getListaCartas().add(mt20);
        lisc.getListaCartas().add(mt21);
        lisc.getListaCartas().add(mt22);
        lisc.getListaCartas().add(mt23);
        lisc.getListaCartas().add(mt24);

        miFichero.grabar(miJuego);

    }
}
