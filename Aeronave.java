package aeroporto2;


public class Aeronave {

	private String modelo;

	private String codigo;

	private String descricao;

	private Companhia companhia;

	private Assento assento;
        
        private String modelos [] = new String[2];
      
        
    public Aeronave(String Modelo, String Codigo, String Descricao, Companhia companhia, Assento assento) {
        this.modelo = Modelo;
        this.codigo = Codigo;
        this.descricao = Descricao;
        this.companhia = companhia;
        this.assento = assento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String Modelo) {
        this.modelo = Modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String Codigo) {
        this.codigo = Codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
