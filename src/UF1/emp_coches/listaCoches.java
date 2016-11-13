package UF1.emp_coches;

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

}
