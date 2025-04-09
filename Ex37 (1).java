/*****************************************************************************
 
Ex37 Faça um algoritmo para calcular quantas ferraduras 
são necessárias para equipar todos os cavalos comprados para um haras.

*******************************************************************************/
import java.util.Scanner;
public class Ex37

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int qtf, cavalo;
        
         System.out.println("Infome quantos cavalos foram comprados: ");
        cavalo=ler.nextInt();
        
        qtf= cavalo*4;
         
        System.out.println("Seram necessarias " + qtf+ " ferraduras para cavalo");
     }
}
        
        
        
        
        