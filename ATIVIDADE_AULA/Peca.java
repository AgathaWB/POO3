package ATIVIDADE_AULA;

public class Peca{
    private String cor;
    private String posicao;

    public Peca(String cor, String posicao){
        this.cor = cor;
        this.posicao = posicao;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}