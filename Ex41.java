/******************************************************************************

      
Ex41- O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.  
 

*******************************************************************************/
import java.util.Scanner;
public class Ex41
{
	public static void main(String[] args) {
     Scanner ler = new Scanner (System.in); 
     Double peso, valor;
     
     System.out.println("Informe o peso do prato em quilos: ");
     peso=ler.nextDouble();
     
     valor=peso*12.00;
     
     System.out.println("O valor do prato será " +valor+ " reais.");
     peso=ler.nextDouble();
     
     
     
     
     
     
	}
}