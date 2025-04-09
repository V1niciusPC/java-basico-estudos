package edu.conteudos.variaveloperadores.exercicios;

import java.util.Scanner;

public class AtividadeQuatro {
    /*O usuário insere sua idade, e o programa verifica se ele
    é maior ou menor de idade usando o operador ternário.*/

    public static void main(String[] args) {
        int idade;//variavel que recebera idade
        Scanner valor = new Scanner(System.in); //variavel que recebe um metodo scanner.

        System.out.println("Digite Sua Idade:");//digite a idade
        idade = valor.nextInt(); //a variavel idade recebe a informação armazenada na Scanner valor

        String resultado = idade>=18? "maior de idade":"menor de idade";
        /*Uso do operador ternario que faz uma comparação
         * se idade for maior ou igual a 18 monstrarar maior de idade
         * caso contrario sera menor de idade.
         * essa informação sera armazenada na variavel resultado
         */
        System.out.println(resultado); // imprimi a informação armazenada na variavel.

        valor.close();
    }
}
