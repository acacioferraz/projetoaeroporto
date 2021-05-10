package aeroporto2;

public class Cidade {

	private int Codigo;

	private String Nome;

	private String Pais;

	private Companhia companhia;

	private Voo voo;

    public Cidade(int Codigo, String Nome, String Pais) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Pais = Pais;
        this.companhia = companhia;
        this.voo = voo;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

}
