package UF1.herenciaStucomRoyal;

/*
 * Created by david on 24/11/16.
 */

import java.io.Serializable;

public class cartas implements Serializable {

    private String nombre;
    private int elixir;
    private int vida;

    public cartas() {}

    public cartas(String nombre, int elixir, int vida) {
        this.nombre = nombre;
        this.elixir = elixir;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "cartas{" +
                "nombre='" + nombre + '\'' +
                ", elixir=" + elixir +
                ", vida=" + vida +
                '}';
    }
}