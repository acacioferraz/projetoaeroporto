package aeroporto2;
public class Assento {

	private int numero;

	private String classe;

	private Aeronave aeronave;

    public Assento(int numero, String classe) {
        this.numero = numero;
        this.classe = classe;
        this.aeronave = aeronave;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }
}
