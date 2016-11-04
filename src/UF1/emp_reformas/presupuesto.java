package UF1.emp_reformas;

import java.io.Serializable;

/*
 * Created by dsg on 13/10/16.
 */
public class presupuesto implements Serializable {

    private String codigo;
    private String concepto;
    private double precio_tot;
    private String estado;


    public presupuesto() {

    }

    public presupuesto(String codigo, String concepto, double precio_tot, String estado) {
        this.codigo = codigo;
        this.concepto = concepto;
        this.precio_tot = precio_tot;
        this.estado = estado;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getPrecio_tot() {
        return precio_tot;
    }

    public void setPrecio_tot(double precio_tot) {
        this.precio_tot = precio_tot;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



    @Override
    public String toString() {
        return "presupuesto{" +
                "codigo='" + codigo + '\'' +
                ", concepto='" + concepto + '\'' +
                ", precio_tot=" + precio_tot +
                ", estado='" + estado + '\'' +
                '}';
    }
}
