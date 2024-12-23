package M1S3.HerançaAnimais;

public class Sapo extends Anfibio{

    private double AlturaSalto;

    public Sapo(String nome, boolean viveNaAgua, double AlturaSalto) {
        super(nome, viveNaAgua);
        this.AlturaSalto=AlturaSalto;
    }

    public String locomover(){
        return "Caminhar/Nadar/Saltar..."  ;

    }
    public String comunicar() {
        return "Coaxar.";
    }


    public String atacar() {
        return "VENENO!!!";
    }

    public double getAlturaSalto() {
        return AlturaSalto;
    }

    public void setAlturaSalto(double AlturaSalto) {
        this.AlturaSalto = AlturaSalto;
    }


}

