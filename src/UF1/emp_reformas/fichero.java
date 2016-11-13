package UF1.emp_reformas;

/*
 * Created by dsg on 5/10/16.
 */

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
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
            codificador.writeObject(o);
            codificador.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error no se ha podido grabar: " + ex.getMessage());
        }
    }

    public Object read() {
        try {
            XMLDecoder decodificador = new XMLDecoder(new FileInputStream(new File(nombre)));
            return decodificador.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("El fichero no existe");
            return null;
        }
    }

}
