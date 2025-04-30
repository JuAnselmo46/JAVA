/******************************************************************************
Exercicio 009
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
*******************************************************************************/

import java.util.Scanner;
public class Ex009 
{  
    public static void main (String [] args) {
     Scanner ler = new Scanner (System.in);
    double metros, tinta, qtdlata, valor; 
    
    System.out.println("Informe o tamanho em metros quadrados da área a ser pintada: ");
    metros = ler.nextDouble();
    
    tinta= metros/3;
    qtdlata= tinta/18;
    valor= qtdlata*80;
    
    
    System.out.println ("Você precisara de " +qtdlata+ " de latas de tinta e o valor total será de: "+valor);
    
    
    
    }
   }