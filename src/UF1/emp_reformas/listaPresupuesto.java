package UF1.emp_reformas;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Created by dsg on 13/10/16.
 */

public class listaPresupuesto implements Serializable {

    private ArrayList<presupuesto> lista_p;

    public listaPresupuesto() {
        lista_p = new ArrayList<>();
    }

    public void altaPresupuesto(presupuesto p) {
        lista_p.add(p);
    }

    public ArrayList<presupuesto> getLista_p() {
        return lista_p;
    }

    public void setLista_p(ArrayList<presupuesto> lista_p) {
        this.lista_p = lista_p;
    }

    public boolean existe_p(String codigo) {
        for (presupuesto p : lista_p) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }
}