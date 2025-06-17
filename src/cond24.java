import java.util.Scanner;

public class cond24 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
        //começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
        //exemplo

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            int quadrado = i * i; // Calcula o quadrado do número
            int cubo = i * i * i; // Calcula o cubo do número
            System.out.printf("%d %d %d%n", i, quadrado, cubo); // printf para formatar a saída em linhas
        }
        sc.close();
    }
}
