import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Hora Inicial, Hora Final e Duração
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
