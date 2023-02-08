package org.generation.italy.bank.model;
import java.time.LocalDate
import java.time.Period;

public class Client {
    private long id;
    private String name;
    private String lastName;
    private LocalDate birthdate;
    private char sex;

    public String getFullName() {
        return name+ " "+lastName;
    }
   public String getFullNameSB(){
   StringBuilder sb = new StringBuilder(name).append(" ").append(lastName);
   return sb.toString();
   }
   public int getAge() {
        return 0;
   }

    public long getId() {
        return id;
    }




}
