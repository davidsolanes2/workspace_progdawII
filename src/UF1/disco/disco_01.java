package UF1.disco;

import java.util.ArrayList;

/*
 * Created by dsg on 16/09/16.
 */

public class disco_01 {

    private String titulo="";
    private String grupo="";
    private int temas=0;
    private double duracion=0.00;

    disco_01() {}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getTemas() {
        return temas;
    }

    public void setTemas(int temas) {
        this.temas = temas;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }



    ArrayList <disco_01> Infodisco = new ArrayList<disco_01> ();

    public disco_01(String titulo, String grupo, int temas, double duracion) {
        this.titulo = titulo;
        this.grupo = grupo;
        this.temas = temas;
        this.duracion = duracion;
    }


}







