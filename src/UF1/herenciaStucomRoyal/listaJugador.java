package UF1.herenciaStucomRoyal;

/*
 * Created by david on 24/11/16.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class listaJugador implements Serializable {

    private ArrayList<jugador> listaJugador;

    public listaJugador() { listaJugador = new ArrayList<>(); }

    //void altaJugador(jugador j) { listaJugador.add(j); }

    public ArrayList<jugador> getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(ArrayList<jugador> listaJugador) {
        this.listaJugador = listaJugador;
    }

    public  boolean existe_01(String nom_01, String pass_01) {
        for (jugador j : listaJugador) {
            if (j.getNombreJugador().equalsIgnoreCase(nom_01) && j.getPassword().equalsIgnoreCase(pass_01)) {
                return true;
            }
        }
        return false;
    }

}
