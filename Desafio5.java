/**********************************************
4 - Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar. 
Calcule o valor final com juros compostos de 2% ao mês. Mostre o valor final e o valor de cada parcela. 
Permita simular vários empréstimos.

************************************************/

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxajuros = 0.02;

        while (true) {
            System.out.print("Informe o valor do empréstimo (ou digite -1 para sair): R$ ");
            double valoreem = scanner.nextDouble();

            if (valoreem == -1) {
                break;
            }

            System.out.print("Informe o número de parcelas: ");
            int numerop = scanner.nextInt();

            double valorfinal = valoreem * Math.pow(1 + taxajuros, numerop);
            double valorparcela = valorfinal / numerop;

           
            System.out.printf("Valor final a ser pago: R$ %.2f%n", valorfinal);
            System.out.printf("Valor de cada parcela: R$ %.2f%n", valorparcela);
            System.out.println(); 
        }

        System.out.println("Simulação encerrada.");
    }
}