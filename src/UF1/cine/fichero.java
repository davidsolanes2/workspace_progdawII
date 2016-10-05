package UF1.cine;

/*
 * Created by dsg on 5/10/16.
 */

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fichero {

    private String nombre;

    public fichero(String nombre) {
        this.nombre = nombre;
    }

    public void grabar (Object o) {
        try {
            XMLEncoder codificador = new XMLEncoder(new FileOutputStream(new File(nombre)));
        } catch (FileNotFoundException ex) {
            System.out.println("Error no se ha podido grabar: " + ex.getMessage());
        }
    }
}
