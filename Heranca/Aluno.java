package M1S3.Heranca;

public class Aluno extends Pessoa {


    public String curso;
    public int semestre;


    public Aluno(String cpf, String nome, int idade,String curso,int semestre){
        super(cpf, idade);
        this.curso=curso;
        this.semestre=semestre;
    }

        public void retornaNome(){
        System.out.println("Aluno: "+nome);

        }

}


