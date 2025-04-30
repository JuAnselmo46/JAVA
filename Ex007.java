/******************************************************************************

Exercicio 007
Tendo como dados de entrada a altura de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58


*******************************************************************************/

import java.util.Scanner; 
public class Ex007 {
    
    public static void main (String [] args ) {
        Scanner ler = new Scanner (System.in);
        Double alt, peso;
        
        System.out.println("Informe sua altura: ");
        alt = ler.nextDouble();
        
        peso= (72.7*alt)-58;
        
        System.out.println("O seu peso ideal será: "+peso);
        
    }
}