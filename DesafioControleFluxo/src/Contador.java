import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        int parametroUm = 0;
        int parametroDois = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        parametroDois = sc.nextInt();

        // o parametroUm não pode ser maior que o parametroDois, 
        // para garantir isso lançarei um tratamento para essa exceção.

        try {
            
            contar(parametroUm, parametroDois);


        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: "+e.getMessage());
        }

        sc.close();

    }

    public static void contar(int parametroUM, int parametroDOIS) throws ParametrosInvalidosException{
        // 1# Validar se parametroDOIS é maior que parametroUM
        if(parametroUM > parametroDOIS){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        // #2 int contagem = parametroDois - parametroUm;
        int contagem = parametroDOIS - parametroUM;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número "+i);
        } 

    }
}
