/******************************************************************************

Ex12 - Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.

*******************************************************************************/
import java.util.Scanner;
public class Ex12

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int a, al, i, flt, pass;
        
        
        System.out.println("Infome o seu ano de nascimento: ");
        a=ler.nextInt();
        
        al=2025-a;
        flt=al-18;
        pass=18-al;
        
       if (al<18)
    System.out.println("Não é possível se alistar, falta " + pass + " anos");
    
    else
    System.out.println("Ja se passaram " + flt + " anos do alistamento");

        
     
      
      
     
     }
     
}