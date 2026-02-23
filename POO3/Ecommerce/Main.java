package Ecommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dados fixos para teste
        Fornecedor fornecedor = new Fornecedor("Tech Distribuidora");

        Produto p1 = new Produto("Notebook", fornecedor);
        Produto p2 = new Produto("Mouse Gamer", fornecedor);

        Cliente cliente = new Cliente("Ana");

        Pedido pedido = new Pedido("NF123");
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        cliente.adicionarPedido(pedido);

        int opcao;

        do {
            System.out.println("\n==== SISTEMA E-COMMERCE ====");
            System.out.println("1 - Ver pedidos do cliente");
            System.out.println("2 - Ver produtos do pedido");
            System.out.println("3 - Ver fornecedor de um produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (Pedido ped : cliente.getPedidos()) {
                        System.out.println("Nota Fiscal: " +
                                ped.getNotaFiscal().getNumero());
                    }
                    break;

                case 2:
                    for (Produto prod : pedido.getProdutos()) {
                        System.out.println("Produto: " + prod.getNome());
                    }
                    break;

                case 3:
                    System.out.println("Fornecedor do Notebook: " +
                            p1.getFornecedor().getNome());
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

    }
}