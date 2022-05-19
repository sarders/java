package variabili;

/**
 *
 *   Titolo: vediamo le primitive.
 *   Q: Quali sono le primitive?
 *   A: Le 8 primitive in Java sono:
 *
 *   Q: cosa e un Wrapper class?
 *   A: Ogni primitivo in java ha il suo Wrapper class.
 *
 *   Le 8 primitive di java:
 *       Topo        n.biy        min         |           max         |       Wrapper Class
 *   ------------------------------------------------------------------------------------------
 *       boolean     1 bit       1                      1                   Boolean
 *
 *       byte        8 bit      -128                    127                 Byte
 *       short       16 bit     -32768                  32767
 *       int         32 bit     -2147483648             2147483647          Intheger
 *       long        64 bit     -9223372036854775808    9223372036854775807 Long
 *
 *       float       32 bit
 *       dauble      64 bit
 *
 *       char        16 bit
 *
**/

public class main {
    /**
     * il metodo main dove parte il tutto
     */

    public static void main(String[] args){


        /**********************************************************
         *  Byte
         **********************************************************/
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Il minimo valore di Byte = " + minByte);
        System.out.println("Il massimo valore di Byte= " + maxByte);



        /**********************************************************
         *  Short
         **********************************************************/
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Il minimo valore di Short = " + minShort);
        System.out.println("Il massimo valore di Short = " + maxShort);



        /**********************************************************
         *  Integer
         **********************************************************/

        int varInt = 10000;
        int intMinValue = Integer.MIN_VALUE;        //  = -2147483648
        int intMaxValue = Integer.MAX_VALUE;        //  = 2147483647

        System.out.println("Intheger Minimum value = " + intMinValue);
        System.out.println("Intheger Maximum value = " + intMaxValue);

        /**
         * Aggiungendo + 1 al valore massimo ricevo il valore minimo.
         */

        /**
         *   Overflow
         *   Questa espressione mi restituisce -2147483648.
         */
        System.out.println("Buster Intheger Maximum value = " + (intMaxValue + 1 ));

        /**
         *   Underflow
         *   Il valore di questa espressione è 2147483647.
         */

        System.out.println("Buster Intheger Minimum value = " + (intMinValue - 1 ));

        /**
         *   java fornisce adeguati datatyper per gestire questo genere di problematiche.
         */

        /**
         * int overflowInt = 2147483648;
         * Questa espressione restituisce l'errore: java: integer number too large
         *
         */

        /**
         * L'assegnazione del valore di una variabile int puo essere eseguito anche come segue:
         * int esempioAssegnazione = 2_147_483_647;
         */
        int esempioAssegnazione = 2_147_483_647;
        System.out.println("stampo valore di esempioAssegnazione = " + esempioAssegnazione);

        /**********************************************************
         *  Long
         **********************************************************/

        long provaAssengazionelong = 100000L;
        System.out.println("provaAssengazionelong = " + provaAssengazionelong);

        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Long.MAX_VALUE =" + maxLong);
        System.out.println("Long.MIN_VALUE; =" + minLong);

    }

}
