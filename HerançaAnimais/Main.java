package M1S3.HerançaAnimais;

import M1S3.Heranca.Aluno;
import M1S3.Heranca.Funcionario;
import M1S3.Heranca.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
            System.out.println("\nEscolha um animal para exibir:");
            System.out.println("[1] Rex\n[2] Mimi\n[3] Kermit\n[4] Batmam\n[5]Donald\n[6]Croc\n[7]Jaws");
            System.out.print("Digite a sua opção: ");
             opc = scanner.nextInt();
        switch (opc){
            case 1:

                Cachorro cachorro = new Cachorro("Rex", "Preto", "Labrador");
                System.out.println("\n"+ cachorro.getNome()+" "+cachorro.getCorPelo()+" da raça "+cachorro.getRaca() );
                System.out.println("Locomover: " + cachorro.locomover());
                System.out.println("Comunicar: "+cachorro.comunicar());
                System.out.println("Atacar: "+cachorro.atacar());
                System.out.println("Comer: "+cachorro.comer());
                cachorro.caminhar(); // Método herdado de Animal

                break;

            case 2:
                Gato gato = new Gato("Mimi", "Cinza", "Azul");
                System.out.println("\n"+ gato.getNome()+" "+gato.getCorPelo());
                System.out.println("Cor dos olhos: " + gato.getCorDosOlhos());
                System.out.println("Locomover: " + gato.locomover());
                System.out.println("Comunicar: "+gato.comunicar());
                System.out.println("Atacar: "+gato.atacar());
                System.out.println("Comer: "+gato.comer());
                gato.caminhar();
                break;


            case 3:
                Sapo sapo = new Sapo("Kermit", true, 1.2);
                System.out.println("\n"+ sapo.getNome()+" salta "+sapo.getAlturaSalto()+ " metros");
                System.out.println("Locomover: " + sapo.locomover());
                System.out.println("Comunicar: "+sapo.comunicar());
                System.out.println("Atacar: "+sapo.atacar());
                System.out.println("Comer: "+sapo.comer());
                sapo.caminhar();
                break;

            case 4:
                Morcego morcego = new Morcego("Batman", "Marrom", 1.5);
                System.out.println("\n" + morcego.getNome()+ " da cor "+morcego.getCorPelo());
                System.out.println("Envergadura das asas: " + morcego.getEnvergaduraAsas() + " metros");
                System.out.println("Locomover: " +morcego.locomover());
                System.out.println("Comunicar: "+morcego.comunicar());
                System.out.println("Atacar: "+morcego.atacar());
                System.out.println("Comer: "+morcego.comer());
                morcego.caminhar();
                break;

            case 5:
                Pato pato = new Pato("Donald", true, 1.2);
                System.out.println("\n" + pato.getNome());
                System.out.println("Pode voar: "+pato.isPodeVoar());
                System.out.println("Envergadura das asas: " + pato.getEnvergaduraAsas());
                System.out.println("Locomover: " +pato.locomover());
                System.out.println("Comunicar: "+pato.comunicar());
                System.out.println("Atacar: "+pato.atacar());
                System.out.println("Comer: "+pato.comer());
                pato.caminhar();
                break;

            case 6:
                Crocodilo crocodilo = new Crocodilo("Croc", "Escamas duras", 5.0);
                System.out.println("\n" + crocodilo.getNome());
                System.out.println("Tipo de escamas: " + crocodilo.getTipoEscamas());
                System.out.println("Tamanho: " + crocodilo.getTamanhoMaximo() + " metros");
                System.out.println("Locomover: " +crocodilo.locomover());
                System.out.println("Comunicar: "+crocodilo.comunicar());
                System.out.println("Atacar: "+crocodilo.atacar());
                System.out.println("Comer: "+crocodilo.comer());
                crocodilo.caminhar();
                break;

            case 7:
                Tubarao tubarao = new Tubarao("Jaws", true, 300);
                System.out.println("\n" + tubarao.getNome());
                System.out.println("Número de dentes: " + tubarao.getNumeroDentes());
                System.out.println("Tem escamas: "+tubarao.isTemEscamas());
                System.out.println("Locomover: " +tubarao.locomover());
                System.out.println("Comunicar: "+tubarao.comunicar());
                System.out.println("Atacar: "+tubarao.atacar());
                System.out.println("Comer: "+tubarao.comer());
                tubarao.caminhar();
                break;
            default:
                System.out.println("Codigo inválido!!!");


        }
*/


        /*Pessoa pessoa01=new Aluno("0020200","",19,"Artes",2);
        Pessoa pessoa02=new Funcionario("222.222.222-55","Marcia",23,2000.0);

        ArrayList<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add((Aluno) pessoa01);

        System.out.println(pessoa01.getClass());
        System.out.println(pessoa02.getClass());*/

        int opc=0;
        ArrayList<Animal> listaAnimais=new ArrayList<>();
        String nome;

        System.out.println("\nEscolha um animal para ser cadastrado!!");
        System.out.println("[1] Cachorro\n[2] Gato\n[3] Morcego\n[4] Sapo\n [5] Sair.");
        System.out.print("Digite a sua opção: ");

        do{
            Scanner ler = new Scanner(System.in);
            System.out.println("\nEscolha um animal para ser cadastrado!!");
            System.out.println("[1] Cachorro\n[2] Gato\n[3] Morcego\n[4] Sapo\n [5] Sair.");
            System.out.print("Digite a sua opção: ");
            opc=ler.nextInt();

            switch (opc){
                case 1:
                    //Adição do cachorro
                    System.out.print("\nNome do Cachorro: ");
                    nome=ler.nextLine();
                    //Animal novoDog = new Cachorro();
                    //listaAnimais.add(novoDog);
                    break;

                default:
                    System.out.println("Opção inválida!!!");
            }
        }while (opc!=5);








































        /*



        // Criando um Morcego
        Morcego morcego = new Morcego("Batman", "Marrom", 1.5);
        System.out.println("\nMorcego: " + morcego.getNome());
        System.out.println("Envergadura das asas: " + morcego.getEnvergaduraAsas() + " metros");
        morcego.caminhar();

        // Criando um Sapo
        Sapo sapo = new Sapo("Kermit", true, 1.2);
        System.out.println("\nSapo: " + sapo.getNome());
        System.out.println("Altura do salto: " + sapo.getAlturaSalto() + " metros");
        sapo.caminhar();


        // Criando um Pato
        Pato pato = new Pato("Donald", true, "Quack!");
        System.out.println("\nPato: " + pato.getNome());
        System.out.println("Som emitido: " + pato.getSomEmitido());
        pato.caminhar();

        // Criando um Crocodilo
        Crocodilo crocodilo = new Crocodilo("Croc", "Escamas duras", 5.0);
        System.out.println("\nCrocodilo: " + crocodilo.getNome());
        System.out.println("Tipo de escamas: " + crocodilo.getTipoEscamas());
        System.out.println("Tamanho: " + crocodilo.getTamanhoMaximo() + " metros");
        crocodilo.caminhar();

        // Criando um Tubarão
        Tubarao tubarao = new Tubarao("Jaws", true, 300);
        System.out.println("\nTubarão: " + tubarao.getNome());
        System.out.println("Número de dentes: " + tubarao.getNumeroDentes());
        tubarao.caminhar();*/
    }
}
