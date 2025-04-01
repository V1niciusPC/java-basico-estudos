# Exercícios de fixação
para fixar o conteudo melhor sobre os tipos de operades principalmente aqui vai esta uma lista
de exercíos para praticar meus conhecimentos, irei fazer os codigos e aqui irei explicar como eu criei e o que cada codigo faz, claro irei explicar isso no código também.

## Atividade um
Faça um programa que solicite a base e altura de um retângulo e informe sua área e perimetro.

***Código***

```java
import java.util.Scanner;

public class AtividadeUm {
    
    public static void main(String[] args) {
        double base,altura,area,perimetro;
        Scanner dados = new Scanner(System.in); 
        
        System.out.println("Digite a base do retangulo");
        base = dados.nextDouble();
        System.out.println("\n digite a altura do retangulo");
        altura = dados.nextDouble();

        area = base*altura;
        perimetro = (base*2)+(altura*2);

        System.out.println("A área do Retangulo é: "+ area);
        System.out.println("\n O Perimetro do Retangulo é: " + perimetro);

        dados.close();
    }
}
```

Informações da criação do Código

1. Primeiro é importado a biblioteca scanner que permite armazena informações que o usuário vai digitar: import java.util.Scanner;
2. Depois é criado uma class chamada Atividade um aonde será armazenada os métodos.
3. dentro da class AtividadeUm é criado o método main: public static void main(String[] args)
4. Dentro de Método é criado as variáveis: base, altura, área e perímetro, todas do tipo double
5. Depois é criado uma variável chamada dados que recebera o objeto Scanner.
6. Depois disso é criado um out para o usuário entrar com as informação da base

```java
System.out.println("Digite a base do retangulo");
        base = dados.nextDouble();
```

A variável base vai receber os dados digitado pelo usuário que foi armazenada em um scanner do tipo double.

7. Depois disso é criado outro out para o usuário entrar com as da altura informação

```java
System.out.println("\n digite a altura do retangulo");
        altura = dados.nextDouble();
```

A variável altura vai receber os dados digitado pelo usuário que foi armazenada em um scanner do tipo double.

8. Depois disso é feito uma forma-la matemática para calcular a área e o perímetro usando como base as informações registradas nas variáveis altura e base.

```java
area = base*altura;
perimetro = (base*2)+(altura*2);
```

O resultado dessas Formulas serão registradas nas variáveis área e perímetro

9. Depois disso é impresso as informações para o usuário

```java
System.out.println("A área do Retangulo é: "+ area);
System.out.println("\n O Perimetro do Retangulo é: " + perimetro);
```

10. Por Fim é fechada o scanner.

```java
dados.close();
```

-------
------

## Atividade Dois
Criar um programa que calcula o novo salário de um funcionário com base em um percentual de aumento.

***Código***

```java
public class AtividadeDois {
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
```

***Informações da criação do Código***

1. Primeiro é importado a biblioteca scanner que permite armazena informações que o usuário vai digitar: import java.util.Scanner;
2. Depois é criado uma class chamada Atividade um aonde será armazenada os métodos.
3. dentro da class AtividadeDois é criado o método main: public static void main(String[] args)
4. Dentro de Método é criado as variáveis: salario e novo salario, todas do tipo double e uma variavel chamada porcentagem do tipo inteiro.
5. Depois é criado uma variável chamada valor que recebera o objeto Scanner.
6. Depois disso é criado um out para o usuário entrar com as informação do valor do salario.

```java
 System.out.println("Digite o valor do Salario:");
        salario = valor.nextDouble();
```

A variável salario vai receber os dados digitado pelo usuário que foi armazenada em um scanner do tipo double.

7. Depois disso é criado outro out para o usuário entrar com as da altura informação

```java
System.out.println("Digite a porcentagem de aumento:");
porcentagem = valor.nextInt();
```

A variável porcentagem vai receber os dados digitado pelo usuário que foi armazenada em um scanner do tipo inteiro.

8. Depois disso é feito uma forma-la matemática para calcular a porcentagem de aumento do salario

```java
 novoSalario = salario + (salario*porcentagem/100);
```

Essa formula pega primeiro o calculo que esta entre ( ) calcula e soma com o salario atual e depois retorna essa informação na variavel novo salario.

9. Depois disso é impresso as informações para o usuário

```java
System.out.println("O novo salario é R$"+ novoSalario);

```

10. Por Fim é fechada o scanner.

```java
valor.close();
```

------
------



## Atividade três
Criar um programa que recebe um número e exibe ele antes e depois do pré-incremento e pós-incremento.

***Código***

```java
import java.util.Scanner;

public class AtividadeTres {
   
    public static void main(String[] args) {
        int numero;

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o valor");
        numero = valor.nextInt();

        System.out.println("valor digitado: "+ numero);
        System.out.println("valor antes do incremento: "+ (++numero));
        System.out.println("valor pos incremento: "+(numero++));
        System.out.println("valor final:"+numero);

        valor.close();
    }
}
```

***Informações criação do código***

1. Primeiro é importado a biblioteca scanner que permite armazena informações que o usuário vai digitar: import java.util.Scanner;
2. Depois é criado uma class chamada Atividade um aonde será armazenada os métodos.
3. dentro da class AtividadeDois é criado o método main: public static void main(String[] args)
4. Dentro de Método é criado a variável: numero do tipo inteiro.
5. Depois é criado uma variável chamada valor que recebera o objeto Scanner.
6. Depois disso é criado um out para o usuário entrar com as informação do valor do numero

```java
System.out.println("Digite o valor");
numero = valor.nextInt();
```

A variável numero vai receber os dados digitado pelo usuário que foi armazenada em um scanner do tipo inteiro.

7. Depois disso vai ser impresso na tela as seguintes informações para o usuário.

 

```java
  System.out.println("valor digitado: "+ numero);
  System.out.println("valor depois do incremento: "+ (++numero));
  System.out.println("valor antes incremento: "+(numero++));
  System.out.println("valor final:"+numero);
```

- O primeiro Print vai imprimir normalmente o valor digitado
- o segunto print mostra o sistema de incrementar como o ++ esta na frente logo a informação mostrada vai ser valor + 1
- no terceiro mostra também o sistema de incremento, porem como o ++ esta depois do numero, logo o valor vai ser mostrado primeiro para o usuário e depois por fora da tela sera feito o valor +1
- o quarto print vai mostrar o valor do numero depois do incremento anterior, em outras palavras o resultado.
8. Por Fim é fechada o scanner.

```java
valor.close();
```

-----
-----

## Atividade Quatro
O usuário insere sua idade, e o programa verifica se ele é maior ou menor de idade usando o operador ternário.

***Código***

```java
import java.util.Scanner;

public class AtividadeQuatro {

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
```

***Informações criação do código***

1. Primeiro é importado a biblioteca scanner que permite armazena informações que o usuário vai digitar: import java.util.Scanner;
2. Depois é criado uma class chamada Atividade um aonde será armazenada os métodos.
3. dentro da class AtividadeDois é criado o método main: public static void main(String[] args)
4. Dentro de Método é criado a variável: idade do tipo inteiro.
5. Depois é criado uma variável chamada valor que recebera o objeto Scanner.
6. Depois disso é criado um out para o usuário entrar com as informação do valor da idade

```java
System.out.println("Digite Sua Idade:");
idade = valor.nextInt();
```

A variável idade vai receber os dados digitado pelo usuário que foi armazenada em um scanner do tipo inteiro.

7. Depois disso vai ser feita uma operação ternaria sobre o valor de idade.

```java
String resultado = idade>=18? "maior de idade":"menor de idade";
```

- Primeiro é criada uma string chamada resultado, dentro dela vai esta o operador ternário
- essa formula significa o seguinte, se a idade for maior ou igual a 18 se essa informação for verdadeira, logo o texto “maior de idade” vai ser armazenada na variavel resultado, porém se essa afirmação for mentira, vai ser armazenado o texto “menor de idade” na variavel resultado.

8. Por Fim é fechada o scanner.

```java
valor.close();
```

-----
-----


## Atividade cinco
Criar um programa que recebe duas notas de um aluno, calcula a média e determina se ele está aprovado, em recuperação ou reprovado, O aluno pode receber um bônus de 0.5 na média, se for aplicado. O programa verifica se o aluno tem presença acima de 75%. Caso contrário, mesmo aprovado, ele será reprovado por faltas.
