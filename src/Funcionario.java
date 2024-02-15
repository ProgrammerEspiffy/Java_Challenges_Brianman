import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int indetificador = sc.nextInt();
        int horasTrabalhadas = sc.nextInt();
        double salarioPorHora = sc.nextDouble();
        double salarioCalculo;

        salarioCalculo = (double) horasTrabalhadas * salarioPorHora;

        System.out.println("NUMBER = " + indetificador);
        System.out.printf("SALARY = U$ %.2f", salarioCalculo);

    }
}
