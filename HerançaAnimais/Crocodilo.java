package M1S3.HerançaAnimais;

public class Crocodilo extends Reptil {
    private double tamanhoMaximo;

    public Crocodilo(String nome, String tipoEscamas, double tamanhoMaximo) {
        super(nome, tipoEscamas);
        this.tamanhoMaximo = tamanhoMaximo;
    }

    public double getTamanhoMaximo() {
        return tamanhoMaximo;
    }

    public void setTamanhoMaximo(double tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
    }
}

