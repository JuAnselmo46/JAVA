/******************************************************************************
 Escreva um programa que calcule a soma dos números de 1 a 15.

*******************************************************************************/

public class Ex15 {
    public static void main(String[] args) {
        int resultado = 0; 
        
        for (int i = 1; i <= 15; i++) {
            resultado += i; 
        }
        System.out.println("A soma dos números de 1 a 15 é: " + resultado);
    }
}