package bank;
import bank.model.Account; //senza non troverà la nostra classe Account
public class Start{
    public static void main(String[] args){//questo main non appartiene a nessuno oggetto, è la main di start quindi static
        Account x = new Account();//invoco il costruttore della classe
        //sopra variabile di TIPO Account che mi passa l'INDIRIZZO dell'oggetto Account
        //int x = 3; //variabile di tipo intera che vale 3
        //String s = "Pippo";
        System.out.println(x.balance);
        System.out.println(x.client);
        System.out.println(x.openDate);
        double newBalance = x.deposit(1000.0);

        System.out.println(x.balance);
    }

}