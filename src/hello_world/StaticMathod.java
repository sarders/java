package hello_world;

/**
 * Quando un metodo non usa instance variable, quel metodo probabilmente deve essere
 * iniziallizato Static;
 *
 * main è un metodo statico.
 */
class Calcolatrice {
    public static void printSum(int a , int b){
        System.out.println(a+b);
    }
}

public class StaticMathod {
    public static void main(String[] args){
        // trattadosi di un Metodo Statico non è necessario preare un'istanza
        //Calcolatrice.printSum(1,2);
        Calcolatrice cc = new Calcolatrice();
        cc.printSum(1,2);
    }
}
