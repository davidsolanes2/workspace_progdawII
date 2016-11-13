package UF1.emp_coches;

/*
 * Created by david on 13/11/16.
 */

import java.io.Serializable;

public class vehiculos implements Serializable{
    private String matricula;
    private String tipo;

    public vehiculos(){}

    public vehiculos(String matricula, String tipo) {
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "vehiculos{" +
                "matricula='" + matricula + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
