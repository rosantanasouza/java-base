package br.primeiroprograma.loop;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int numeroDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar.");
            nota = leitura.nextDouble();

           if (nota != -1) {
              mediaAvaliacao += nota;
              numeroDeNotas++;
           }
            if (numeroDeNotas == 0) {
                System.out.println("Não pode encerrar o programa sem inserir ao menos 1 nota.");
                nota = 0;
            }
        }

        System.out.println("A média de avaliações para o filme é: " + mediaAvaliacao/numeroDeNotas);
    }
}
