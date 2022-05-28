package hello_world;

public class MegaBytesConverter {

    public static void main(String[] args){
        MegaBytesConverter mb = new MegaBytesConverter();
        mb.printMegaBytesAndKiloBytes(1024);
    }

    public void printMegaBytesAndKiloBytes(int kiloBytes){
        int YY, ZZ = 0;
        if (kiloBytes <0 ){
            System.out.println("Invalid Value");
        }
        else{
            ZZ = kiloBytes % 1024;
            YY = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = "+ YY + " MB and " + ZZ + " KB");
        }
    }

}