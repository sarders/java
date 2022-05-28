package hello_world;

public class SpeedConverter {

    public static void main(String[] args){
        System.out.println(toMilesPerHour(75));
    }
    // write your code here
    public static long toMilesPerHour(double kilometersPerHour){
        long ritono = 0L;
        if(kilometersPerHour < 0) {
             ritono = -1L;
         }else{
            ritono = (long)Math.round((kilometersPerHour / 1.609));
        }
        return ritono;

    }
}
