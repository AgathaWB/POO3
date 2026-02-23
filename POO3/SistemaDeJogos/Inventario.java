package SistemaDeJogos;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }
}
