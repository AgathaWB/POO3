package PlataformaDeS;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Conteudo {

    private Pessoa diretor;
    private List<Pessoa> elenco = new ArrayList<>();

    public Filme(String titulo, Pessoa diretor) {
        super(titulo);
        this.diretor = diretor;
    }

    public void adicionarAtor(Pessoa ator) {
        elenco.add(ator);
    }

    public List<Pessoa> getElenco() {
        return elenco;
    }

    public Pessoa getDiretor() {
        return diretor;
    }
}
