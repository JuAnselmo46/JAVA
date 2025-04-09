/******************************************************************************
A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade de broas a cada dia. 
Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar numa conta de poupança (10% do total arrecadado). 
Você foi contratado para fazer os cálculos para o dono. 
Com base nestes fatos, faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.

*******************************************************************************/

import java.util.Scanner;
public class Ex38

{
     public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int pao, broa, soma;
        Double spao, sbro, total, po;
        
        
         System.out.println("Infome quantos pãozinhos foram vendidos: ");
        pao=ler.nextInt();
        
        System.out.println("Infome quantos broas foram vendidos: ");
        broa=ler.nextInt(); 
        
        spao=pao*0.12;
        sbro=broa*1.50;
        total=sbro+spao;
        po=total*0.10;
        
        System.out.println("O total arrecadado é de " +total+ " e a quantia para guardar na poupança é de " +po+ " reais");
     }
}
        
        
        
        
        