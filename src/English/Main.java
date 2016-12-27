package English;

/*
 * Created by david on 22/11/16.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    private static file myFile;
    private static listCustomers myCustomers;

    public static void main (String[] args) {
        myFile = new file("customer.xml");
        myCustomers = (listCustomers) myFile.read();

        if (myCustomers == null) {
            myCustomers = new listCustomers();
        }

        boolean error;
        int option = 0;

        do try {
            while (option != 8) {
                option = menu_bank.menu();
                switch (option) {
                    case 1:
                        registerCustomer(); //registro del cliente, comprobar que no este dado de alta
                        break;
                    case 2:
                        //preguntara primero el password del cliente
                        break;
                    case 3:
                        //preguntara primero el password del cliente
                        break;
                    case 4:
                        //preguntara primero el password del cliente
                        break;
                    case 5:
                        //preguntara primero el password del cliente
                        break;
                    case 6:
                        //preguntara primero el password del cliente
                        break;
                    case 8:
                        System.out.println("\nClosing the system");
                        break;
                    default:
                        System.out.println("\nYou haven't entered an integer");
                        error = false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            error = false;
        } catch (NumberFormatException ex) {
            System.out.println("\n");
        }while(true && option != 8);
    }

    public static void registerCustomer() {

        boolean exist = false;

        String aux = InputData.pedirCadena("Email : ");

        if (myCustomers.exist(aux)) {
            System.out.println("This customer is already registred");
        } else {
            String name = InputData.pedirCadena("Name   : ");
            String phone = InputData.pedirCadena("Phone : ");
            String email = aux;
            double balance = 0.00;

            Password password_02 = new Password();

            password_02.generatePassword();
            String account = password_02.getPassword();

            Bank b = new Bank(account, balance, name, phone, email);
            myCustomers.registerCustomer(b);
            myFile.grabar(myCustomers);
        }
    }





    private static class menu_bank {
        static int menu() throws IOException {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            int opcio;
            System.out.println("\n\t             WITHDRAW                      ");
            System.out.println("-----------------------------------------------");
            System.out.println("\t1.- Register a Customer             ");
            System.out.println("\t2.- Deposit money into the account  ");
            System.out.println("\t3.- Withdraw money from the account ");
            System.out.println("\t4.- Balance of your account         ");
            System.out.println("\t5.- Account statement               ");
            System.out.println("\t6.- Transfer                        ");
            System.out.println("\t7.-                                 ");
            System.out.println("\t8.- Log out                       \n");
            System.out.print("Select an option : ");
            opcio = Integer.parseInt(buffer.readLine());

            return opcio;
        }
    }


}
