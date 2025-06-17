import java.util.Scanner;

public class cond22 {
    public static void main(String[] args) {
         //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        //Lembrando que, por definição, fatorial de 0 é 1.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial: ");
        int fatorial = sc.nextInt();

        for (int i = fatorial - 1; i > 0; i--) {
            fatorial *= i;
            System.out.println("Fatorial parcial: " + fatorial); // Exibe o fatorial parcial a cada iteração
        }
        System.out.println("Fatorial final: " + fatorial);
}
}

