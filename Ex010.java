
/******************************************************************************
Faça um Programa que peça dois números e imprima o maior deles.

*******************************************************************************/
import java.util.Scanner;
public class Ex010
{
    public static void main (String [] args) {
    Scanner ler = new Scanner (System.in);
    Double n1, n2, maiorNumero;
    
    System.out.println("Entre com o primero numero:");
    n1= ler.nextDouble ();
    
    System.out.println ("Entre com o segundo numero:");
    n2= ler.nextDouble ();
    
    if (n1>n2)
    System.out.println ("O primeiro numero é maior:" + n1);
    
    if (n1<n2)
    System.out.println ("O segundo numero é maior: " + n2);
    
    }
}