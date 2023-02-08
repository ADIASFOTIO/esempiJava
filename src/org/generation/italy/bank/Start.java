package org.generation.italy.bank;

import org.generation.italy.bank.model.Account;
import org.generation.italy.bank.model.CaymanAccount;
import org.generation.italy.bank.model.special.SpecialAccount;

import java.time.LocalDate;


public class Start {
    public static void main(String[] args) {//questo main non appartiene a nessuno oggetto, è la main di start quindi static
        Account x = new Account();//invoco il costruttore della classe
        //sopra variabile di TIPO Account che mi passa l'INDIRIZZO dell'oggetto Account
        //int x = 3; //variabile di tipo intera che vale 3
        //String s = "Pippo";
        System.out.println(x.getBalance());
        //System.out.println(x.client);
        //System.out.println(x.openDate);

        double newBalance = x.deposit(1000.0);

        // System.out.println(x.balance);

        Account a2 = new Account(2500, LocalDate.of(2023, 1, 20),
                "Piero rossi");
        CaymanAccount ca = new CaymanAccount();
        // System.out.println(ca.balance);
        ca.deposit(10000);
        ca.evadeTax();
        Account[] acs = new Account[10];
    }

    public static void handleAccounts(Account[] acs) {
        for (int i = 0, i<acs.length, i++){
            if (acs[ì].getBalance() > 10000) {
                acs[i].withdraw(10);
            }
        }

    }

}