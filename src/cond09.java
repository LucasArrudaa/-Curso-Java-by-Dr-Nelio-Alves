import java.util.Scanner;

public class cond09 {
    public static void main(String[] args) {
        /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primerio numero: ");
        int  numeroA = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int  numeroB = sc.nextInt();

        if ( numeroA % numeroB == 0 || numeroB % numeroA == 0 ){  //   || = "OU"    && = "E"    ! = "NOIT"
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }
        sc.close();
    }
}
