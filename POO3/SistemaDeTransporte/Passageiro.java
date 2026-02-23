package SistemaDeTransporte;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }

    private List<Corrida> corridas = new ArrayList<>();

    public Passageiro(String nome) {
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