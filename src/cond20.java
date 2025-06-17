import java.util.Scanner;

public class cond20 {
    public static void main(String[] args) {
        //Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
        // Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
        // Apresente a média ponderada para cada um destes conjuntos de 3 valores,
        // sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
        //peso 5.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de casos de teste:");
        int quantidade= sc.nextInt();
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite os três valores reais (com uma casa decimal):");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            // Calcula a média ponderada
            double mediaPonderada = (a * 2 + b * 3 + c * 5) / (2 + 3 + 5);
            System.out.printf("Média ponderada: %.1f%n", mediaPonderada);
        }

        sc.close();

    }
}
