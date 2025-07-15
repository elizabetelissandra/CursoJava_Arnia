package Metodos;

import java.util.Scanner;

public class CaixaEletronico {
    private double saldo = 0;
    private Scanner teclado = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n Menu de opções:");
        System.out.println("1 - Informar saldo inicial");
        System.out.println("2 - Depositar valor");
        System.out.println("3 - Sacar valor");
        System.out.println("4 - Ver saldo");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        return teclado.nextInt();
    }

    public void executar() {
        int opcao;
        do {
            opcao = mostrarMenu();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o saldo inicial: ");
                    saldo = teclado.nextDouble();
                    System.out.println("Saldo definido para R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    saldo += teclado.nextDouble();
                    System.out.println("Novo saldo: R$ " + saldo);
                    break;
                case 3:
                    System.out.print("Valor para saque: ");
                    double saque = teclado.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado! Novo saldo: R$ " + saldo);
                    } else {
                        System.out.println(" Saldo insuficiente!");
                    }
                    break;
                case 4:
                    System.out.println(" Seu saldo atual é R$ " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println(" Opção inválida!");
            }

        } while (opcao != 0);
    }
}

