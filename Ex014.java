/******************************************************************************

As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante :
aumento de 5% Após o aumento ser realizado,
informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.

*******************************************************************************/

import java.util.Scanner;
public class Ex014 {
    
    
     public static void main(String[]args) {
         Scanner ler = new Scanner(System.in);
         System.out.println("Informe o seu atual salário: ");
         double salarioini = ler.nextDouble();
         double porcentagemaumento;
         
         if (salarioini <= 280) {
             porcentagemaumento = 20.0;
            } else if (salarioini <= 700) {
                 porcentagemaumento = 15;
             } else if (salarioini <= 1500) {
                 porcentagemaumento = 10;
             }  else {
                 porcentagemaumento = 5;
             }
             
        double valoraumento = salarioini * (porcentagemaumento / 100);
        double salariofim = salarioini + valoraumento;
        
        System.out.println("\nSalário antes do reajuste: " + salarioini);
        System.out.println("O percentual de aumento aplicado: " +porcentagemaumento);
        System.out.println("Valor do aumento: " + valoraumento);
        System.out.println("O novo salário: " + salariofim);
         }
     }