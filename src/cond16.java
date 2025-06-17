import java.util.Scanner;

public class cond16 {
    public static void main(String[] args) {
            //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano.
        // Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite as coordenadas X e Y (separadas por espaço): ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (x == 0 || y == 0) {
                break; // Encerra o loop se pelo menos uma coordenada for NULA
            }
            if (x > 0 && y > 0) {
                System.out.println("PRIMEIRO"); // Primeiro quadrante   ( X POSSITIVO E Y  POSSITIVO )
            } else if (x < 0 && y > 0) {
                System.out.println("SEGUNDO"); // Segundo quadrante ( X NEGATIVO E Y POSITIVO )
            } else if (x < 0 && y < 0) {
                System.out.println("TERCEIRO"); // Terceiro quadrante ( X NEGATIVO E Y NEGATIVO )
            } else if (x > 0 && y < 0) {
                System.out.println("QUARTO"); // Quarto quadrante ( X POSITIVO E Y NEGATIVO )
            }
        }
 sc.close();
    }
}


