/******************************************************************************
 Ex43 Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

*******************************************************************************/
import java.util.Scanner;
public class Ex43
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in); 
	Double salarioi, salarioau, salariof, aumento, imposto;
	
	  System.out.println("Informe o salário inicial: ");
     salarioi=ler.nextDouble();
     
    aumento=salarioi*0.15;
    salarioau=aumento+salarioi;
    
    imposto=salarioau*0.08;
    salariof=salarioau-imposto;
    
    System.out.println("O salário inicial é de " +salarioi+ " , salário com o aumento é de " +salarioau+ " e o salario final é " +salariof);
     
     
	
	
	}
}