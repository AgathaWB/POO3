package PlataformaDeS;

import java.util.ArrayList;
import java.util.List;

public class Perfil {

    private String nome;
    private List<Conteudo> assistidos = new ArrayList<>();

    public Perfil(String nome) {
        this.nome = nome;
    }

    public void assistir(Conteudo conteudo) {
        assistidos.add(conteudo);
    }

    public List<Conteudo> getAssistidos() {
        return assistidos;
    }

    public String getNome() {
        return nome;
    }
}
