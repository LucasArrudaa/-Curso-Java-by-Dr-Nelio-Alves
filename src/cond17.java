import java.util.Scanner;

public class cond17 {
    public static void main(String[] args) {

        //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo.

        int alcool = 0, gasolina = 0, diesel = 0;
        int codigo;

        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        while (true) {

            System.out.print("Digite o tipo de combustível (1-Álcool, 2-Gasolina, 3-Diesel, 4-Fim): ");
            codigo = sc.nextInt(); // Lê o código do combustível

            if (codigo == 1) {
                alcool++; // Incrementa o contador de álcool
            } else if (codigo == 2) {
                gasolina++; // Incrementa o contador de gasolina
            } else if (codigo == 3) {
                diesel++; // Incrementa o contador de diesel
            } else if (codigo == 4) {
                break; // Encerra o loop se o código for 4
            } else {
                System.out.println("Código inválido. Tente novamente."); // Mensagem para código inválido
            }
        }
        sc.close(); // Fecha o scanner
        System.out.println(alcool + " Alcool" + "\n" + gasolina + " Gasolina" + "\n" + diesel + " Diesel");
        System.out.println("MUITO OBRIGADO");
    }
}
