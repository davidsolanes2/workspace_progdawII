package UF1.herenciaStucomRoyal;

/*
 * Created by david on 24/11/16.
 */

public class cartas {

    private String nombre;
    private Integer exilir;
    private Integer vida;

    public cartas(String nombre, Integer exilir, Integer vida) {
        this.nombre = nombre;
        this.exilir = exilir;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getExilir() {
        return exilir;
    }

    public void setExilir(Integer exilir) {
        this.exilir = exilir;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "cartas{" +
                "nombre='" + nombre + '\'' +
                ", exilir=" + exilir +
                ", vida=" + vida +
                '}';
    }

}
