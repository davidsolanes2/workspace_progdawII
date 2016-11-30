package UF1.empReformas;

/*
 * Created by dsg on 13/10/16.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class listaCliente implements Serializable {

    private ArrayList<cliente> listaCliente;

    public listaCliente() {
        listaCliente = new ArrayList<>();
    }

    void altaCliente(cliente c) {
        listaCliente.add(c);
    }

    public ArrayList<cliente> getLista() {
        return listaCliente;
    }

    public void setLista(ArrayList<cliente> lista) {
        listaCliente = lista;
    }

    public boolean existe(String telefono) {
        for (cliente c : listaCliente) {
            if (c.getTelefono().equalsIgnoreCase(telefono)) {
                return true;
            }
        }
        return false;
    }

    public cliente obtenerTelefono(String telefono) {
        for (cliente c : listaCliente) {
            if (telefono.equalsIgnoreCase(telefono)) {
                return c;
            }
        }
        return null;
    }

}
