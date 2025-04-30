/******************************************************************************

Exercicio 005
Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

*******************************************************************************/

import java.util.Scanner;
public class Ex005
{
    public static void main (String [] args) {
        Scanner ler = new Scanner (System.in);
        int porhora, meshora, salario;
        
      System.out.println("Informe quanto você ganha por hora: ");
      porhora = ler.nextInt();
      
      System.out.println("Informe o número de horas trabalhadas no mês: ");
      meshora = ler.nextInt();
      
      salario= porhora*meshora;
      
      System.out.println("O seu salário desse mês será de " +salario+ " reais");
      
      
        
    }
}