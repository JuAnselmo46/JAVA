/******************************************************************************
1) Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada
*******************************************************************************/

public class Matriz2
{
    public static void main(String[] args) {
     
    int [][] matriz = new int [4][4];
    
    
    matriz[0][0] = 5;
    matriz[0][1] = 3;
    matriz[0][2] = 2;
    matriz[0][3] = 2;
     
    matriz[1][0] = 4;
    matriz[1][1] = 3;
    matriz[1][2] = 6;
    matriz[1][3] =  1;
    
    matriz[2][0] = 7;
    matriz[2][1] = 8;
    matriz[2][2] = 1;
    matriz[2][3] = 9;
    
    matriz[3][0] = 0;
    matriz[3][1] = 7;
    matriz[3][2] = 5;
    matriz[3][3] = 4;
    
    
   
    System.out.println("Matriz 4x4:");
    for (int i = 0; i < matriz.length; i++) { 
         for (int j = 0; j < matriz[i].length; j++) { 
             System.out.print (matriz [i][j] + " "); 
             
         }     
        System.out.println(); 
    }
}
}