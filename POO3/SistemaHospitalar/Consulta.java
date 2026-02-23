package SistemaHospitalar;

public class Consulta {

    private Medico medico;
    private Paciente paciente;
    private Prontuario prontuario;

    public Consulta(Medico medico, Paciente paciente, String descricao) {
        this.medico = medico;
        this.paciente = paciente;
        this.prontuario = new Prontuario(descricao); // composição
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }
}