package Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> produtos = new ArrayList<>();
    private NotaFiscal notaFiscal;

    public Pedido(String numeroNota) {
        this.notaFiscal = new NotaFiscal(numeroNota); // composição
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
}
