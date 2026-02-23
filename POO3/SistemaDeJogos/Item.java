package SistemaDeJogos;

public class Item {
    private String nome;
    private boolean equipavel;
    private boolean equipado;

    public Item(String nome, boolean equipavel) {
        this.nome = nome;
        this.equipavel = equipavel;
    }

    public void equipar() {
        if (equipavel) {
            equipado = true;
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean isEquipado() {
        return equipado;
    }
}