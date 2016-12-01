package UF1.herenciaStucomRoyal;

/*
 * Created by david on 24/11/16.
 */

public class jugador {
    private String nombreJugador;
    private String password;
    private Integer trofeos;


    public jugador(String nombreJugador, String password, Integer trofeos) {
        this.nombreJugador = nombreJugador;
        this.password = password;
        this.trofeos = trofeos;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(Integer trofeos) {
        this.trofeos = trofeos;
    }

    @Override
    public String toString() {
        return "jugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", password='" + password + '\'' +
                ", trofeos=" + trofeos +
                '}';
    }

}
