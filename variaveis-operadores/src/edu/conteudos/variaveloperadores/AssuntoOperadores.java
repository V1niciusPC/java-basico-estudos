package edu.conteudos.variaveloperadores;

public class AssuntoOperadores {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //operadores de atribuição <=>
        int idade =25;
        String nomeCompleto = "vinicius";
        char sexo = 'M';

        System.out.println("Nome:"+nomeCompleto +"\nidade:"+idade + "\nSexo:"+sexo );
        // ao colocar \n a informação vai para baixo.

        System.out.println("======== operações numericas========");


        //Operadores Numericos
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // mostra os restos de um calculo
        double resultado = (10 * 7) + (20/4);

        System.out.println(subtração);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);
        System.out.println("======== operações Unarios========");

        //  Operadores Unários
        int numero = 5;
        System.out.println(- numero);// não altera o valor na varial, só deixa negativo
        System.out.println(numero); 

        numero= -numero;
        System.out.println(numero);// aqui sim muda a varial por causa do calculo na linha anterior

        numero = numero*-1;
        System.out.println(numero); // volta para o possitivo 
        System.out.println("INCREMENTAÇÃO");

        //incrementar
        //ao adicionar ++ depois ou antes de uma variavel adiciona +1 no seu valor
        System.out.println(numero++);// Agora numero vale 6; sainda:5
        System.out.println(numero); //sainda: 6
        System.out.println(++ numero); //agora numero vale 7;saída:7
        //DEPENDENDO DA ORDEM DO ++ o incremento vai acontecer antes ou depois.

        System.out.println("======== operações Ternario========");
        
        // operador ternario
        int a, b;
        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso"; */

            //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String valoString= a==b?"verdadeiro":"falso";
            // <coparação> ? "se for verdadeiro": "se for falso"
            System.out.println(valoString);
            System.out.println("======== operações relacionais========");

            //operadores Relacionais.
            //classe Operadores.java
            int numero1 = 1;
            int numero2 = 2;

            if(numero1 > numero2)
                System.out.print("Numero 1 maior que numero 2");

            if(numero1 < numero2)
                System.out.print("\nNumero 1 menor que numero 2");

            if(numero1 >= numero2)
                System.out.print("\nNumero 1 maior ou igual que numero 2");

            if(numero1 <= numero2)
                System.out.print("\nNumero 1 menor ou igual que numero 2");

            if(numero1 != numero2)
                System.out.print("\nNumero 1 é diferente de numero 2");

        System.out.println("\n======== operações logicas========");

        //Operadores Logicos
        // Operadores.java
        boolean condicao1=true;

        boolean condicao2=false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

            if(condicao1 && condicao2) //e
	            System.out.print("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
            if(condicao1 || condicao2)// ou
	            System.out.print("Um dos valores precisa ser verdadeiro");


}
}