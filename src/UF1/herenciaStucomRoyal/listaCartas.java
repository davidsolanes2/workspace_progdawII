package UF1.herenciaStucomRoyal;

/*
 * Created by david on 1/12/16.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class listaCartas implements Serializable {

        private ArrayList<modoTipo> listaCartas;

        public listaCartas() { listaCartas = new ArrayList<>(); }

        //void altaCartas (modoTipo mT) { listaCartas.add(mT); }

        public ArrayList<modoTipo> getListaCartas() {return listaCartas; }

        public void setListaCartas(ArrayList<modoTipo> listaCartas) {
                this.listaCartas = listaCartas;
        }

}
