package M1S3.Heranca;

public class Funcionario extends Pessoa {
    // Atributo específico da classe Funcionario
    private double salario;

    // Construtor da classe Funcionario, usando super() para inicializar Pessoa
    public Funcionario(String cpf, String nome, int idade, double salario) {
        super(nome, idade); // Chama o construtor da classe base (Pessoa)
        this.salario = salario; // Inicializa o atributo específico da classe Funcionario
    }

    // Getter e setter para o salário
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

