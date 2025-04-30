/******************************************************************************
Exercicio 004
Faça um Programa que converta metros para centímetros.
*******************************************************************************/

import java.util.Scanner;
public class Ex004

{
    
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in); 
        Double cm, m;
        
        System.out.println("Informe os mestros para convertem em centímetros: ");
        m = ler.nextDouble();
        
        cm = m*100;
        
        System.out.println("A conversão para centímetros sera: "+cm);
        
        
        
    }
}