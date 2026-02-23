package PlataformaDeS;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do usuário: ");
        Usuario usuario = new Usuario(sc.nextLine());

        List<Filme> filmes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n==== STREAMING ====");
            System.out.println("1 - Criar perfil");
            System.out.println("2 - Cadastrar filme");
            System.out.println("3 - Assistir filme");
            System.out.println("4 - Ver perfis");
            System.out.println("5 - Ver filmes assistidos de um perfil");
            System.out.println("6 - Ver elenco de um filme");
            System.out.println("0 - Sair");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {

                case 1:
                    System.out.print("Nome do perfil: ");
                    usuario.adicionarPerfil(new Perfil(sc.nextLine()));
                    break;

                case 2:
                    System.out.print("Título do filme: ");
                    String titulo = sc.nextLine();

                    System.out.print("Diretor: ");
                    Pessoa diretor = new Pessoa(sc.nextLine());

                    Filme filme = new Filme(titulo, diretor);

                    System.out.print("Quantos atores? ");
                    int qtd = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < qtd; i++) {
                        System.out.print("Ator " + (i+1) + ": ");
                        filme.adicionarAtor(new Pessoa(sc.nextLine()));
                    }

                    filmes.add(filme);
                    break;

                case 3:
                    if (usuario.getPerfis().isEmpty() || filmes.isEmpty()) {
                        System.out.println("Cadastre perfil e filme primeiro!");
                        break;
                    }

                    System.out.println("Escolha perfil:");
                    for (int i = 0; i < usuario.getPerfis().size(); i++) {
                        System.out.println(i + " - " + usuario.getPerfis().get(i).getNome());
                    }
                    int p = Integer.parseInt(sc.nextLine());

                    System.out.println("Escolha filme:");
                    for (int i = 0; i < filmes.size(); i++) {
                        System.out.println(i + " - " + filmes.get(i).getTitulo());
                    }
                    int f = Integer.parseInt(sc.nextLine());

                    usuario.getPerfis().get(p).assistir(filmes.get(f));
                    break;

                case 4:
                    usuario.getPerfis().forEach(perfil ->
                            System.out.println(perfil.getNome()));
                    break;

                case 5:
                    System.out.println("Escolha perfil:");
                    for (int i = 0; i < usuario.getPerfis().size(); i++) {
                        System.out.println(i + " - " + usuario.getPerfis().get(i).getNome());
                    }
                    int index = Integer.parseInt(sc.nextLine());
                    usuario.getPerfis().get(index).getAssistidos()
                            .forEach(c -> System.out.println(c.getTitulo()));
                    break;

                case 6:
                    System.out.println("Escolha filme:");
                    for (int i = 0; i < filmes.size(); i++) {
                        System.out.println(i + " - " + filmes.get(i).getTitulo());
                    }
                    int idx = Integer.parseInt(sc.nextLine());
                    filmes.get(idx).getElenco()
                            .forEach(a -> System.out.println(a.getNome()));
                    break;
            }

        } while (opcao != 0);
    }
}
