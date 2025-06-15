public class cond06 {
    public static void main(String[] args) {
        /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B*/
    java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Digite o valor de A, B e C:");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double areaTriangulo = (A * C) / 2; // Área do triângulo retângulo
        double areaCirculo = 3.14159 * C * C; // Área do círculo
        double areaTrapezio = ((A + B) * C) / 2; // Área do trapézio
        double areaQuadrado = B * B; // Área do quadrado
        double areaRetangulo = A * B; // Área do retângulo

        System.out.printf("Área do triângulo: %.3f%n", areaTriangulo);
        System.out.printf("Área do círculo: %.3f%n", areaCirculo);
        System.out.printf("Área do trapézio: %.3f%n", areaTrapezio);
        System.out.printf("Área do quadrado: %.3f%n", areaQuadrado);
        System.out.printf("Área do retângulo: %.3f%n", areaRetangulo);
        sc.close();
    }
}
