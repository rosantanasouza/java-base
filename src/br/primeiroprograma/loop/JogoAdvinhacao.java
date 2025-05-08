package br.primeiroprograma.loop;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a opção abaixo para iniciar o jogo:");
        System.out.println("1 - Para iniciar o jogo");
        System.out.println("2 - Para encerrar o jogo");
        int escolhaJogo = scan.nextInt();

        if (escolhaJogo == 1) {
            System.out.println("\n**JOGO INICIADO**");
            System.out.println("\n**BEM VINDO AO JOGO DA ADVINHAÇÃO**");
            System.out.println("\nRegra 1 - VOCÊ TEM 5 TENTATIVAS PARA ACERTAR UM NÚMERO ENTRE 0 E 30 QUE O JOGO ESCOLHEU.");
            System.out.println("Regra 2 - DURANTE AS SUAS TENTATIVAS EU IREI DANDO DICAS SE VOCÊ DIGITOU UM NÚMERO MAIOR OU MENOR" +
                                " DO QUE O VALOR A SER ADVINHADO.");

            int numeroAleatorio = new Random().nextInt(30);
            int numeroDeTentativas = 5;
            int inputUsuario;

            while (numeroDeTentativas > 0) {
                System.out.println("\nDigite um número aleatório entre 0 e 50");
                inputUsuario = scan.nextInt();

                if (inputUsuario > numeroAleatorio) {
                    numeroDeTentativas--;
                    if (numeroDeTentativas > 0) {
                        System.out.println("\nO número " + inputUsuario + " é maior que o sorteado.");
                        System.out.println("Você ainda tem " + numeroDeTentativas + " tentativas.");
                    } else {
                        System.out.println("\nVocê esgotou todas as suas tentativas.\n" +
                                "O número a ser acertado era: " + numeroAleatorio + ". Boa sorte na próxima vez.");
                    }

                } else if (inputUsuario < numeroAleatorio) {
                    numeroDeTentativas--;
                    if (numeroDeTentativas > 0) {
                        System.out.println("\nO número " + inputUsuario + " é menor que o sorteado.");
                        System.out.println("Você ainda tem " + numeroDeTentativas + " tentativas.");
                    } else {
                        System.out.println("\nVocê esgotou todas as suas tentativas.\n" +
                                "O número a ser acertado era: " + numeroAleatorio + ". Boa sorte na próxima vez.");
                    }

                } else {
                    System.out.println("\nVocê acertou! o número aleatório é: " + numeroAleatorio + ". Parabéns!");
                    numeroDeTentativas = 0;
                }
            }
        } else if (escolhaJogo == 2) {
            System.out.println("Jogo encerrado.");
        } else {
            System.out.println("Valor digitado não existe entre as opções, jogo encerrado.");
        }
    }
}
