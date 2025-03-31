package edu.exercicios.operadoresvariavies;

import java.util.Scanner;

public class AtividadeCinco {
    /* Objetivo: Criar um programa que recebe duas notas de um aluno, calcula a média e determina
    se ele está aprovado, em recuperação ou reprovado,
    O aluno pode receber um bônus de 0.5 na média, se for aplicado.
    O programa verifica se o aluno tem presença acima de 75%. Caso contrário,
    mesmo aprovado, ele será reprovado por faltas.*/

    public static void main(String[] args) {
        String aluno;
        double notaUm,notaDois;
        int presenca;
        boolean bonus;
        double media;

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        aluno = valor.nextLine();

        System.out.println("Digite a primeira Nota do Aluno:");
        notaUm = valor.nextDouble();
        System.out.println("Digite a Segunda Nota do Aluno:");
        notaDois = valor.nextDouble();

       media = (notaUm+notaDois)/2;

       System.out.println("Aluno recebeu bonus de 0.5 na media? true/false");
       bonus = valor.nextBoolean();

       media = bonus? media + 0.5: media;

       System.out.println("Digite a porcentagem de presença do aluno:");
       presenca = valor.nextInt();

       String status = (media>=7)?"Aprovado": (media>=5 && media<7)?"Recuperação": "Reprovado";

       status = presenca<75?"Reprovado por falta":status;

       // informações tela
       System.out.println("===RESULTADO====");
       System.out.println("O aluno: "+ aluno);
       System.out.println("Com a media Final: "+ media);
       System.out.println("Com a porcentagem de presença: " +presenca);
       System.out.println("situação: "+ status);

       valor.close();





    }
}