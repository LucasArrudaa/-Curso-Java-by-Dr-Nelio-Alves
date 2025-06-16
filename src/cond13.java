import java.util.Scanner;

public class cond13 {
    public static void main(String[] args) {
        //Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem “Origem”.
        //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        //situação.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as coordenadas x e y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) { // verifica se o ponto é a origem
            System.out.println("Origem");

        } else if (x == 0) { // verifica se o ponto está no eixo Y
            System.out.println("Eixo Y");

        } else if (y == 0) { // verifica se o ponto está no eixo X
            System.out.println("Eixo X");

        } else if (x > 0 && y > 0) { // verifica se o ponto está no primeiro quadrante
            System.out.println("Q1");

        } else if (x < 0 && y > 0) { // verifica se o ponto está no segundo quadrante
            System.out.println("Q2");

        } else if (x < 0 && y < 0) { // verifica se o ponto está no terceiro quadrante
            System.out.println("Q3");

        } else { // se o ponto estiver no quarto quadrante
            System.out.println("Q4");
        }
    }
}
