/******************************************************************************
Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

*******************************************************************************/

 import java.util.Scanner;
 
 public class Ex020 {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int numero;
         int pares = 0;
         int impares = 0;
 
         System.out.println("Digite 10 números inteiros:");
 
         for (int i = 1; i <= 10; i++) {
             System.out.print("Número " + i + ": ");
             numero = scanner.nextInt();
 
             if (numero % 2 == 0) {
                 pares++;
             } else {
                 impares++;
             }
         }
 
         System.out.println("Quantidade de números pares: " + pares);
         System.out.println("Quantidade de números ímpares: " + impares);
 
     }
 }