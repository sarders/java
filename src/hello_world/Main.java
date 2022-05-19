package hello_world;

public class Main {
    /*
    *   public: is an access modifier.
    *   static: we have to jave static for java to find our mathod.
    *   void: the method dident return any information.
    *
    **/
    public static void main(String[] args) {
        System.out.println("Hello\nworld!");
        /* Viene svolto prima la moltipicazione */
        int myFirstInt = 1 + 10 * 5;
        System.out.println(myFirstInt);

        int meno5 = myFirstInt - 5;
        System.out.println(meno5);

    }
}