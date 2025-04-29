package br.primeiroprograma.exercicios1;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("""
                Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, 
                representando o preço original de um produto. Em seguida, declare uma variável do tipo double
                 percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
                 Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
                """);

        double precoOriginal = 2.30;
        System.out.printf("Preço do original do produto: %.2f\n", precoOriginal);

        double percentualDesconto = 20;

        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        System.out.printf("O valor do desconto é: %.2f\n", valorDesconto);

        double valorProdutoComDesconto = precoOriginal - valorDesconto;
        System.out.printf("O valor do produto com desconto é: %.2f", valorProdutoComDesconto);
    }
}
