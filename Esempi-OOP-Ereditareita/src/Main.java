import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Proprietario pp = new Proprietario("Sarder", "Shahriar");
        Automobile fiatPunto = new Automobile("Nero",4,5,true,"fiat",1400,157,6.2,true,pp);
        Automobile diAltri = new Automobile();
        fiatPunto.getAllData();
        System.out.println(diAltri.getColore());
        System.out.println(fiatPunto.getProprietario().getNome());

        Veicolo v1 = new Automobile("Nero",4,5,true,"fiat",1400,157,6.2,true,pp);

        System.out.println(v1.getPassegeri());

    }
}


/**
 * Teoria:
 * super vs this:
 * - Super e un keyword serve per accedere / richiamare a parent class member ( variable and method)
 * - This, is used to call the current class member. ( variable and mathod )
 * - Per aree statiche ( veriable & mathod ) questi due costrutti non possono essere utilizzati
 *
 * Incapsulamento
 * - Incapsulamento si intende quando
 *
 * Overload vs override
 *
 */