public class cond04 {
    public static void main(String[] args) {
        // Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        // decimais, conforme exemplo.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite o número do funcionário:");
        int numeroFuncionario = sc.nextInt();
        System.out.println("Digite o número de horas trabalhadas:");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor que recebe por hora:");
        double valorPorHora = sc.nextDouble();
        double salario = horasTrabalhadas * valorPorHora;
        System.out.println("Numero = " + numeroFuncionario);
        System.out.printf("Salario = U$ %.2f%n", salario);
        sc.close();
    }
}
