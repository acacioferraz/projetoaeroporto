package aeroporto2;
import java.util.Collection;
public class Voo {

	private int Numero;

	private Collection<Companhia> companhia;

	private String horario;

	private Trecho trecho;

	private Cidade cidade;

    public Voo(int Numero, String horario, Trecho trecho, Cidade cidade) {
        this.Numero = Numero;
        this.companhia = companhia;
        this.horario = horario;
        this.trecho = trecho;
        this.cidade = cidade;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Collection<Companhia> getCompanhia() {
        return companhia;
    }

    public void setCompanhia(Collection<Companhia> companhia) {
        this.companhia = companhia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Trecho getTrecho() {
        return trecho;
    }

    public void setTrecho(Trecho trecho) {
        this.trecho = trecho;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
