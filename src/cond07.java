import java.util.Scanner;

public class cond07 {
    public static void main(String[] args) {
        // UTILIZANDO IF E ELSE IF
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro ou negativo ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println(numero + " é um número POSITIVO!");
        } else {
            System.out.println(numero + " é um número NEGATIVO!");
        }
        sc.close();
    }
}
