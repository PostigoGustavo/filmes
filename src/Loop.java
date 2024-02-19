import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in);
        double media = 0;
        double nota;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a nota");
            nota = Leitura.nextDouble();
            media += nota;

        }
        System.out.println("Média de avaliações:" + media/3);

        System.out.println();

    }
}
