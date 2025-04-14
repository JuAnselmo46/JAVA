/******************************************************************************

     Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. 
O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final a quantidade de votos por candidato e o vencedor. 
Empates devem ser considerados.

*******************************************************************************/
import java.util.Scanner;
public class Desafio1
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    int Isabela = 0, Giovanna = 0, Juliana = 0; 
        int voto;
		
		do {
		    System.out.println("Escolha um candidato: ");
		    System.out.println("1 - Isabela");
		    System.out.println("2 - Giovanna");
		    System.out.println("3 - Juliana");
		    System.out.println("0 - Sair");
		   voto = scanner.nextInt();
		    
	     switch (voto) {
                case 1:
                    Isabela++;
                    break;
                case 2:
                    Giovanna++;
                    break;
                case 3:
                     Juliana++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Voto inválido, escolha um número entre 1, 2, e 3");
	     }
		} while (voto != 0);
	     
	    System.out.println("\nResultado da Votação:");
        System.out.println("Candidato Isabela: " + Isabela + " votos");
        System.out.println("Candidato Giovanna: " + Giovanna + " votos");
        System.out.println("Candidato Juliana: " + Juliana + " votos");
        
        if (Isabela > Giovanna && Isabela > Juliana) {
           System.out.println("Isabela é a vencedora!"); }
           else if (Giovanna > Isabela && Giovanna > Juliana){
           System.out.println("Giovanna é a vencedora!"); }
           else if (Juliana > Giovanna && Juliana > Isabela) {
           System.out.println("Juliana é a vencedora!"); }
           else if (Giovanna == Isabela  && Isabela == Juliana) {
           System.out.println("Vamos para o segundo turno"); }
           else {
            System.out.println("Houve um empate entre os candidatos."); }
	}
}