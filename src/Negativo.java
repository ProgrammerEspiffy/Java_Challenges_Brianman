import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        num = sc.nextInt();

        if (num > 0){
            System.out.println("Não Negativo");
        }
        else if(num < 0){
            System.out.println("Negativo");
        }
        else {
            System.out.println("O Zero sendo 0");
        }
    }
}
