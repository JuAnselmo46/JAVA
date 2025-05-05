/******************************************************************************

 Crie um vetor de 7 números inteiros e escreva um programa que encontre o maior número presente no vetor e exiba-o.
*******************************************************************************/
 import java.util.Scanner;

public class Ex023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {79, 40, 1,55, 90, 12, 76};
        int numerom = numeros[0]; 
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numerom) {
                numerom = numeros[i]; 
            }
        }
        System.out.println("O maior número presente no vetor é: " + numerom);
    }
}