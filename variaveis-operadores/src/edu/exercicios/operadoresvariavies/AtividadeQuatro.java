package edu.exercicios.operadoresvariavies;

import java.util.Scanner;

public class AtividadeQuatro {
    /*O usuário insere sua idade, e o programa verifica se ele
    é maior ou menor de idade usando o operador ternário.*/

    public static void main(String[] args) {
        int idade;
        Scanner valor = new Scanner(System.in);

        System.out.println("Digite Sua Idade:");
        idade = valor.nextInt();

        String resultado = idade>=18? "maior de idade":"menor de idade";
        System.out.println(resultado);

        valor.close();
    }
}
