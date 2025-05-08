package br.primeiroprograma.leitura;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu filme favorito:");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento?");
        int anoLancamento = leitura.nextInt();

        System.out.println("Qual a nota que você daria para esse filme?");
        double notaFilme = leitura.nextDouble();

        System.out.println();

        System.out.println("Filme digitado pelo usuário: " + filme);
        System.out.println("Ano de lançamento do filme: " + anoLancamento);
        System.out.println("Nota do filme informada pelo usuário: " + notaFilme);
    }
}
