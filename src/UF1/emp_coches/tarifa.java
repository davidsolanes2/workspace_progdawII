package UF1.emp_coches;

/*
 * Created by david on 13/11/16.
 */

public class tarifa extends descripcion {

    private  Double pvpA; //precio base de 50.00
    private  Double pvpB; //precio pax/dia de 1.50
    private  Double pvpC; //precio pax de 2.00 Microbus
    private  Double pvpD; //precio de 20.00 * pma

    public tarifa(int pax, int pma, String matricula, String tipo, Double pvpA, Double pvpB, Double pvpC, Double pvpD) {
        super(pax, pma, matricula, tipo);
        this.pvpA = pvpA;
        this.pvpB = pvpB;
        this.pvpC = pvpC;
        this.pvpD = pvpD;
    }

    public Double getPvpA() {
        return pvpA;
    }

    public void setPvpA(Double pvpA) {
        this.pvpA = pvpA;
    }

    public Double getPvpB() {
        return pvpB;
    }

    public void setPvpB(Double pvpB) {
        this.pvpB = pvpB;
    }

    public Double getPvpC() {
        return pvpC;
    }

    public void setPvpC(Double pvpC) {
        this.pvpC = pvpC;
    }

    public Double getPvpD() {
        return pvpD;
    }

    public void setPvpD(Double pvpD) {
        this.pvpD = pvpD;
    }
}
