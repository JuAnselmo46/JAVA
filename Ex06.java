/******************************************************************************

 Ex06 Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.

*******************************************************************************/
import java.util.Scanner;
public class Ex06
{
	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n, cla;
        
        System.out.println("Infome um número: ");
         n=ler.nextInt();
        
        cla=n%2;
        
       if (cla==0)
        System.out.println("O número é par");
        
       else
       System.out.println("O número é ímpar");
        
        
        
	}
}
