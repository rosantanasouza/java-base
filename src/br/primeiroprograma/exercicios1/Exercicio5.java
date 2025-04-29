package br.primeiroprograma.exercicios1;

public class Exercicio5 {
    public static void main(String[] args) {
        System.out.println("""
                Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa
                variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em
                dólares para reais e imprima o resultado formatado.""");

        double valorEmDolares = 650.80;
        double valorDolaremReal = 4.94;

        double valorDolarConvertidoEmReal = valorEmDolares * valorDolaremReal;
        System.out.printf("Valor total em Real: %.2f",valorDolarConvertidoEmReal);

    }
}
