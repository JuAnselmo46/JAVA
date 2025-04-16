/******************************************************************************
47. Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.

*******************************************************************************/

import java.util.Scanner;
 public class Ex47
 {
 	public static void main(String[] args) {
 	  Scanner scanner = new Scanner(System.in);  
 	    int [] numero  = new int [20];
 	    
 	    //Entrada de dados
 	    for(int i=0; i <numero.length; i++){
 	   System.out.println("Digite um número: " + (i+1) + ": ");
 	   numero [i] = scanner.nextInt();
 	  
 	    }
 	    
 	    System.out.println("Você digitou: ");
 	    
 	    for (int i = numero.length - 1; i >= 0; i--) {
 	      System.out.println(numero[i]);
 	      
 	    }
 	}
 	    }