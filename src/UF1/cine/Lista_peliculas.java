package UF1.cine;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Created by dsg on 6/10/16.
 */
public class Lista_peliculas implements Serializable {

    private ArrayList<cine_01>lista;

    public Lista_peliculas() {
       lista = new ArrayList<>();
    }

    public ArrayList<cine_01>getLista() {
        return lista;
    }

    public void setLista(ArrayList<cine_01> lista) {
        this.lista = lista;
    }
}
