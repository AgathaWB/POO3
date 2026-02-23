package SistemaDeJogos;

public class Personagem {

    private String nome;
    private Inventario inventario = new Inventario(); // composição
    private Guilda guilda;

    public Personagem(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void entrarGuilda(Guilda guilda) {
        this.guilda = guilda;
        guilda.adicionarMembro(this);
    }
}