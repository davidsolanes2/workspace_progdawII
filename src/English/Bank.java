package English;

/*
 * Created by david on 22/11/16.
 */

import java.io.Serializable;

public class Bank implements Serializable{

    private String account;
    private double balance = 0.00;
    private String name;
    private String email;
    private String phone;

    public Bank() {}

    public Bank(String account, double balance, String name, String email, String phone) {
        this.account = account;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "account='" + account + '\'' +
                ", balance=" + balance +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
