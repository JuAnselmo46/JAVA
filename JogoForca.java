/******************************************************************************

       ) Desenvolver o jogo da Forca. Favor seguir algumas regras:
    a) Pedir para o jogador 1 digitar a palavra que será adivinhada pelo jogador 2
    b) Digitar o nome do jogador 2 para iniciar o jogo.
    c) A cada letra digitada mostrar a letra certa / errada e um desenho mostrando a perda de uma parte do corpo, se a letra estiver errada.
    d) O jogador 2 terá 5 tentativas de adivinhar a palavra correta.
    e) Se o jogo finalizar, mostrar o nome do jogador 2 e se ele ganhou ou perdeu.

*******************************************************************************/

import java.util.Scanner;

public class JogoForca {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Jogador 1, digite a palavra para o jogo da forca: ");
        String palavra = scanner.nextLine().toLowerCase().trim(); //.toLowerCase() Converte todas as letras da String para minúsculas.
        limparTela();                                             // .trim() Remove espaços em branco no começo e no final da string.

        System.out.print("Jogador 2, digite seu nome: ");
        String jogador2 = scanner.nextLine();

        int tentativasRestantes = 5;
        char[] letrasDescobertas = new char[palavra.length()]; // palavra.length() retorna o número de caracteres da string.
        for (int i = 0; i < letrasDescobertas.length; i++) {
            letrasDescobertas[i] = '_';
        }

        boolean venceu = false; //boolean é um tipo de dado que só pode ter dois valores possíveis: true (verdadeiro) false (falso)



        while (tentativasRestantes > 0 && !venceu) {
            System.out.println("\nPalavra: " + new String(letrasDescobertas));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toLowerCase().charAt(0);  //O método charAt(int index) é usado em Java para pegar um único caractere de uma String, com base na posição (índice).

            boolean letraCerta = false;
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    letrasDescobertas[i] = letra;
                    letraCerta = true;
                }
            }

            if (!letraCerta) {   //Aqui, letraCerta é uma variável do tipo boolean.Ela vale true se o jogador acertou a letra.!letraCerta significa: "se a letra não está certa".Ou seja, o jogador errou.
                tentativasRestantes--;
                mostrarBoneco(5 - tentativasRestantes);
                System.out.println("Letra errada!");
            } else {
                System.out.println("Boa! Letra correta!");
            }

            if (new String(letrasDescobertas).equals(palavra)) { //.equals() é usado para comparar o conteúdo de duas strings (ou outros objetos) 
                venceu = true;
            }
        }

        if (venceu) {
            System.out.println("\nParabéns " + jogador2 + "! Você adivinhou a palavra: " + palavra);
        } else {
            mostrarBoneco(5);
            System.out.println("Jogador: " + jogador2);
            System.out.println("Você perdeu! A palavra era: " + palavra);
        }
    }

    static void mostrarBoneco(int erros) {
        System.out.println("                _____");
        System.out.println("                |   |");

        switch (erros) {
            case 0 -> {
                System.out.println("                |     ");
                System.out.println("                |     ");
                System.out.println("                |     ");
                System.out.println("                |     ");
            }
            case 1 -> {
                System.out.println("                |  (ツ)");
                System.out.println("                |     ");
                System.out.println("                |     ");
                System.out.println("                |     ");
            }
            case 2 -> {
                System.out.println("                |  (ツ)");
                System.out.println("                |   | ");
                System.out.println("                |     ");
                System.out.println("                |     ");
            }
            case 3 -> {
                System.out.println("                |  (ツ)");
                System.out.println("                |  -| ");
                System.out.println("                |     ");
                System.out.println("                |     ");
            }
            case 4 -> {
                System.out.println("                |  (ツ)");
                System.out.println("                |  -|-");
                System.out.println("                |     ");
                System.out.println("                |     ");
            }
            case 5 -> {
                System.out.println("                |  (ツ)");
                System.out.println("                |  -|-");
                System.out.println("                |  /'\\");
                System.out.println("                |     ");
                System.out.println("             __|__ ");
                System.out.println("!!!! GAME OVER !!!");
            }
        }
    }

    static void limparTela() { // criado no código como uma forma de limpar a tela ou, na verdade, simular que a tela foi limpa.
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }
}
