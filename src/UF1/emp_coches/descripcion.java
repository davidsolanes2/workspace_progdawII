package UF1.emp_coches;

/*
 * Created by david on 13/11/16.
 */


public class descripcion extends vehiculos{

    private int pax;
    private int pma;

    public descripcion(int pax, int pma, String matricula, String tipo) {
        super(matricula, tipo);
        this.pax = pax;
        this.pma = pma;
    }

    public int getPax() {
        return pax;
    }

    public void setPax(int pax) {
        this.pax = pax;
    }

    public int getPma() {
        return pma;
    }

    public void setPma(int pma) {
        this.pma = pma;
    }
}
