public class cond02 {
    public static void main(String[] args) {
        //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        //Fórmula da área: area = π . raio2
        //Considere o valor de π = 3.14159

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite o valor do raio do círculo:");
        double raio = sc.nextDouble();
        double area = 3.14159 * raio * raio;
        System.out.printf("A=%.4f%n", area);
    }
}
