package UF1.herenciaStucomRoyal;

/*
 * Created by david on 1/12/16.
 */

import java.util.Arrays;

public class tipoCartas extends cartas {

    private String tipo;

    public tipoCartas(String nombre, int elixir, int vida, String tipo) {
        super(nombre, elixir, vida);
        this.tipo = tipo;
    }

    public tipoCartas(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "tipoCartas{" +
                "tipo=" + tipo +
                '}';
    }
}
