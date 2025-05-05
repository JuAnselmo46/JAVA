/******************************************************************************

Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar: A mensagem "Aprovado", se a média alcançada for maior ou igual a sete; A mensagem "Reprovado", se a média for menor do que sete; A mensagem "Aprovado com Distinção", se a média for igual a dez.


*******************************************************************************/
import java.util.Scanner;
public class Ex012
{
    
    public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    int n1, n2, m;
    
    System.out.println("Informe a primeira nota: ");
    n1=ler.nextInt();
    
    System.out.println("Informe a segunda nota:");
    n2=ler.nextInt();
    
    m= (n1+n2)/2;
    
    if (m ==10 ) {
    System.out.println ("Voce foi aprovado com distinção! "+ m );
   } else if ( m >= 7) {
    System.out.println ("Voce foi aprovado "+ m );
  }  else {
     System.out.println ("Voce foi reprovado "+ m );
  }
    }
}