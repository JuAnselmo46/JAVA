/*******************************************
 3 - Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota inserida, o sistema deve classificar como:

Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a contagem de cada classificação.

 
 *****************************************/
 
 import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double somanotas = 0;
        int contadorN = 0, contadorE = 0, contadorB = 0,  contadorR = 0, contadorI = 0;
        
       
          while (true) {
            System.out.print("Digite uma nota entre 0 e 10 (ou -1 para sair): ");
            double nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Por favor, insira uma nota entre 0 e 10.");
                continue;
            }
            
            somanotas += nota;
            contadorN++;

            
            if (nota >= 9) {
                contadorE++;
            } else if (nota >= 7) {
                contadorB++;
            } else if (nota >= 5) {
                contadorR++;
            } else {
                contadorI++;
            }
        }


        double media = (contadorN > 0) ? (somanotas / contadorN) : 0;

       
        System.out.println("Resultados:");
        System.out.println("Média geral: " + media);
        System.out.println("Total de notas cadastradas: " + contadorN);
        System.out.println("----- Classificações -----");
        System.out.println("Excelente: " + contadorE);
        System.out.println("Bom: " + contadorB);
        System.out.println("Regular: " + contadorR);
        System.out.println("Insuficiente: " + contadorI);
    }
}