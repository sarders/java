/**
 * Questa è la super classe;
 */
public class Veicolo {

    /**
     * Definizione delle variabili;
     */
    private String colore;
    private int ruote;
    private int passegeri;
    private boolean patente;

    /**
     * Costruttori:
     * é una buona norma avere un unico costruttore che valorizza i campi.
     */
    public Veicolo() {
        this("Nessun valore", 0, 0 , false);
    }

    public Veicolo(String colore, int ruote) {
        this(colore,ruote,0,false);
    }

    public Veicolo(String colore, int ruote, int passegeri) {
        this(colore,ruote,ruote,false);
    }

    public Veicolo(String colore, int ruote, int passegeri, boolean patente) {
        this.colore = colore;
        this.ruote = ruote;
        this.passegeri = passegeri;
        this.patente = patente;
    }

    /**
     * Qui ci sono i getter e setter;
     *
     */
    public String getColore() {
        return "Classe veicolo: " + colore ;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public int getRuote() {
        return ruote;
    }

    public void setRuote(int ruote) {
        this.ruote = ruote;
    }

    public int getPassegeri() {
        return passegeri;
    }

    public void setPassegeri(int passegeri) {
        this.passegeri = passegeri;
    }

    public boolean isPatente() {
        return patente;
    }

    public void setPatente(boolean patente) {
        this.patente = patente;
    }


}
