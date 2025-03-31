# ANOTAÇÕES
Algumas anotações e exemplos sobre variaveis ou tipos de operadores
podem ser encontrados aqui


## Variaveis
Na programação Java existem varias variáveis, porém tem o que conhecemos de variáveis Primitivas, sendo elas 8: **int**, **byte**, **short**, **long**, **float**, **double**, **boolean** e **char**.

- Tabela valores inteiros Primitivos 

| ***Tipo*** | ***Memória*** | ***Valor Mínimo*** | ***Valor Máximo***  |
| --- | --- | --- | --- |
| byte | 1 byte | -128 | 127 |
| Short | 2 byte | -32.768 | 32.767 |
| int | 4 byte | -2.17.483.648 | 2.147.483.647 |
| long | 8 byte | 9.223.372.036.854.775.808 | 9.223.372.036.854.775.807 |

- Tabela de tipos Primitivos fracionados

| ***Tipo*** | ***Memória*** | ***Valor Mínimo*** | ***Valor Máximo*** |
| --- | --- | --- | --- |
| float | 4 byte | -3,4028E + 38 | 3,4028E + 38 |
| double | 8 byte | -1,7976E + 308 | 1,7976E + 308 |


## OPERADORES
# ***Operador de Atribuição***

O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o valor de uma variável. Representado pelo símbolo de igualdade `=`.

```java
//classe Operadores.java
String nome = "GLEYSON"; //VALORES EM STRING FICAM ENTRE " "
int idade = 22;
double peso = 68.5;// NÃO ESQUECER O PONTO PARA VALOR FRANCIONADO
char sexo = 'M'; //CHAR COMO RECEBE UM UNICO VALOR FICA REPRESENTADO POR ' '
boolean doadorOrgao = false; // ESCOLHER FALSE OU TRUE
Date dataNascimento = new Date();
```
# ***Operadores Aritméticos***

 é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.

Os operadores aritméticos são: `+` (adição), `-` (subtração), `*` (multiplicação) e `/` (divisão).

```java
//classe Operadores.java
double soma = 10.5 + 15.7;
int subtração = 113 - 25;
int multiplicacao = 20 * 7;
int divisao = 15 / 3;
int modulo = 18 % 3; // mostra os restos de um calculo
double resultado = (10 * 7) + (20/4);
```

<aside>

***ATENÇÃO!*** O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.

</aside>

```java
//classe Operadores.java
String nomeCompleto = "LINGUAGEM" + "JAVA";
resultado: LINGUAGEMJAVA
		
//qual o resultado das expressoes abaixo?
String concatenacao ="?"; 

concatenacao = 1+1+1+"1";
resultado: 31 //SOMA OS NUMEROS DEPOIS JUNTA COM O NUMERO"1"

concatenacao = 1+"1"+1+1;
resultado: 1111 //ENTENDE QUE TUDO É UMA CONCATENAÇÃO

concatenacao = 1+"1"+1+"1";
resultado: 1111 //ENTENDE QUE TUDO É UMA CONCATENAÇÃO

concatenacao = "1"+1+1+1;
resultado: 1111 //ENTENDE QUE TUDO É UMA CONCATENAÇÃO

concatenacao = "1"+(1+1+1);
resultado: 13 //FAZ A SOMA DO ESTA NO() E DEPOIS JUNTA COM O VALOR DE FORA
```

# ***Operadores Unários***

Esses operadores são aplicados juntamente com um outro operador aritmético. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéros e booleanos.

- (+) **Operador unário de valor positivo** – números são positivos sem esse operado explicitamente;
- (-) **Operador unário de valor negativo** – nega um número ou expressão aritmética;
- (++) **Operador unário de incremento de valor** – incrementa o valor em 1 unidade;
- (--) **Operador unário de decremento de valor** – decrementa o valor em 1 unidade;
- (!) **Operador unário lógico de negação** – nega o valor de uma expressão booleana;

EX:

```java
//classe Operadores.java
int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

/*Mesmo imprimindo o valor negativo ele não altera o valor para o 
negativo a menos que tenha uma forma para isso como:
numero = -numero;*/
System.out.println(numero);//imprimi o valor normal

//se o numero estiver negativo para deixa positivo faz isso:

numero = numero * -1;

=========================
boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro);
resultado: false
// isso não altera o valor real dela
```

# Incremento

**Incrementar** significa **aumentar o valor de uma variável**, geralmente de forma automática, sem precisar reescrevê-la manualmente.
 Podendo ser de forma simples.

- Incremento simples (++) aumenta o valor de uma variavel +1
ex:
    
    ```java
    int numero = 5;
    numero++; // Agora numero vale 6
    System.out.println(numero); // Saída: 6
    
    ```
    
    Você também pode fazer incrementação diretamente na impressão ou adiantar ela colocando o (++) na frente. EX:
    
    ```java
    int numero = 5;
    System.out.println(numero++);// Agora numero vale 6; sainda:5
    System.out.println(numero); //sainda: 6
    
    System.out.println(++ numero); //agora numero vale 7;saída:7
    
    ```
    
    Como a incrementar  esta na frente ela acontece primeiro alterando o o valor logo, porem se ela tiver depois isso só ocorre na próxima vez que ela for chamada 
    
- Incremento Personalizado (`+=`), você pode escolher qual vai ser o valor que vai ser adicionado
    
    ```java
    int numero = 5;
    numero += 3; // Agora numero vale 8
    System.out.println(numero); // Saída: 8
    
    ```
    

# Operadores Ternários

 é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Você deve pensar numa condição ternária como se fosse uma condição IF normal, porém, de uma forma em que toda a sua estrutura estará escrita numa única linha.

O operador ternário é representado pelos símbolos `?:` utilizados na seguinte estrutura de sintaxe:

`Expressão Condicional **?** Caso condição seja true **:** Caso condição seja false`

Ex:

```java
// classe Operadores.java
int a, b;

a = 5;
b = 6;

/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
if(a==b)
   resultado = "verdadeiro";
else
   resultado = "falso";
*/

//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
String resultado = (a==b) ? "verdadeiro" : "false";

System.out.println(resultado);
```

# Operadores Relacionais

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerda é igual, diferente, menor, menor ou igual, maior ou maior ou igual ao da direita, retornando um valor booleano como resultado.

- `==` Quando desejamos verificar se uma variável é IGUAL A outra.
- `!=` Quando desejamos verificar se uma variável é DIFERENTE da outra.
- `>` Quando desejamos verificar se uma variável é MAIOR QUE a outra.
- `>=` Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
- `<` Quando desejamos verificar se uma variável é MENOR QUE outra.
- `<=` Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.

```java
//classe Operadores.java
int numero1 = 1;
int numero2 = 2;

if(numero1 > numero2)
	System.out.print("Numero 1 maior que numero 2");

if(numero1 < numero2)
	System.out.print("Numero 1 menor que numero 2");

if(numero1 >= numero2)
	System.out.print("Numero 1 maior ou igual que numero 2");

if(numero1 <= numero2)
	System.out.print("Numero 1 menor ou igual que numero 2");

if(numero1 != numero2)
	System.out.print("Numero 1 é diferente de numero 2");
```

Nota: mesmo reconhecendo variáveis com valor iguais isso não pode acontecer com objetos com o mesmo nome.

```java
// ComparacaoAvancada.java
public static void main(String[] args) {

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false pq não reconhece varial!=objeto

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals na parada
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??

    }
```

# Operadores Lógicos

Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.

- `&&` Operador Lógico "E"
- `||` Operador Lógico "OU"

```java
// Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
```