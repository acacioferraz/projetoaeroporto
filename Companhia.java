package aeroporto2;

public class Companhia {

	private String Nome;

	private String local;

	private Reserva reserva;

	private Voo voo;

	private Aeronave aeronave;

	private Aeroporto aeroporto;

	private Cidade cidade;

    public Companhia(String Nome, String local, Reserva reserva, Voo voo, Cidade cidade) {
        this.Nome = Nome;
        this.local = local;
        this.reserva = reserva;
        this.voo = voo;
        this.aeronave = aeronave;
        this.aeroporto = aeroporto;
        this.cidade = cidade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Aeroporto getAeroporto() {
        return aeroporto;
    }

    public void setAeroporto(Aeroporto aeroporto) {
        this.aeroporto = aeroporto;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

}
