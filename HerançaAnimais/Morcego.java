package M1S3.HerançaAnimais;
public class Morcego extends Mamifero {
    private double envergaduraAsas;

    public Morcego(String nome, String corPelo, double envergaduraAsas) {
        super(nome, corPelo);
        this.envergaduraAsas = envergaduraAsas;
    }
    public String locomover(){
      return "Voar..."  ;

    }
    public String comunicar() {
        return "Sonar";
    }


    public String atacar() {
        return "Morder!";
    }

    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

}
