/******************************************************************************

 Ex23 Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas. 
 Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. 
 As faixas etárias são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.


*******************************************************************************/
import java.util.Scanner;
public class Ex23 {
 
 public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         
         double soma1a10 = 0, soma11a20 = 0, soma21a30 = 0, somaacimaDe31 = 0, peso=0;
         int idade=0, entre1e10 = 0, entre11e20 = 0, entre21e30 = 0, maior31 = 0;
         
         for (int i = 1; i <= 5; i++) {
         System.out.print("Informe a idade: ");
          idade = ler.nextInt();
         
          System.out.print("Informe o peso: ");
        peso = ler.nextInt();
         
         ler.nextLine();
         
         
             
        if (idade >= 1 && idade <= 10) {
             soma1a10 += peso;
             entre1e10++;
         } else if (idade >= 11 && idade <= 20) {
              soma11a20 += peso;
             entre11e20++;
         } else if (idade >= 21 && idade <= 30) {
            soma21a30 += peso;
             entre21e30++;
         } else if (idade > 31) {
             somaacimaDe31 +=
              maior31++;
         }
     }
         
         
    if (entre1e10 > 0) {
            System.out.println("Média dos pesos (1 a 10 anos): " + (soma1a10 / entre1e10));
        }
        if ( entre11e20 > 0) {
            System.out.println("Média dos pesos (11 a 20 anos): " + (soma11a20 /  entre11e20));
        }
        if (entre21e30 > 0) {
            System.out.println("Média dos pesos (21 a 30 anos): " + (soma21a30 / entre21e30));
        }
        if (maior31 > 0) {
            System.out.println("Média dos pesos (acima de 31 anos): " + (somaacimaDe31 / maior31));
        }
        
    }
}
