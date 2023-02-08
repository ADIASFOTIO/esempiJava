package org.generation.italy.bank.model;

import java.time.LocalDate;

public class CaymanAccount extends Account {  // classe figlia della private String secreCode;

  private String secretCode;
  public CaymanAccount(){

  }
  // costruttore della classe madre ma lo posso uare nella classe figlia
  public CaymanAccount(double bal, LocalDate od, String cn, String secretCode){
    super(bal, od, cn);
    this.secretCode = secretCode;
  }

    public void evadeTax(){
       // balance += 1000;
    }
}
