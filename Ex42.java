/******************************************************************************

Ex42 Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.

*******************************************************************************/

import java.util.Scanner;
public class Ex42 {

     public static void main(String[] args) {
     Scanner ler = new Scanner (System.in); 
     int camip, camim, camig, cpp, cmp, cgp, valort;
     
      System.out.println("Informe a quantidade de camisetas pequenas: ");
     camip=ler.nextInt();
     
      System.out.println("Informe a quantidade de camisetas médias: ");
     camim=ler.nextInt();
     
      System.out.println("Informe a quantidade de camisetas grandes: ");
     camig=ler.nextInt();
     
     cpp=camip*10;
     cmp=camim*12;
     cgp=camig*15;
     
     valort=cpp+cmp+cgp;
     
      System.out.println("O valor arrecadado é de: " +valort);
     
     }
	
}