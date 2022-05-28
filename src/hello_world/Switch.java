package hello_world;

import java.sql.SQLOutput;

public class Switch {
    public  static void  main(String[] args){
        char myChar = 'E';

        switch(myChar){
            case 'B':
                System.out.println("Sono nel caso B");
                break;
            case 'A':
                System.out.println("Sono nel caso A");
                break;
            case 'E': case 'F': case 'G':
                System.out.println("Sono nel caso E F G");
        }

        String  myString = "FeBBraiO";

        switch(myString.toLowerCase()){
            case "jennaio":
                System.out.println("Sono nel mese di Jen");
                break;
            case "febbraio":
                System.out.println("Sono nel mese di feb");
                break;
        }

    }
}
