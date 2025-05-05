/******************************************************************************

Exercicio 022
Crie um vetor de 5 números inteiros, preencha com valores de sua escolha e calcule a soma de todos os elementos desse vetor. Exiba o resultado.

*******************************************************************************/
import java.util.Scanner;

public class Ex022 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = {19, 18, 15, 30, 12}; 
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i]; 
        }
        System.out.println("A soma de todos os elementos do vetor é: " + soma);
    }
}