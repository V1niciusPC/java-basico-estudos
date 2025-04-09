package edu.conteudos.variaveloperadores.exercicios;

import java.util.Scanner;

public class AtividadeDois {
    //Criar um programa que calcula o novo salário de um funcionário com base em um percentual de aumento.
    public static void main(String[] args) {
        double salario,novoSalario;
        int porcentagem;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o valor do Salario:");
        salario = valor.nextDouble();
        
        System.out.println("Digite a porcentagem de aumento:");
        porcentagem = valor.nextInt();

        novoSalario = salario + (salario*porcentagem/100);

        System.out.println("O novo salario é R$"+ novoSalario);

        valor.close();
        
    
    }
}
