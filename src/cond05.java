public class cond05 {
    public static void main(String[] args) {

        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        java.util.Scanner sc = new java.util.Scanner(System.in);
        // peça um
        System.out.println("Digite o código da peça 1:");
        int codigoPeca1 = sc.nextInt();
        System.out.println("Digite o numero de peças 1:");
        int numeroPecas1 = sc.nextInt();
        System.out.println("Digite o valor unitario de cada peça 1:");
        // peça dois
        double valorUnitarioPeca1 = sc.nextDouble();
        System.out.println("Digite o código da peça 2:");
        int codigoPeca2 = sc.nextInt();
        System.out.println("Digite o numero de peças 2:");
        int numeroPecas2 = sc.nextInt();
        System.out.println("Digite o valor unitario de cada peça 2:");
        double valorUnitarioPeca2 = sc.nextDouble();
        //calculo do valor a ser pago
        double valorTotal = (numeroPecas1 * valorUnitarioPeca1) + (numeroPecas2 * valorUnitarioPeca2);
        System.out.println("VALOR TOTAL  PAGAR: R$ " + String.format("%.2f", valorTotal));
        System.out.println("PEÇA 1: Código = " + codigoPeca1 + ", Número de peças = " + numeroPecas1 + ", Valor unitário = R$ " + String.format("%.2f", valorUnitarioPeca1));
        System.out.println("PEÇA 2: Código = " + codigoPeca2 + ", Número de peças = " + numeroPecas2 + ", Valor unitário = R$ " + String.format("%.2f", valorUnitarioPeca2));

    }
}
