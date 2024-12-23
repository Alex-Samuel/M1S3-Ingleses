package M1S3.HerançaAnimais;

public class Gato extends Mamifero {
    private String corDosOlhos;

    public Gato(String nome, String corPelo, String corDosOlhos) {
        super(nome, corPelo);
        this.corDosOlhos = corDosOlhos;
    }


    public String locomover() {
        return "Caminhar";
    }

    public String comunicar(){
        return "Miar!";
    }
    public String atacar(){
        return "Arranhar!";
    }






    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }
}

