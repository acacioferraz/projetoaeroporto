package aeroporto2;
import java.util.Date;

public class Reserva {

	private int Codigo;

	private String Passageiro;

	private String Prazo;

	private Companhia companhia;

    public Reserva(int Codigo, String Passageiro, String Prazo) {
        this.Codigo = Codigo;
        this.Passageiro = Passageiro;
        this.Prazo = Prazo;
        this.companhia = companhia;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getPassageiro() {
        return Passageiro;
    }

    public void setPassageiro(String Passageiro) {
        this.Passageiro = Passageiro;
    }

    public String getPrazo() {
        return Prazo;
    }

    public void setPrazo(String Prazo) {
        this.Prazo = Prazo;
    }

    public Companhia getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Companhia companhia) {
        this.companhia = companhia;
    }
}
