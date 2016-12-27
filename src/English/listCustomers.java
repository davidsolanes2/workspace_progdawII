package English;

/*
 * Created by david on 20/12/16.
 */

import java.io.Serializable;
import java.util.ArrayList;

public class listCustomers implements Serializable {

    private ArrayList<Bank> listCustomers;

    public listCustomers() { listCustomers = new ArrayList<>(); }

    void registerCustomer(Bank b) {listCustomers.add(b); }

    public ArrayList<Bank> getListCustomers() { return listCustomers; }

    public void setListCustomers(ArrayList<Bank> list) { listCustomers = list;}

    public boolean exist(String email) {
        for (Bank b : listCustomers) {
            if (b.getEmail().equalsIgnoreCase(email)) {
                return true;
            }
        }
        return false;
    }



}
