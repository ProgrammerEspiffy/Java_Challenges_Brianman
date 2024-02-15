import java.util.Scanner;

public class Soma_Matematica {
    public static void main(String[] args) {
        //Pegar Dados
        Scanner sc = new Scanner(System.in);

        //Variáveis
        int num1, num2, calculo;

        //Entrada de Dados
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        //Cálculo
        calculo = num1 + num2;

        //Saída
        System.out.println("SOMA = " + calculo);
    }
}
