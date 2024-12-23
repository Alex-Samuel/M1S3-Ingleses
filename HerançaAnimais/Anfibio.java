package M1S3.HerançaAnimais;

public class Anfibio extends Animal {
    // Atributo exclusivo
    private boolean viveNaAgua;

    // Construtor
    public Anfibio(String nome, boolean viveNaAgua) {
        super(nome);
        this.viveNaAgua = viveNaAgua;
    }


















    public boolean isViveNaAgua() {
        return viveNaAgua;
    }

    public void setViveNaAgua(boolean viveNaAgua) {
        this.viveNaAgua = viveNaAgua;
    }
}

