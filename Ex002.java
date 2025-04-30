/******************************************************************************
Exercicio 002
Faça um Programa que peça dois números e imprima a soma.

*******************************************************************************/

import java.util.Scanner;
public class Ex002{
    
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        int num1, num2, soma;
        
        System.out.println("Informe o primeiro número: ");
        num1 =ler.nextInt();
        
        System.out.println("Informe o segundo número: ");
        num2 =ler.nextInt();
        
        soma = num1+num2;
        
        System.out.println("O resultado da soma será: "+soma);
        
    }
}