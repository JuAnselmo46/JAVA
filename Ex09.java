/******************************************************************************

 Ex 09 Construa um algoritmo para calcular o
valor a ser pago pelo período de estacionamento do automóvel (PAG). O usuário
entra com os seguintes dados: hora (HE) e minuto (ME) de entrada, hora (HS) e
minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou
seja, se passar um minuto ele cobra a hora inteira. O valor cobrado pelo
estacionamento é: •R$ 4,00 para 1 hora de estacionamento •R$ 6,00 para 2 horas
de estacionamento •R$ 1,00 por hora adicional (acima de 2 horas)

*******************************************************************************/
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Hora de entrada: ");
        int horaEntrada = scanner.nextInt();

        System.out.print("Minuto de entrada: ");
        int minutoEntrada = scanner.nextInt();

        System.out.print("Hora de saída: ");
        int horaSaida = scanner.nextInt();

        System.out.print("Minuto de saída: ");
        int minutoSaida = scanner.nextInt();

        
        int minutosEntrada = horaEntrada * 60 + minutoEntrada;
        int minutosSaida = horaSaida * 60 + minutoSaida;
        int duracaoMinutos = minutosSaida - minutosEntrada;

        
        int duracaoHoras = (duracaoMinutos + 59) / 60; 

       
        int valor = 0;
        if (duracaoHoras == 1) {
            valor = 4;
        } else if (duracaoHoras == 2) {
            valor = 6; 
        } else if (duracaoHoras > 2) {
            valor = 6 + (duracaoHoras - 2); 
        }

        
        System.out.println("Duração do estacionamento: " + duracaoHoras + " horas.");
        System.out.println("Valor a ser pago: R$" + valor);

        scanner.close();
    }
}
