import java.util.Scanner;

public class cond11 {
    public static void main(String[] args) {
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.

        Scanner sc = new Scanner(System.in);

        int cachorroQuente = 4;
       double xSalada = 4.5;
        int xBacon = 5;
        int torrada = 2;
      double refri = 1.5;

        System.out.println("" +
                "1- cachorro Quente " +
                "2- X salada " +
                "3-X Bacon " +
                "4- Torrada simples " +
                "5- Refri ");
        System.out.println("Digite o codigo do primeiro : ");
        int escolha = sc.nextInt();
        System.out.println("Digite a quantidade : ");
        int quantidade = sc.nextInt();

        double total = 0; // variável para armazenar a soma da conta
        switch (escolha) {  // verifica o codigo do item escolhido
            case 1:
                total = cachorroQuente * quantidade;
                break;
            case 2:
                total = xSalada * quantidade;
                break;
            case 3:
                total = xBacon * quantidade;
                break;
            case 4:
                total = torrada * quantidade;
                break;
            case 5:
                total = refri * quantidade;
                break;
            default:
                System.out.println("Codigo invalido");
        }
        if (total > 0) {  // se o total for maior que zero, imprime o total
            System.out.printf("Total: R$ %.2f%n", total);
        } else {
            System.out.println("Nenhum item selecionado.");
        }
    }
    }

