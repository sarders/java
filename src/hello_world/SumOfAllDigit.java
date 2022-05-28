package hello_world;

public class SumOfAllDigit {

    public static void main(String[] args){
        SumOfAllDigit so = new SumOfAllDigit();
        so.sommaditutto(888);
    }

    public void sommaditutto(int i){
        int somma = 0;

        if(i < 0) {
            System.out.println("-1");
        }
        else
        {
            while (i > 0 ){
                int temp = 0;
                temp =  i % 10;
                somma = somma + temp;
                i = i / 10;
            }
        }

        System.out.println("Somma di tutto è "+ somma);

    }

}

