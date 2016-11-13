package UF1.cine;

/*
 * Created by dsg on 22/09/16.
 */

import java.io.*;

public class cine_01 implements Serializable {

    private String codigo;
    private String titulo;
    private String director;
    private int minutos;
    private String genero;
    private int valoracion;
    private boolean visto = false;

    public cine_01() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = false;
    }

    public cine_01(String codigo, String titulo, String director, int minutos, String genero, int valoracion, boolean visto) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.minutos = minutos;
        this.genero = genero;
        this.valoracion = valoracion;
        this.visto = visto;
    }

    @Override
    public String toString() {
        String texto = "Peliculas{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", minutos=" + minutos +
                ", genero='" + genero + '\'' +
                ", valoracion=" + valoracion +
                '}';

        /*if (visto) {
            texto += "VISTA";
        }
        else {
            texto += " POR VER";
        }*/

        texto += visto ? "VISTA" : "POR VER";
        return texto;
    }

}
