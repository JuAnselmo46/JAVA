/******************************************************************************

Ex13 Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
-
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
*******************************************************************************/

import java.util.Scanner;
public class Ex13

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int l, cm, a;
        
        
        System.out.println("Infome a largura: ");
        l=ler.nextInt();
        
         System.out.println("Infome o comprimento: ");
        cm=ler.nextInt();
        
        a=l*cm;
        
       if (a<100)
    System.out.println("O terreno é popular, e a area é de " +a+ " m2");
    
     else if (a>=100 && a<=500)
    System.out.println("O terreno é master, e a area é de " +a+ " m2");
    
     else  
    System.out.println("O terreno é vip, e a area é de " +a+ " m2");



        
     
      
      
     
     }
}