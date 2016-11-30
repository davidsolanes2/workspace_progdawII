package UF1.empCoches;

/*
 * Created by david on 10/11/16.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class listaCoches implements Serializable {

    private ArrayList<vehiculos> listaCoches;

    public listaCoches() { listaCoches = new ArrayList<>(); }

    void altaVehiculos( vehiculos v) { listaCoches.add(v);}

    public ArrayList<vehiculos> getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(ArrayList<vehiculos> listaCoches) {
        this.listaCoches = listaCoches;
    }

    public boolean existe(String matricula) {
        for (vehiculos v : listaCoches) {
            if (v.getMatricula().equalsIgnoreCase(matricula)) {
                return true;
            }
        }
        return false;
    }

    public vehiculos obtenerMatricula(String matricula) {
        for (vehiculos v : listaCoches) {
            if (matricula.equalsIgnoreCase(matricula)) {
                return v;
            }
        }
        return null;
    }

}
