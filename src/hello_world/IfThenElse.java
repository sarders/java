package hello_world;

public class IfThenElse {
    public static void main(String[] args){
        /**
         * Si consiglia di utilizzare le forma abbreviata per le condizioni del tipo:
         * if(isCar == true)        ->  if(iscar)
         * if(isCar == false)       ->  if(!isCar)
         */


        boolean falseBoolean = false;
        // Operatore and
        if ((falseBoolean == false) && (1 == 1)){
            System.out.println("Sono entrato nell'if statement.");
        }

        // Orepatore or
        if ((falseBoolean == false) || (1 == 3)){
            System.out.println("Sono entrato nell'if statement.");
        }

        boolean isCar = false;
        /**
         * Attenzione a questo errore, quand sto assegnando true a isCar.
         * la scrittura corretta dovrebbe essere isCar == true
         */
        if(isCar = true){
            System.out.println("Questa espressione è vera perche viene assegnato true alla variabile" +
                    "e quindi la condizione diventa true ");
            isCar = false;
        }

        if(!isCar){
            System.out.println("Si ci entro. ");
        }


        int x = 500;

        if(x > 100)
        {
            System.out.println("prima condizione.");
        } else if (x > 101) {
            System.out.println("Seconda condizione.");
        }else{
            System.out.println("nessuna");
        }



    }
}
