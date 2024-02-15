import java.util.Scanner;

public class Itens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pedido do Sistema
        int codigo = sc.nextInt();
        int qte = sc.nextInt();

        //Preço final
        double total;


        if (codigo == 1){
            total = qte * 4.0;
        } 
        else if (codigo == 2) {
            total = qte * 4.5;
        } 
        else if (codigo == 3) {
            total = qte * 5.0;
        }
        else if (codigo == 4) {
            total = qte * 2.0;
        }
        else {
            total = qte * 1.5;
        }

        System.out.printf("Total: R$%.2f%n", total);
        sc.close();
    }
}
