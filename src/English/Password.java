package English;

/**
 * Created by david on 27/12/16.
 */
public class Password {
    private int logitude = 8;
    private String password="";

    Password () {}

    public int getLogitude() {
        return logitude;
    }

    public void setLogitude ( int logitude) {}

    String getPassword() { return password; }

    public Password (int logitude, String password) {
        this.logitude = logitude;
        this.password = password;
    }

    public void generatePassword() {
        String range ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String passwd ="";

        for (int i = 0; i<this.logitude; i++ ) {
            int number = (int) (Math.random()*range.length());
            passwd += range.substring(number, number+1);
        }
        this.password=passwd;
    }
}
