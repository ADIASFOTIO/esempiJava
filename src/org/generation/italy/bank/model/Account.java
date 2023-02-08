package org.generation.italy.bank.model; //essiste una directory banca, con un altra dentro model dove si trova questa classe
import java.time.LocalDate;

public class Account {  ///programmando un oggetto account
    protected double balance;
    private LocalDate openDate;
    private String client;

    public Account() {
        this(1000, LocalDate.now(), "anonimo");
        //  balance = 1000;
        //  openDate = LocalDate.now();
        //   client = "anonimo";
    }

    public Account(double b, LocalDate ld, String clientName) {
        balance = b;
        openDate = ld;
        client = clientName;
    }

    public Account(double c, LocalDate locD) {
        this(c, locD, "anonimo");
        //balance = c;
        //  openDate = locD;
        //  client = "anonimo";
    }

    public double getBalance(){

        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public double deposit(double amount) { //public static : static si mette con la progr non a ogg
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

}