package PlataformaDeS;

public abstract class Conteudo {
    protected String titulo;

    public Conteudo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
