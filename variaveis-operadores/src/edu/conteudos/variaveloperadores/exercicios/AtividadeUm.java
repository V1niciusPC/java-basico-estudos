package edu.conteudos.variaveloperadores.exercicios;

import java.util.Scanner;

public class AtividadeUm {
    // Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.

    public static void main(String[] args) {
        double base,altura,area,perimetro; // Declara as variaveis do tipo double
        Scanner dados = new Scanner(System.in); 
        /*cria uma variavel chamada dados que recebe um metodo(obejto)
        chamado scanner*/

        System.out.println("Digite a base do retangulo"); // mostra na tela pra digitar a base
        base = dados.nextDouble(); // armazena o dado na variavel base
        System.out.println("\n digite a altura do retangulo");
        altura = dados.nextDouble();

        area = base*altura; // multiplica a base com a altura e armazena o valor na variavel area
        perimetro = (base*2)+(altura*2);

        System.out.println("A área do Retangulo é: "+ area); // mostra na tela
        System.out.println("\n O Perimetro do Retangulo é: " + perimetro); // mostra na tela.

        dados.close();
    }
}
    