/******************************************************************************
Exercicio 006
Faça um Programa que peça a temperatura em graus Farenheit, 
transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9).
*******************************************************************************/

import java.util.Scanner;

public class Ex006 
{
    
    public static void main (String [] args) {
    Scanner ler = new Scanner (System.in);
    Double fa, ce;
    
    System.out.println("Informe a temperatura em graus Farenheit: ");
    fa = ler.nextDouble();
    
    ce= (5 * (fa-32) / 9);
    
    System.out.println("A temperatura em graus celsius será: "+ce);
}
}