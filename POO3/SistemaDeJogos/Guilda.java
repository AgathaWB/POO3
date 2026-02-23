package SistemaDeJogos;

import java.util.ArrayList;
import java.util.List;

public class Guilda {

    private String nome;
    private List<Personagem> membros = new ArrayList<>();

    public Guilda(String nome) {
        this.nome = nome;
    }

    public void adicionarMembro(Personagem personagem) {
        membros.add(personagem);
    }

    public List<Personagem> getMembros() {
        return membros;
    }

    public String getNome() {
        return nome;
    }
}