/******************************************************************************

Ex08  Construa um algoritmo que, tendo como
dados de entrada a altura (H) e o sexo (S) de uma pessoa calcule e apresente
seu peso ideal utilizando as seguintes fórmulas: Para homens: Peso ideal (P) =
(72,7 * H) – 58 Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7
*******************************************************************************/
import java.util.Scanner;
public class Ex08

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int hm, ml, s; 
        Double pesoh, pesom, h;
        
        System.out.println("Infome o sexo da pessoa, 1 para homem e 2 para mulher: ");
        s=ler.nextInt();
        
        System.out.println("Infome a altura em metros: ");
        h=ler.nextDouble(); 
       
      pesoh= (71.7 * h)-58;
      pesom= (62.1 * h)-44.7;
       
       if (s==1)
        System.out.println("O peso ideal é: " + pesoh);
      if (s==2);
      System.out.println("O peso ideal é: " + pesom);
	 
	 }
	 
}
      
        
        

