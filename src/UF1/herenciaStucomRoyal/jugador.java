package UF1.herenciaStucomRoyal;

/*
 * Created by david on 24/11/16.
 */

public class jugador {
    private String nombreJugador;
    private String password;
    private Integer trofeos;
    private listaCartas listaCartas;

    public jugador() {}

    public jugador(String nombreJugador, String password, Integer trofeos) {
        this.nombreJugador = nombreJugador;
        this.password = password;
        this.trofeos = trofeos;
        this.listaCartas = new listaCartas();
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

    public UF1.herenciaStucomRoyal.listaCartas getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(UF1.herenciaStucomRoyal.listaCartas listaCartas) {
        this.listaCartas = listaCartas;
    }

    @Override
    public String toString() {
        return "jugador{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", password='" + password + '\'' +
                ", trofeos=" + trofeos +
                ", listaCartas=" + listaCartas +
                '}';
    }
}
