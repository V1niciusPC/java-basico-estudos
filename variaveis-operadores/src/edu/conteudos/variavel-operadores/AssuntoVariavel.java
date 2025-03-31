package edu.conteudos;

public class AssuntoVariavel {
    // ao declarar uma variavel cuidado ao não chama-la isso pode ocorrer em algum erro.

    //tipos de variveis
    public static void main(String[] args) {
		byte idade = 123;
		
		short ano = 2021;
		
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		//tem que colocar L no final,para identificar o tipo, pode da erro.
		
		float pi = 3.14F; // tem que colocar um F no final caso pode da erro.
        // se for uma variavel imutável coloque toda em maiuscula PI.
		
		double salario = 1275.33;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);
	}
}
