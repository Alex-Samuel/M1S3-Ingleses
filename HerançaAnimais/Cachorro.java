package M1S3.HerançaAnimais;

public class Cachorro extends Mamifero {
    private String raca;

    public Cachorro(String nome, String corPelo, String raca) {
        super(nome, corPelo);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String locomover() {
        return "Caminhar";
    }


    public String comunicar(){
        return "Latir!";
    }
    public String atacar(){
        return "Morder!";
    }


}


