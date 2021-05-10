package aeroporto2;

public class Aeroporto2 {
    
    public static void main(String[] args) {
        
        Trecho trecho = new Trecho();
        Cidade cidade = new Cidade(12345, "ilhéus", "Brasil");
        Voo voo = new Voo(567, "14:00", trecho, cidade);
        Reserva reserva = new Reserva(10, "Acassio e Matheus", "10:00");
        Assento assento = new Assento (2, "econômica");
        Companhia TAM = new Companhia("TAM", "Conquista", reserva, voo, cidade);
        Aeronave aeronave1 = new Aeronave("a", "ABC", "bonita", TAM, assento);
        Aeroporto jorgeamado = new Aeroporto(4532, "Ilhéus", TAM);
        
        System.out.println(reserva.getPassageiro() + "\n" + reserva.getCodigo()+ " \n " + reserva.getPrazo()+ " \n " + jorgeamado.getNomeCidade() + " \n" + jorgeamado.getCodigo() + " \n" + jorgeamado.getCompanhia().getNome());
                
    }    
}
