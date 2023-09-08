package org.conta.aplication;
import org.conta.entities.ContaBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Numero Conta: ");
        int numConta = sc.nextInt();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria(nomeCliente, numConta,saldo);

        contaBancaria.infoConta();

        System.out.println("Valor para deposito: R$ ");
        double valorDeposito = sc.nextDouble();
        contaBancaria.depositar(valorDeposito);

        System.out.println("Valor para sacar: R$ ");
        double valorSaque = sc.nextDouble();
        contaBancaria.sacar(valorSaque);

        contaBancaria.infoConta();

        sc.close();
    }
}