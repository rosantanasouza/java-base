package br.primeiroprograma.exercicios1;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.println("""
                 
                 Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
                 Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma 
                 mensagem.""");

        double precoProduto = 20.63;
        int quantidade = 10;

        double total = precoProduto * quantidade;
        int totalInt = (int) total;

        System.out.println(totalInt);

    }
}
