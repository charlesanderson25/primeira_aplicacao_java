import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {

        // Variáveis
        String nome = "Charles Anderson";
        String tipoConta = "corrente";
        String saldoInicial = "2.500,00";
        double consultarSaldos = 0;
        double deposito = 0;
        double transferencia = 0;

        //Scanner
        Scanner opcao = new Scanner(System.in);

        System.out.println("***************************************************************");
        System.out.println("Dados do cliente: \n");

        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("***************************************************************\n");

        System.out.println("Operações: \n");
        System.out.println("1- Consultar saldo");
        System.out.println("2- Depósito");
        System.out.println("3- Transferência");
        System.out.println("4- Sair \n");

        System.out.println("Digite a opção desejada: ");
        double opcaoEscolhida = opcao.nextDouble();

        if (opcaoEscolhida == 1){
            System.out.println("Saldo atualizado R$ " + saldoInicial);
        } else if (opcaoEscolhida == 2) {
            opcao.nextDouble()
        }

    }
}
