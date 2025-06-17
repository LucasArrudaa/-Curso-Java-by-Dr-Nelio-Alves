import java.util.Scanner;

public class cond23 {
    public static void main(String[] args) {
        //Ler um número inteiro N e calcular todos os seus divisores

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro :");
        int inteiro = sc.nextInt();

        for (int i = 1; i <= inteiro; i++) {
            if (inteiro % i == 0) { // Verifica se i é divisor de inteiro e se o resto da divisão é zero
                System.out.println(i);
            }
        }
        sc.close();
    }
}
