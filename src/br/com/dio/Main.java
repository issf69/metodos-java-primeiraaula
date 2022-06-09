package br.com.dio;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */
public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercicio calculadora");
        calculadora Calculadora = null;
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercicio mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercicio emprestimo");
        emprestimo Emprestimo = null;
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
