public class FuncionarioHorista {
    private Funcionario funcionario;
    private double valorPorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista() {
    
    }
    public FuncionarioHorista(Funcionario funcionario, double valorPorHora, int horasTrabalhadas) {
        this.funcionario = funcionario;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
