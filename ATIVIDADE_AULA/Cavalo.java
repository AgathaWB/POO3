package ATIVIDADE_AULA;

public class Cavalo extends Peca implements Movimento{

    public Cavalo(String cor, String posicao) {
        super(cor, posicao);
        
    }

    public void mover(String origem, String destino) {
        System.out.println("Cavalo está se movendo em L");
    }
    
}
