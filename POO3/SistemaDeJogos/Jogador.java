package SistemaDeJogos;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Personagem> personagens = new ArrayList<>();

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void adicionarPersonagem(Personagem p) {
        personagens.add(p);
    }

	public int getNome() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'getNome'");
	}

    public Personagem[] getPersonagens() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPersonagens'");
    }
}
