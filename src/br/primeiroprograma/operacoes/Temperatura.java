package br.primeiroprograma.operacoes;

public class Temperatura {
    public static void main(String[] args) {

        System.out.println("Bem-vindo ao conversor de temperatudoa");
        System.out.println("Aqui vamos mostrar a conversão de temperatuda de graus celsius para Fahrenheit");
        System.out.println("Abaixo temos a temperatura calculada com base na temperatura celsius digitada.\n");

        double temperaturaCelsius = 22;
        double calculoParaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        int temperaturaFahrenheitInteira = (int) calculoParaFahrenheit; //cast de tipo de valor

        System.out.println("Temperatura em Fahrenheit é:");
        System.out.println("-> "+calculoParaFahrenheit+"\n");

        System.out.println("Temperatura em Fahrenheit convertida para  inteiro");
        System.out.println("-> "+temperaturaFahrenheitInteira);
    }
}
