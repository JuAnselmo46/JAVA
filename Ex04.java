/******************************************************************************

Ex04 A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.

*******************************************************************************/
import java.util.Scanner;
public class Ex04
{
      public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Double s, st2, st1;
        int a; 
        
        System.out.println("Informe o salário: ");
         s=ler.nextDouble();
         System.out.println("Informe o tempo de trabalho em anos: ");
         a=ler.nextInt();
         
         st2 = s*1.20;
         st1= s*1.10;
         
          if (a>=5)
        System.out.println("O salário é de: " + st2);
         
         if (a<=5)
        System.out.println("O salário é de: " + st1);
          
          
        
	}
}
