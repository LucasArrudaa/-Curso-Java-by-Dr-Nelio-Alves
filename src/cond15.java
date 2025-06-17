import java.util.Scanner;

public class cond15 {
    public static void main(String[] args) {

        //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
        //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
        //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        while (true) {
            int senha;
            System.out.print("Digite a senha: ");
            Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
            senha = sc.nextInt();
            // Lê a senha do usuário
          if (senha == 2002)  { // Verifica se a senha é válida
                System.out.println("Acesso Permitido");
                break; // Encerra o loop se a senha for correta
            } else {
                System.out.println("Senha Invalida"); // Mensagem para senha i
            }
            sc.close(); // Fecha o scanner
        }
    }
}
