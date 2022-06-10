# metodos-java-primeiraaula
# Criação
//
## Calculadora
//

package br.com.dio;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " por " + numero2 + " é " + resultado);
    }

}

## main

package br.com.dio;

/**
 * Classe principal dos exercícios da Aula 1 de Métodos.
 */
public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        calculadora Calculadora = null;
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        mensagem.obterMensagem(9);
        mensagem.obterMensagem(14);
        mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        emprestimo Emprestimo = null;
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}

//
## Empréstimo

package br.com.dio;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public  class emprestimo {


    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {

        return 3;
    }

    public static double getTaxaDuasParcelas() {

        return 0.3;
    }

    public static double getTaxaTresParcelas() {

        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }
    }
}

//
## Mensagem

package br.com.dio;

/**
 * Classe de exemplo para o exercício da Aula 1 de Métodos.
 */
public class mensagem {


public static void obterMensagem(int hora) {

        switch (hora) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default:
                System.out.println("Hora inválida.");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Bom noite!");
    }

}

//

## Resultado

C:\Users\Irene\.jdks\openjdk-18.0.1.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\lib\idea_rt.jar=62002:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Irene\Documents\entendendo-metodo-java\metodo-java-aula1\out\production\metodo-java-aula1 br.com.dio.Main
Exercicio calculadora
A soma de 3.0 mais 6.0   9.0
A subtracao de 9.0 menos 1.8   7.2
A multiplicaco de 7.0 vezes 8.0   56.0
A divisao de 5.0 por 2.5   2.0
Exercicio mensagem
Bom dia!
Bom tarde!
Bom noite!
Exercicio emprestimo
Valor final do emprestimo para 2 parcelas: R$ 1300.0
Valor final do emprestimo para 3 parcelas: R$ 1450.0
Quantidade de parcelas nao aceita.

Process finished with exit code 0
