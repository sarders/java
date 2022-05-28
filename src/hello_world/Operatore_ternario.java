package hello_world;

public class Operatore_ternario {

    public static void main(String[] args){
        boolean isCar = true;
        //               condizoone ? assegna val true : altrimenti assegna false
        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        wasCar = (isCar && 1 == 1) ? true : false;
        System.out.println(wasCar);
        /**
         * inverso true e flase
         */
        wasCar = (isCar && 1 == 1) ? false : true;
        System.out.println(wasCar);

    }
}
