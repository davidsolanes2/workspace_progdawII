package UF1.herenciaStucomRoyal;

/*
 * Created by david on 24/11/16.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class listaJugador implements Serializable {

    private ArrayList<jugador> listaJugador;

    public listaJugador() { listaJugador = new ArrayList<>(); }

    void altaJugador(jugador j) { listaJugador.add(j); }

    public ArrayList<jugador> getListaJugador() {
        return listaJugador;
    }
}
