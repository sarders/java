public class Automobile extends Veicolo{
    private String marca;
    private int cilindrata;
    private int velocitaMassima;
    private double consumoPerCentoKM;
    private boolean neopatentato;

    private Proprietario proprietario;

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public void getAllData(){
        System.out.println( getColore());
    }

    public Automobile() {

    }



    public Automobile(String colore,
                      int ruote,
                      int passegeri,
                      boolean patente,
                      String marca,
                      int cilindrata,
                      int velocitaMassima,
                      double consumoPerCentoKM,
                      boolean neopatentato,
                      Proprietario proprietario){
        super(colore, ruote, passegeri, patente);
        this.marca = marca;
        this.cilindrata = cilindrata;
        this.velocitaMassima = velocitaMassima;
        this.consumoPerCentoKM = consumoPerCentoKM;
        this.neopatentato = neopatentato;
        this.proprietario = proprietario;
    }


    /**
     * getter e setter
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getVelocitaMassima() {
        return velocitaMassima;
    }

    public void setVelocitaMassima(int velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
    }

    public double getConsumoPerCentoKM() {
        return consumoPerCentoKM;
    }

    public void setConsumoPerCentoKM(double consumoPerCentoKM) {
        this.consumoPerCentoKM = consumoPerCentoKM;
    }

    public boolean isNeopatentato() {
        return neopatentato;
    }

    public void setNeopatentato(boolean neopatentato) {
        this.neopatentato = neopatentato;
    }
}
