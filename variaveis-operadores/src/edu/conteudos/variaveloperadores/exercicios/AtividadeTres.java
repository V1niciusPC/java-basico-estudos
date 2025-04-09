package edu.conteudos.variaveloperadores.exercicios;

import java.util.Scanner;

public class AtividadeTres {
    //Criar um programa que recebe um número e exibe ele antes e depois do pré-incremento e pós-incremento.
    public static void main(String[] args) {
        int numero;

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor");
        numero = valor.nextInt();

        System.out.println("valor digitado: "+ numero); // valor digitato
        System.out.println("valor depois do incremento: "+ (++numero)); //valor alterado mostrado
        System.out.println("valor antes incremento: "+(numero++)); //valor mostrado e depois alterado
        System.out.println("valor final:"+numero); // valor depois da alteração

        valor.close();
    }
}
