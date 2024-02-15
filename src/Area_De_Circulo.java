import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class Area_De_Circulo {
    public static void main(String[] args) {
        //Configurações
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

        //PI, Raio padrão, Raio Calculo e a Area
            double R, A, pi = 3.14159;

        //Atribuições
        R = sc.nextDouble();

        //Cálculos
        A = pi * R * R;

        //Saída de Dados
        System.out.printf("A=%.4f", A);

            sc.close();
    }
}
