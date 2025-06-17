import java.util.Scanner;

public class cond21 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
        //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pares: ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o primeiro número: ");
            int numerador = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int denominador = sc.nextInt();

            if (denominador == 0) {
                System.out.println("Divisão impossível");
            } else {
                double resultado = (double) numerador / denominador;
                System.out.printf("Resultado da divisão: %.1f%n", resultado);

                sc.close();
            }
        }



    }
}
