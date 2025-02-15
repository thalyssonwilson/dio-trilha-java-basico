
# DIO | Desafio trilha Java básico

# Desafio de Sintaxe - ContaBanco

Projeto proposto pela [digital inovation one](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe).

Este projeto tem como objetivo exercitar os conceitos de **sintaxe** em Java, aplicando variáveis, entrada de dados pelo terminal, concatenação de strings e exibição formatada.

## 📌 Descrição do Desafio

Crie um projeto chamado **ContaBanco**, que receberá dados via terminal contendo as características de uma conta bancária conforme os atributos abaixo:

### 🔹 Atributos da Conta Bancária
| Atributo      | Tipo    | Exemplo        |
|--------------|--------|---------------|
| Numero       | Inteiro | 1021          |
| Agencia      | Texto  | 067-8         |
| Nome Cliente | Texto  | MARIO ANDRADE |
| Saldo        | Decimal | 237.48        |

### 🚀 Requisitos do Projeto
1. Criar um **projeto Java** no VS Code ou outra IDE de preferência.
2. Criar uma **classe ContaTerminal.java** para implementar a lógica do programa.
3. Utilizar a classe **Scanner** para capturar os dados via terminal.
4. Exibir mensagens solicitando a entrada de cada informação.
5. Concatenar e formatar a mensagem final conforme o modelo abaixo:

   ```
   "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."
   ```

## 🛠 Tecnologias Utilizadas
- **Java 11+**
- **Scanner** para entrada de dados
- **System.out.println()** para exibição de mensagens

## 🎯 Exemplo de Execução
```bash
Digite o número da conta:
1021
Digite a agência:
067-8
Digite o nome do cliente:
MARIO ANDRADE
Digite o saldo:
237.48
```

### 📌 Saída esperada:
```bash
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

## 🔗 Referências
- [Documentação Java](https://docs.oracle.com/en/java/)
- [Scanner Class (Oracle)](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

---
Desenvolvido para prática de sintaxe em Java. 🚀

