package English;

/*
 * Created by dsg on 5/10/16.
 */

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class file {

    private String nombre;

    public file(String nombre) {
        this.nombre = nombre;
    }

    public void grabar (Object o) {
        try {
            XMLEncoder codificador = new XMLEncoder(new FileOutputStream(new File(nombre)));

            codificador.writeObject(o);
            codificador.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Error it's not possible to write " + ex.getMessage());
        }
    }

    public Object read() {
        try {
            XMLDecoder decodificador = new XMLDecoder(new FileInputStream(new File(nombre)));
            return decodificador.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("The file not exist");
            return null;
        }
    }

}
