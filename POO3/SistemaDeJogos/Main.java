package SistemaDeJogos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Jogador jogador = new Jogador("Player1");
        Personagem heroi = new Personagem("Guerreiro");
        jogador.adicionarPersonagem(heroi);

        Item espada = new Item("Espada", true);
        Item escudo = new Item("Escudo", true);
        Item pocao = new Item("Poção", false);

        heroi.getInventario().adicionarItem(espada);
        heroi.getInventario().adicionarItem(escudo);
        heroi.getInventario().adicionarItem(pocao);

        espada.equipar();

        Guilda guilda = new Guilda("Dragões");
        heroi.entrarGuilda(guilda);

        int opcao;

        do {
            System.out.println("\n==== SISTEMA JOGO ====");
            System.out.println("1 - Mostrar inventário");
            System.out.println("2 - Mostrar membros da guilda");
            System.out.println("3 - Mostrar itens equipados");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    for (Item item : heroi.getInventario().getItens()) {
                        System.out.println(item.getNome());
                    }
                    break;

                case 2:
                    for (Personagem p : guilda.getMembros()) {
                        System.out.println(p.getNome());
                    }
                    break;

                case 3:
                    for (Item item : heroi.getInventario().getItens()) {
                        if (item.isEquipado()) {
                            System.out.println(item.getNome());
                        }
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

       
    }
}
