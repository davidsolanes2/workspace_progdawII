package UF1.empCoches;

/*
 * Created by david on 13/11/16.
 */

public class tarifa extends descripcion {

    private  Double pvpA; //precio base de 50.00
    private  Double pvpB; //precio pax/dia de 1.50
    private  Double pvpC; //precio pax de 2.00 Microbus
    private  Double pvpD; //precio de 20.00 * pma
    private  Double pvpF; //precio de 40.00

    public tarifa(int pax, int pma, String matricula, String tipo, Double pvpA, Double pvpB, Double pvpC, Double pvpD, Double pvpF) {
        super(pax, pma, matricula, tipo);
        this.pvpA = 50.00;
        this.pvpB = 1.50;
        this.pvpC = 2.00;
        this.pvpD = 20.00;
        this.pvpF = 40.00;
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

    public Double getPvpF() {
        return pvpF;
    }

    public void setPvpF(Double pvpF) {
        this.pvpF = pvpF;
    }
}
