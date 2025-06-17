import java.util.Scanner;

public class cond19 {
    public static void main(String[] args) {
        //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
        //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
        //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores inteiros :");
        int quantidade = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for(int i = 0; i < quantidade ; i++){
            System.out.println("Digite o valor " + (i + 1) + ":");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) { // Verifica se o número está dentro do intervalo [10,20] maior igual a 10 e menor igual a 20
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println("Valores dentro do intervalo: " + dentro + "\n"+ " Valores fora do intervalo: " + fora);
        sc.close();
    }
}
