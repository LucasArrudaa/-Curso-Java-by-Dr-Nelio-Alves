import java.util.Scanner;

public class cond08 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Numero invalido, digite um numero positivo");
        }

        if (numero % 2 ==0) {
            System.out.println(numero + "Seu numero é par");
        }
        else {
            System.out.println("seu numero é impar");
        }
        sc.close();
    }
}
