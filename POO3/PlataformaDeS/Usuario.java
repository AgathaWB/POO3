package PlataformaDeS;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private List<Perfil> perfis = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void adicionarPerfil(Perfil perfil) {
        perfis.add(perfil);
    }

    public List<Perfil> getPerfis() {
        return perfis;
    }

    public String getNome() {
        return nome;
    }
}