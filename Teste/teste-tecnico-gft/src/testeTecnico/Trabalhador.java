package testeTecnico;

public class Trabalhador {
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadas;
    private double salarioTotal;

    public Trabalhador(String nome, double salarioPorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        salarioTotal = horasTrabalhadas*salarioPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(float salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
