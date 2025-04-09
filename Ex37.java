/******************************************************************************

 UTILIZE (DO / WHILE) PARA TODOS OS EXERCÍCIOS
35) Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor total da compra e após escolha a forma de pagamento:
 
 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.
2 - À Vista no cartão de crédito, recebe 3% de desconto.
3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.
4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.
* Montar um menu com os itens acima para o usuário escolher a forma de pagamento e mostrar a lista dos produtos comprados e o valor a ser pago.

*******************************************************************************/

import java.util.Scanner;
public class Ex37 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contador = 1;
    double pagar, desconto, juros;
    int soma = 0;
    
        while (contador <= 10) {
            System.out.println("Informe o valor do produto: ");
            double valor = scanner.nextDouble();
            soma += valor;
            contador++;
        }
        System.out.println("A soma de todos os valores informados é: " + soma);
        System.out.println("Escolha uma forma de pagamento:");
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.");
        System.out.println("2 - À Vista no cartão de crédito, recebe 3% de desconto.");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.");
        System.out.println("4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do produto mais juros de 10%.");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
        desconto = soma * 0.08;
        pagar = soma - desconto;
        System.out.println("Você terá que pagar: " + pagar);
        }
        
        else if (opcao == 2) {
            desconto = soma * 0.03;
            pagar = soma - desconto;
            System.out.println("Você terá que pagar: " + pagar);
        }
        else if (opcao == 3) {
            pagar = soma;
            System.out.println("Você terá que pagar: " + pagar);
        }
        else if (opcao == 4) {
            juros = soma * 0.1;
            pagar = soma + juros;
            System.out.println("Você terá que pagar: " + pagar);
        }
    }
}