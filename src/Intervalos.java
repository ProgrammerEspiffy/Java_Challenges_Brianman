import java.util.Locale;
import java.util.Scanner;

public class Intervalos {
    public static void main(String[] args) {
        //Configurações Básicas
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Entrada de Dados
        double intervalo = sc.nextDouble();

        //Verificações
        if (intervalo <= 25.0){
            System.out.println("Intervalo [0,25]");
        }
        else if (intervalo <= 50.0) {
            System.out.println("Intervalo [25,50]");
        }
        else if (intervalo <= 75.0) {
            System.out.println("Intervalo [50,75]");
        }
        else if (intervalo <= 100.0) {
            System.out.println("Intervalo [75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}
