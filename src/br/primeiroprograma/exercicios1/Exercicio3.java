package br.primeiroprograma.exercicios1;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("\nDeclare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.\n");

        char letra = 'R';
        String msg = "Letra digitada";
        String mensagem = letra + " " + msg;

        System.out.println(mensagem);
    }
}
