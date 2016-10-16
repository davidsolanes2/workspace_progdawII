package UF1.emp_reformas;

import java.io.Serializable;
import java.util.ArrayList;

/*
 * Created by dsg on 13/10/16.
 */

public class Lista_presupuesto  implements Serializable {

    private ArrayList<presupuesto> lista_p;

    public Lista_presupuesto() {
        lista_p = new ArrayList<>();
    }

    public void altaPresupuesto(presupuesto p) {
        lista_p.add(p);
    }

}