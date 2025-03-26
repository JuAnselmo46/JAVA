/******************************************************************************

Ex05 Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.
*******************************************************************************/
import java.util.Scanner;
public class Ex05
{
	 public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Double vlem, sa, vp, lp;
        int np;
        
        System.out.println("Infome o valor do empréstimo: ");
        vlem=ler.nextDouble();
        
        System.out.println("Infome o número de parcelas: ");
        np=ler.nextInt(); 
        
        System.out.println("Infome o salário: ");
       sa=ler.nextDouble();
       
       vp=vlem/np;
       lp=sa*0.30;
       
       if (vp <=lp)
        System.out.println("O empréstimo foi aprovado");
      else 
      System.out.println("O empréstimo não foi aprovado");
	 
	 }
	 
}
      
        
       
     
        
       
        
        
	

