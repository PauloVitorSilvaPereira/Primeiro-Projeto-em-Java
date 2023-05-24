import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        double saldo = 2500.00;
        int resposta = 0;
        String dadosDoCliente = """
                =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                Dados iniciais do cliente:
                                
                Nome: Paulo Vitor Silva Pereira
                Tipo conta: Corrente
                Saldo inicial: R$ %.2f
                =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                """.formatted(saldo);
        String operacoes = """
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada:
                """;
        Scanner digiteOperacao = new Scanner(System.in);
        System.out.println(dadosDoCliente);
        while (resposta != 4) {
            System.out.println(operacoes);
            resposta = digiteOperacao.nextInt();
            if (resposta == 1) {
                System.out.println("O saldo atual é " + saldo);
            } else if (resposta == 2) {
                System.out.println("Informe o valor a receber:");
                double valorParaReceber = digiteOperacao.nextDouble();
                saldo = saldo + valorParaReceber;
                System.out.println("O saldo foi atualizado para " + saldo);
            } else if (resposta == 3) {
                System.out.println("Informe o valor que deseja transferir:");
                double valorParaTransferir = digiteOperacao.nextDouble();
                if (valorParaTransferir > saldo) {
                    System.out.println("Não há saldo suficiente para essa transfrencia!");
                } else {
                    saldo = saldo - valorParaTransferir;
                    System.out.println("O saldo foi atualizado para " + saldo);
                }
            } else if (resposta == 4) {
                System.out.println("Você foi deslogado!");
            } else {
                System.out.println("Operação não encontrada!");
            }

        }
    }
}
