public class FuncionarioComissionado {
    private Funcionario funcionario;
    private double vendasMensais;
    private double percentualComissao;

    public FuncionarioComissionado() {
    
    }

    public FuncionarioComissionado(Funcionario funcionario, double vendasMensais, double percentualComissao) {
        this.funcionario = funcionario;
        this.vendasMensais = vendasMensais;
        this.percentualComissao = percentualComissao;
    }
    
    public double calcularSalario() {
        return funcionario.calcularSalario() + (vendasMensais * percentualComissao);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getVendasMensais() {
        return vendasMensais;
    }

    public void setVendasMensais(double vendasMensais) {
        this.vendasMensais = vendasMensais;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
}
