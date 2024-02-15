import java.util.Scanner;

public class Divisor_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double calculo;

        for (int i = 0; i < N; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            calculo = (double) num1 / num2;

            if (num1 == 0 || num2 == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                System.out.println(calculo);
            }
        }
        sc.close();
    }
}
