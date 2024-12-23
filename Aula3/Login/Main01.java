package M1S3.Aula3.Login;
import java.util.ArrayList;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args)  {

        Scanner ler=new Scanner(System.in);
try {
    System.out.print("Digite seu nome: ");
    String nome = ler.nextLine();
    if (nome.isBlank()) {
        throw new Exception("O nome não foi informado!");
    }
    System.out.println("Meu nome é "+nome);
}catch (Exception ex){
    System.out.print(ex.getMessage());
}
finally {
    System.out.print("Programa desenvolvido no FuturoDEV");
}




















        /*//lista de login
        ArrayList<Login> listaLogin = new ArrayList<Login>();
        Login log01=new Login ("Alexis",16570);
        listaLogin.add(log01);

        Login log02=new Login ("Samuel",88334);
        listaLogin.add(log02);

        Login log03=new Login ("Juan",18870);
        listaLogin.add(log03);

        Login log04=new Login ("Kauãn",10000);
        listaLogin.add(log04);

        Login log05=new Login ("Gisele",48296);
        listaLogin.add(log05);

        //Variáveis
        String usuario;
        int senha;
        boolean acesso = false;
        Scanner ler=new Scanner(System.in);
try {
    System.out.print("Digite o usuário: ");
    usuario = ler.nextLine();
    System.out.print("Digite a senha: ");
    senha = ler.nextInt();
    //if()

    //listaLogin
    for (Login item : listaLogin) {
        if (usuario.equals(item.usuario)) {
            if (senha == item.senha) {
                acesso = true;
            }

        }

    }
}catch (Exception ex){
    System.out.print("ERRO!!!");
}*/





































        /*Scanner ler=new Scanner(System.in);
            final int senhasecreta = 123456;
            try {
                System.out.print("Digite a senha: ");
                int senha = ler.nextInt();
                if (senha == senhasecreta){
                    System.out.println("Bem vindo ao FutDev!!");
                }
                  else {
                  throw new Exception("Senha inválida!!!");
                }


            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }*/
       /* try {


            System.out.print("Digite o 1° número: ");
            int num1=ler.nextInt();
        System.out.print("Digite o 2° número: ");
        int num2=ler.nextInt();


        System.out.print("\n"+num1+"+"+num2+"="+(num1+num2));
        }catch (Exception ex){
            System.out.println("*ERRO* - Valor informado não é um número!!");
        }*/
    }

}
