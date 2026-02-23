package SistemaDeTransporte;

public class Corrida {
    private String origem;
    private String destino;
    private Pagamento pagamento;
    private Motorista motorista;
    private Passageiro passageiro;

    public Corrida(String origem, String destino, double valor,
                   Motorista motorista, Passageiro passageiro) {

        this.origem = origem;
        this.destino = destino;
        this.motorista = motorista;
        this.passageiro = passageiro;
        this.pagamento = new Pagamento(valor); // composição

        motorista.adicionarCorrida(this);
        passageiro.adicionarCorrida(this);
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}
