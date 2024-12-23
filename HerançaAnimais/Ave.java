package M1S3.HerançaAnimais;


public class Ave extends Animal {
    // Atributo exclusivo
    private boolean podeVoar;

    // Construtor
    public Ave(String nome, boolean podeVoar) {
        super(nome);
        this.podeVoar = podeVoar;
    }








    // Getter e setter
    public String isPodeVoar() {

        return podeVoar ? "Sim" : "Não" ;
    }

    public void setPodeVoar(boolean podeVoar) {

            this.podeVoar =podeVoar ;

    }
}

