package br.primeiroprograma.exercicios1;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("\nCrie um programa que realize a média de duas notas decimais e exiba o resultado.");

        double nota1 = 5.4;
        double nota2 = 7.8;
        double media= (nota1 + nota2) / 2;
        int mediaInteira = (int) media;

        System.out.println("\nMédia das notas é: " + media);
        System.out.println("Média das notas convertida para inteiro é: " + mediaInteira);
    }
}
