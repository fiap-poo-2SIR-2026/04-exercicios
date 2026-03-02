package exercicio02;

public class SenhaAtendimento {
    static int controle = 0;
    int senha;
    String paciente;

    public SenhaAtendimento(String paciente) {
        this.paciente = paciente;
        controle++;
        this.senha = controle;
    }

    public String getDados() {
        return "Senha # " + senha + " | Paciente: " + paciente;
    }

}
