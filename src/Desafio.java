import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Lucas";
        String tipoConta = "Conta Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.printf("""
                *******************************************************
                
                Nome do cliente : %s
                Tipo conta :      %s
                Saldo atual:      %.2f
                
                *******************************************************
                """, nome, tipoConta, saldo);

        String menu = """
                \n Digite a opção que gostaria:
                
                1. Consultar valor
                2. Sacar valor 
                3. Depositar valor 
                4. Sair do app
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.printf("\n O saldo atualizado é: R$ %.2f", saldo);

            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja sacar ?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println(" Você nao tem dinheiro suficiente... Escolha um valor menor!");
                } else {
                    saldo -= valor;
                    System.out.printf("Seu saldo agora é R$ %.2f", saldo);

                }


            } else if (opcao == 3) {
                System.out.println("Qual o valor que deseja depositar ?");
                double deposito = leitura.nextDouble();
                deposito += saldo;
                System.out.printf("Seu saldo agora é R$ %.2f", saldo);


            } else if (opcao != 4) {
                System.out.println("Opção invalida!!!");

            }
        }
    }}
