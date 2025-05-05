/******************************************************************************

 Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
*******************************************************************************/
import java.util.Scanner;
public class Ex011
{
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    double n;
    
    System.out.println ("Informe um valor: ");
    n=ler.nextDouble ();
    
    if (n>=0)
    System.out.println ("O numero " +n+ " é positivo");
    
    else 
    System.out.println ("O numero " +n+ " é negativo");
} 
}