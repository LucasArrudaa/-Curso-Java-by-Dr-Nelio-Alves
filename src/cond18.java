import java.util.Scanner;

public class cond18 {
    public static void main(String[] args) {
        //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
        //X, se for o caso.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro :");
        int x = sc.nextInt();
        for (int i = 1; i <= x ; i++) {
            if (i % 2 != 0) {  // Verifica se o número é ímpar
                System.out.println(i);
            }
        }
        sc. close();


    }
}
