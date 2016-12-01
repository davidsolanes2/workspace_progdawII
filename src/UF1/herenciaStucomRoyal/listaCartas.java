package UF1.herenciaStucomRoyal;

/*
 * Created by david on 1/12/16.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class listaCartas implements Serializable {

        private ArrayList<cartas> listaCartas;

        public listaCartas() { listaCartas = new ArrayList<>(); }

        void altaCartas (cartas c) { listaCartas.add(c); }

        public ArrayList<cartas> getListaCartas() {return listaCartas; }

}
