/******************************************************************************

Ex01 Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.

*******************************************************************************/
import java.util.Scanner;
public class Ex01 
{
  public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	 
		int soma,media, nota1, nota2;
		
		//Entrada de dados
       
        System.out.println("Informe a primeira nota de 0 a 10:");
       nota1=ler.nextInt();
       
       System.out.println("Informe a segunda nota de 0 a 10:");
       nota2=ler.nextInt();
       
       //Processamento
      soma = nota1 + nota2;
        media = soma/2;
    
      //Saída 
        if (media>=7)
          System.out.println("Aluno aprovado, sua média é: " + media);
     else 
           System.out.println("Aluno reprovado, sua média é: " + media);
        
        
	}
}