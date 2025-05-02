package br.primeiroprograma.condicionais;

public class Condicionais {
    public static void main(String[] args) {

        //Basicamente, as estruturas de controle em Java se dividem em dois grandes grupos:
        //
        //1. Estruturas de Seleção (ou Decisão): Permitem que o seu programa execute diferentes blocos de código
        // dependendo de uma condição ser verdadeira ou falsa. As principais são:

        //if: A mais básica. Executa um bloco de código se uma determinada condição for verdadeira.
        int idade = 20;
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }

        //if-else: Permite executar um bloco de código se a condição for verdadeira e outro bloco diferente se a
        // condição for falsa.
        int nota = 6;
        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        //if-else-if: Usada para testar múltiplas condições em sequência. O primeiro bloco cuja condição for verdadeira
        // será executado.
        int media = 5;
        if (media >= 7) {
            System.out.println("Aprovado com média " + media);
        } else if (media >= 5) {
            System.out.println("Em recuperação com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }

        //switch: Uma alternativa para múltiplos if-else-if quando você precisa comparar uma variável com diferentes
        // valores constantes. É mais eficiente para esse tipo de comparação.
        int diaSemana = 3;
        String nomeDia;
        switch (diaSemana) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido";
        }
        System.out.println("Hoje é " + nomeDia);
    }
}
