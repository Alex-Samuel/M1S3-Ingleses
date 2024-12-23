package M1S3.HerançaAnimais;

public class Peixe extends Animal {
    // Atributo exclusivo
    private boolean temEscamas;

    // Construtor
    public Peixe(String nome, boolean temEscamas) {
        super(nome);
        this.temEscamas = temEscamas;
    }





    // Getter e setter
    public String isTemEscamas() {
        return temEscamas ? "Sim": "Não";
    }

    public void setTemEscamas(boolean temEscamas) {
        this.temEscamas = temEscamas;
    }
}

