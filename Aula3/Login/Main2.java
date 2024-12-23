package M1S3.Aula3.Login;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int menu = 0;
        try {
            System.out.println("[1] Fazer Divisão\n[2] Sair");
            System.out.println("Escolha sua opção: ");
            menu = ler.nextInt();
            switch (menu) {
                case 1:
                   System.out.println("O Resultado é: "+ fazDivisao() );
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.print("opção Inválida");
            }


        } catch (InputMismatchException ex){
System.out.println("A opção deveria ser númerica");
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        }public static int fazDivisao () throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o 1° número: ");
        int nun1= ler.nextInt();
        System.out.println("Digite o 2° número: ");
        int nun2= ler.nextInt();
        if (nun2==0){
            throw new Exception("A divisão não pode ser por 0");
        }

        return nun1/nun2;

    }
}
