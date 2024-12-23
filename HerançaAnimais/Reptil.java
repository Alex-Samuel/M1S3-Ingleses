package M1S3.HerançaAnimais;

public class Reptil extends Animal {
    // Atributo exclusivo
    private String tipoEscamas;

    // Construtor
    public Reptil(String nome, String tipoEscamas) {
        super(nome);
        this.tipoEscamas = tipoEscamas;
    }





    // Getter e setter
    public String getTipoEscamas() {
        return tipoEscamas;
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }
}

