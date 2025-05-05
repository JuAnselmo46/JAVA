/******************************************************************************

Crie um vetor de 8 números inteiros e conte quantas vezes um número específico (que o usuário digitar) aparece no vetor.

*******************************************************************************/
import java.util.Scanner;

public class Ex024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {2, 4, 4, 6, 8, 10, 12, 14}; 

        System.out.print("Digite um número para contar quantas vezes ele aparece no vetor: ");
        int numeroapa = scanner.nextInt();

        int contador = 0;


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroapa) {
                contador++;
            }
        }
        System.out.println("O número " + numeroapa + " aparece " + contador + " vez(es) no vetor.");
    }
}