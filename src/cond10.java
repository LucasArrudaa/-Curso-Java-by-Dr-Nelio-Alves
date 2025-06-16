import java.util.Scanner;
public class cond10 {
    public static void main(String[] args) {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Scanner sc = new Scanner(System.in);

        System.out.println("inicio do jogo : ");
        int inicio = sc.nextInt();
        System.out.println("fim do jogo : ");
        int fim = sc.nextInt();

        if (inicio < 0 || inicio > 23 || fim < 0 || fim > 23) {  // verifica se as horas estão no intervalo correto
            System.out.println(" Tempo incorreto de jogo");
        }
        else{
            int tempoTotal;
            if ( inicio < fim) { // se o jogo começa e termina no mesmo dia
                tempoTotal = fim - inicio;
            }

            else if (inicio > fim) { // se o jogo começa em um dia e termina no outro
                tempoTotal = 24 - inicio + fim; // 24 horas menos a hora de inicio mais a hora de fim

            } else {
                tempoTotal = 24; // se o jogo começa e termina na mesma hora, a duração é de 24 horas
            }
            System.out.println(" o jogo durou " + tempoTotal + " horas");
        }
        sc.close();
    }
}