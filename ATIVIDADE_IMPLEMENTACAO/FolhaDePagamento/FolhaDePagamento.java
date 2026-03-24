import java.util.List;

public class FolhaDePagamento {
    static void processarPagamento(List<Funcionario> funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println("Processando pagamento para: " + f.getNome());
        }
    }
}
