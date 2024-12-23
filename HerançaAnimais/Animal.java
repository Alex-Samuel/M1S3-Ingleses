package M1S3.HerançaAnimais;

public class Animal {
    // Atributo comum a todos os animais
    private String nome;

    // Construtor
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método comum a todos os animais
    public void caminhar() {
        System.out.println(nome + " está caminhando.");
    }


    public String locomover() {
       return "Caminhar...";
    }

    public String comunicar() {
        return "Barulho!";
    }

    public String atacar() {
        return "Morder...";
    }

    public final String comer() {
        return "Comendo...";
    }




















    // Getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

