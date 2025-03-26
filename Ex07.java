/******************************************************************************

Ex 07 Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.
*******************************************************************************/
import java.util.Scanner;
public class Ex07
{
	public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int s, co, v;
        
        System.out.println("Infome qual foi o valor da venda: ");
        v=ler.nextInt();
    
        co= 1200*10/100;
        s= 1200+co;
        
         if (v >=2000)
        System.out.println("Você ganhara comissão e seu salário será" + s);
        
         else
       System.out.println("Você não ganhara a comissão e seu slário será 1200");
        
        
	}
}
