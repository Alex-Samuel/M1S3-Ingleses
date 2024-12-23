package M1S3.HerançaAnimais;

public class Tubarao extends Peixe{

    private int numeroDentes;
    public Tubarao(String nome, boolean temEscamas, int numeroDentes){
        super(nome,temEscamas);
        this.numeroDentes=numeroDentes;
    }

    public String locomover(){
        return "Caminhar/Nadar..."  ;

    }
    public String comunicar() {
        return "zigue-zaguear...";
    }


    public String atacar() {
        return "Morder!";
    }




    public int getNumeroDentes() {
        return numeroDentes;
    }

    public void setNumeroDentes(int numeroDentes) {
        this.numeroDentes = numeroDentes;
    }
}
