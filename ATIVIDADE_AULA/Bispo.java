package ATIVIDADE_AULA;

public class Bispo extends Peca implements Movimento{

    public Bispo(String cor, String posicao) {
        super(cor, posicao);
    }
     public void mover(String origem, String destino) {
        System.out.println("Bispo está se movendo para diagonal");
    }
}
