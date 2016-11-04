package UF1.emp_reformas;

/*
 * Created by dsg on 13/10/16.
 */

import java.io.Serializable;

public class cliente implements Serializable{
    private String nombre;
    private String apellido;
    private String telefono;
    private boolean vip;
    private listaPresupuesto lista;

    public cliente() {

    }

    public cliente(String nombre, String apellido, String telefono, boolean vip) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.vip = vip;
        this.lista = new listaPresupuesto();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isVip() { return vip;}

    public void setVip(boolean vip) { this.vip = vip; }

    public listaPresupuesto getLista() {
        return lista;
    }

    public void setLista(listaPresupuesto lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String texto = "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", vip=" + vip +
                '}';
        texto += vip? "SI" : "NO";
        return texto;
    }
}
