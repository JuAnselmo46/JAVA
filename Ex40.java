/******************************************************************************
Ex40 Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.

*******************************************************************************/
import java.util.Scanner;
public class Ex40
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	Double  pl, gasolina, litotal; 
	
	 System.out.println("Qual é o preço do litro da gasolina: ");
     pl=ler.nextDouble();
     
     System.out.println("Quanto você pagou pela gasolina: ");
     gasolina=ler.nextDouble();
     
     litotal=gasolina/pl;
     
     System.out.println("Você encheu o tanque com " +litotal+ " litros de gasolina");
     gasolina=ler.nextDouble();
     
     
     
     
     
     
	}
}