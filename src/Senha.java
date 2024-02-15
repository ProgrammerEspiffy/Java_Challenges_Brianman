import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int senhaResposta = 2002;
        int senhaDigito = sc.nextInt();

        while (senhaDigito != senhaResposta){
            System.out.println("Senha Invalida");
            senhaDigito = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();
    }
}
