package UF1.emp_reformas;

/*
 * Created by dsg on 13/10/16.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class listaCliente implements Serializable {

    private ArrayList<cliente> lista;

    public listaCliente() {
        lista = new ArrayList<>();
    }

    public void altaCliente(cliente c) {
        lista.add(c);
    }

    public boolean existe(cliente c) {
        for (cliente aux : lista) {
            if (c.getTelefono().equalsIgnoreCase(aux.getTelefono())) {
                return true;
            }
        }
        return  false;
    }

    public ArrayList<cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<cliente> lista) {
        this.lista = lista;
    }


}
