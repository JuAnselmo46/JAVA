/******************************************************************************

 Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

*******************************************************************************/

import java.util.Scanner;
public class Ex017 {
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Digite número pares de 1 a 50: ");
        for (int i = 1; i <= 50; i++) {
        if(i % 2 != 0) {
        System.out.println(i);
            }
       
        }
    }
}