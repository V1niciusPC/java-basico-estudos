package edu.exercicios.operadoresvariavies;

import java.util.Scanner;

public class AtividadeCinco {
    /* Objetivo: Criar um programa que recebe duas notas de um aluno, calcula a média e determina
    se ele está aprovado, em recuperação ou reprovado,
    O aluno pode receber um bônus de 0.5 na média, se for aplicado.
    O programa verifica se o aluno tem presença acima de 75%. Caso contrário,
    mesmo aprovado, ele será reprovado por faltas.*/

    public static void main(String[] args) {
        String aluno; //variavel que recebera nome aluno
        double notaUm,notaDois; //variaveis que receberam as notas
        int presenca;//variavel que recebera a porcentagem de presença
        boolean bonus; // variavel receberar true ou false
        double media; // varial que vai calcular a media dos alunos
        String status;// informara a situação do aluno

        Scanner valor = new Scanner(System.in); // nomeia valor como variavel principal scanner

        System.out.println("Digite o nome do aluno:");
        aluno = valor.nextLine(); // variavel aluno recebe informação armazenada na valor.nexLine

        System.out.println("Digite a primeira Nota do Aluno:");
        notaUm = valor.nextDouble();// recebe informação primeira nota
        System.out.println("Digite a Segunda Nota do Aluno:");
        notaDois = valor.nextDouble();// rece informação segunda nota

       media = (notaUm+notaDois)/2; // faz a media das notas, somando e depois dividindo e armazena na media

       System.out.println("Aluno recebeu bonus de 0.5 na media? true/false");
       bonus = valor.nextBoolean();// armazena se a informação é falsa ou verdadeira

       media = bonus? media + 0.5: media;
       /*faz uma comparação. como a informação na bonus é uma boolean
        * logo só de colocar o operador ternario irar funcionar
        em resumo esta falando que se a informação bonus for verdadeira
        logo o aluno rece +0.5 na media, caso seja falso ele retorna a media normal.
        essa informação é registrada na variavel media.
        */

       System.out.println("Digite a porcentagem de presença do aluno:");
       presenca = valor.nextInt(); // rece a informação do valor e armazena em presença como tipo int

        status = (media>=7)?"Aprovado": (media>=5 && media<7)?"Recuperação": "Reprovado";
        /*Aqui é outro uso do operador ternario de comparação, porem com outro operador ternario nele
         * se a informação na media for maior ou igual a 7 ser verdadeira, sera registrado na variavel
         * status a informação "aprovado", caso seja mentira ira fazer outra comparação que seria 
         * se a media for maior ou igual a 5 ou menor que 7, se essa informação ser verdadeira
         * vai armazena na variavel status"Recuperação, caso seja mentira, sera registrado "Reprovado"
         */

       status = presenca<75?"Reprovado por falta":status;
       /*Aqui seria outro sistema de comparação ainda armazena essa informação na variavel status
        * depois de fazer a comparação anterior acima ele entra nessa comparação e verifica se a
        informação armazenada presença é menor que 75 se for verdadeiro armazena na varival status
        a informação "Reprovado por falta, caso seja mentira só iria retornar a informação que estava
        armazena na variavel status anterior."
        */

       // informações tela imprimitas
       System.out.println("===RESULTADO====");
       System.out.println("O aluno: "+ aluno);
       System.out.println("Com a media Final: "+ media);
       System.out.println("Com a porcentagem de presença: " +presenca);
       System.out.println("situação: "+ status);

       valor.close();





    }
}