package M1S3.Aula1.RevisaoPOO;

public class diretor {
    private String nomeCompleto;
    private int idade;
    private String CPF;
    private String CEP;
    private double salario;
    private double bonusSalarial;






    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public double getSalario() {
        return salario+bonusSalarial;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }
}
