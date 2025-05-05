/******************************************************************************

Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.

*******************************************************************************/
import java.util.Scanner;

public class Ex018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Insira o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Insira o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        
        System.out.println("Números no intervalo: ");
        for (int i = inicio; i <= fim; i++) {
            System.out.print(i + " ");
        }

       
    }
}