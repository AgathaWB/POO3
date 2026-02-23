package SistemaDeTransporte;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private String nome;
    private List<Corrida> corridas = new ArrayList<>();

    public Motorista(String nome) {
        this.nome = nome;
    }

    public void adicionarCorrida(Corrida corrida) {
        corridas.add(corrida);
    }

    public List<Corrida> getCorridas() {
        return corridas;
    }

    public String getNome() {
        return nome;
    }
}