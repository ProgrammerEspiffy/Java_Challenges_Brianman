import java.util.Locale;

public class Exercicio_De_Fixação_E_Concatenação {
    public static void main(String[] args) {
        //Produtos
        String product1 = "Computer";
        String product2 = "Office desk";

        //Ficha
        int age = 30;
        int code = 5290;
        char gender = 'F';

        //Preço e Medida
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        //Mini Tabela de Produtos
        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n",product2, price2);

        //Ficha
        System.out.printf("%nRecord: %d years old, code %d and gender: %s%n", age, code, gender);

        //Curiosidade
        System.out.printf("%nMeasue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded(Three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decima point: %.3f", measure);
    }
}
