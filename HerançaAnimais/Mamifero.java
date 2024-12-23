package M1S3.HerançaAnimais;


public class Mamifero extends Animal {
    // Atributo exclusivo
    private String corPelo;

    // Construtor
    public Mamifero(String nome, String corPelo) {
        super(nome); // Chama o construtor da classe base
        this.corPelo = corPelo;
    }











    // Getter e setter
    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}

