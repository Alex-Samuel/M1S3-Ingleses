package M1S3.HerançaAnimais;

public class Pato extends Ave {
    private double envergaduraAsas;

    public Pato(String nome, boolean podeVoar, double envergaduraAsas) {
        super(nome, podeVoar);
        this.envergaduraAsas = envergaduraAsas;
    }

    public String locomover(){
        return "Caminhar/Nadar..."  ;

    }
    public String comunicar() {
        return "grasnar!";
    }


    public String atacar() {
        return "Bicar!";
    }


    public double getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(double envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }
}

