package Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public String getNome() {
        return nome;
    }
}
