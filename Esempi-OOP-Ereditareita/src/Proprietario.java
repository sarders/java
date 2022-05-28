public class Proprietario {

    private String cognome;
    private String nome;

    public Proprietario() {
        cognome = "Non e stato definito";
        nome = "Non e stato definito";
    }

    public Proprietario(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
