# 🚀 Desafio de Controle de Fluxo em Java

## 📌 Descrição
Este desafio tem como objetivo praticar conceitos fundamentais de **controle de fluxo** em Java, incluindo:

- Laços de repetição (`for`)
- Estruturas condicionais (`if`, `else`)
- Tratamento de exceções personalizadas

O programa recebe **dois números inteiros** via terminal e imprime uma sequência numérica baseada na diferença entre eles. Caso o primeiro número seja **maior** que o segundo, o sistema lança uma exceção customizada (`ParametrosInvalidosException`).


<br>

## 🛠 Tecnologias Utilizadas
- Java 8+
- IDE: VS Code

<br>

## 📜 Regras do Desafio

1. **Receber dois números inteiros** via terminal.
2. **Validar os valores informados**:
   - Se o primeiro número for maior que o segundo, lançar a exceção `ParametrosInvalidosException`.
3. **Iterar com `for`** para imprimir a sequência de números de `1` até a diferença entre os dois valores.
4. **Exibir os números no console** com a mensagem: `"Imprimindo o número X"`.

<br>

## 🔥 Exemplo de Entrada e Saída

### ✅ Exemplo 1 (Entrada válida)
**Entrada:**
```
Digite o primeiro número: 12
Digite o segundo número: 30
```
**Saída:**
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
```

### ❌ Exemplo 2 (Erro - Primeiro número maior que o segundo)
**Entrada:**
```
Digite o primeiro número: 50
Digite o segundo número: 10
```
**Saída:**
```
Exception in thread "main" ParametrosInvalidosException: O segundo parâmetro deve ser maior que o primeiro.
```

<br>

## 📝 Implementação

### 🔹 Classe `Contador.java`
```java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int limite = numero2 - numero1;
        for (int i = 1; i <= limite; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
```

### 🔹 Classe `ParametrosInvalidosException.java`
```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Passa a mensagem para a classe Exception
    }
}
```

<br>

## 🎯 Conceitos Abordados

### 1️⃣ **Laço de Repetição (`for`)**
O laço `for` é utilizado para **iterar** do número `1` até a diferença entre os dois valores informados:
```java
for (int i = 1; i <= limite; i++) {
    System.out.println("Imprimindo o número " + i);
}
```

### 2️⃣ **Exceções Personalizadas (`Exception`)**
Criamos uma classe que **herda** de `Exception` para tratar o erro quando o primeiro número for maior que o segundo.

```java
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
```
Isso permite que a mensagem personalizada seja armazenada e exibida corretamente.


<br>

### 3️⃣ **Uso do `super(mensagem);`**
O comando `super(mensagem);` chama o construtor da classe `Exception`, permitindo que a mensagem de erro seja repassada corretamente.

<br>

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o Repositório
```bash
git clone https://github.com/seu-usuario/desafio-controle-fluxo.git
cd desafio-controle-fluxo
```

### 2️⃣ Compilar o Código
```bash
javac Contador.java
```

### 3️⃣ Executar o Programa
```bash
java Contador
```

### 4️⃣ Testar o Funcionamento
Digite os números conforme solicitado no terminal e observe a saída.

<br>

## 🏆 Exemplo de Saída

Entrada:
```
Digite o primeiro número: 5
Digite o segundo número: 10
```
Saída:
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

Caso o primeiro número seja maior que o segundo:
```
Exceção lançada: O segundo parâmetro deve ser maior que o primeiro.
```

<br>

## 🎯 Conclusão
Este desafio foi uma excelente oportunidade para reforçar conceitos fundamentais de controle de fluxo e tratamento de exceções em Java. A implementação do `for` e da exceção personalizada ajudou a entender como estruturar código limpo e eficiente. Além disso, o uso de `super(mensagem);` mostrou a importância da reutilização de funcionalidades herdadas de classes Java. 🚀

---

Feito com 💙 por [Thalysson Wilson](https://github.com/thalyssonwilson) 😃



