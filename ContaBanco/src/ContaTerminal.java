import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int nummero;
        String numeroStr;
        String agencia;
        String nomeCliente;
        double saldo;
        String saldoStr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        numeroStr = sc.nextLine();             // É necessário utilizar o nextLine() e depois fazer a conversão com o PARSE, pois se eu usar o nextInt() 
        nummero = Integer.parseInt(numeroStr); // ele deixa um espaço vazio que é preenchido pelo buffer da memória o que ocasiona no pular do imput da pergunta seguinte ("Digite agência");

        System.out.println("Digite a agência: ");
        agencia = sc.nextLine();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo: ");
        saldoStr = sc.nextLine().replace(",", "."); // garante que a tanto a VIRGULA quanto o PONTO de um numero decimal sejam aceitos no imput.
        saldo = Double.parseDouble(saldoStr);

        sc.close(); // a classe scanner pede que uma vez instanciado ele precisa ser fechado para não exibir mensagem de erro no console, mesmo que o código não dê erros de execução.

        
        exibirDadosBancarios(nummero, agencia, nomeCliente, saldo);
        


    }

    public static void exibirDadosBancarios(int conta, String agencia, String nomeCliente, double saldo){
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
