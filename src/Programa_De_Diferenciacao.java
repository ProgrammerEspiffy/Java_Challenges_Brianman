import java.util.Scanner;

public class Programa_De_Diferenciacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada de Dados
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        //Processamento de Dados
        int diferenca;
        diferenca = (A * B - C * D);

        //Saída de Dados
        System.out.println("DIFERENÇA = " + diferenca);
    }
}
