package UF1.herenciaStucomRoyal;

/*
 * Created by david on 1/12/16.
 */


import java.io.Serializable;

public class modoTipo extends tipoCartas implements Serializable {

    private String modo;

    public modoTipo(String nombre, int elixir, int vida, String tipo, String modo) {
        super(nombre, elixir, vida, tipo);
        this.modo = modo;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    @Override
    public String toString() {
        return "modoTipo{" +
                "modo=" + modo +
                '}';
    }
}
