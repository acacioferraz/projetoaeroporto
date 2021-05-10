package aeroporto2;

public class Aeroporto {

	private int Codigo;

	private String Nome;

	private Companhia companhia;

    public Aeroporto(int Codigo, String Nome, Companhia companhia) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.companhia = companhia;
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNomeCidade() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }
}
