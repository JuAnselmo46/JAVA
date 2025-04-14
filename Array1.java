/******************************************************************************

Exemplo: Utilizando Array e visualizando a saída de dados

*******************************************************************************/
import java.util.Scanner;
public class Array1
{
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);  
	    String[] nome = new String [5];
	    int [] idade = new int [5];
	    
	    //Entrada de dados
	    for(int i=0; i <idade.length; i++){
	   System.out.println("Digite o  nome da pessoa" + (i+1) + ": ");
	   nome [i] = scanner.nextLine();
	   
	   System.out.println("Digite a idade da pessoa " + (i+1) + ": ");
	   idade [i] = scanner.nextInt();
	   scanner.nextLine();
	   
	    }
	    
	    System.out.println("Pessoas maiores de idade: ");
	    

	    for(int i=0; i < 5; i++){
	        if (idade[i] >= 18) {
	   System.out.println("Nome: " +nome[1]+ ", Idade:" +idade[i]);
	        }
	}
	}
}
