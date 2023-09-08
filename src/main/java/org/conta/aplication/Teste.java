package org.conta.aplication;

import org.conta.entities.ContaBancaria;
import org.conta.entities.ContaEspecial;
import org.conta.entities.ContaPoupanca;
import org.conta.entities.SeguroDeVida;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Criando ContaPoupança
        System.out.print("Nome cliente Conta Poupança: ");
        String nomePoupanca = sc.nextLine();

        System.out.print("Numero Conta Poupança: ");
        int numContaPoupanca = sc.nextInt();

        System.out.print("Digite saldo Conta Poupança: R$ ");
        double saldoPoupanca = sc.nextDouble();

        System.out.print("Digite Dia de Rendimento Conta Poupança: ");
        int diaRendimentoContaPoupanca = sc.nextInt();

        ContaPoupanca contaPoupanca = new ContaPoupanca(nomePoupanca, numContaPoupanca, saldoPoupanca, diaRendimentoContaPoupanca);
        sc.nextLine();

        //Criando ContaEspecial
        System.out.print("\nNome do Cliente Conta Especial: ");
        String nomeEspecial = sc.nextLine();

        System.out.print("Numero Conta Especial: ");
        int numContaEspecial = sc.nextInt();

        System.out.print("Saldo Conta Especial: R$ ");
        double saldoEspecial = sc.nextDouble();

        System.out.print("Limite Conta Especial: R$ ");
        double limiteEspecial = sc.nextDouble();

        ContaEspecial contaEspecial = new ContaEspecial(nomeEspecial, numContaEspecial, saldoEspecial, limiteEspecial);

        //Dados iniciais das Contas
        System.out.println("\nDados Conta Poupanca: ");
        contaPoupanca.infoConta();
        System.out.println("\nDados Conta Especial: ");
        contaEspecial.infoConta();

        //saque nas contas
        System.out.print("\nValor saque na Conta Poupança: R$ ");
        double saquePoupanca = sc.nextDouble();
        contaPoupanca.sacar(saquePoupanca);

        System.out.print("\nValor saque na Conta Especial: R$ ");
        double saqueEspecial = sc.nextDouble();
        contaEspecial.sacar(saqueEspecial);

        System.out.print("\nDeposito Conta Poupança: R$ ");
        double depositoPoupanca = sc.nextDouble();
        contaPoupanca.depositar(depositoPoupanca);

        System.out.print("\nDeposito Conta Especial: RS ");
        double depositoEspecial = sc.nextDouble();
        contaEspecial.depositar(depositoEspecial);

        //Calcular rendimento Conta Poupança
        System.out.print("\nTaxa de Rendimento Conta Poupança: ");
        double taxaRendimento = sc.nextDouble();
        contaPoupanca.calcularNovoSaldo(taxaRendimento);

        //Exibindo dados atualizados das contas
        System.out.println("\nDados atuais Conta Poupança: ");
        contaPoupanca.infoConta();
        System.out.println("\nDados atuais Conta Especial: ");
        contaEspecial.infoConta();

        //Calculando tributos
        ContaBancaria contaBancaria = new ContaBancaria();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        double tributosContaBancaria = contaBancaria.calcularTributos();
        double tributosSeguroDeVida = seguroDeVida.calcularTributos();

        System.out.println("Tributo Conta Bancaria: R$ " + tributosContaBancaria);
        System.out.println("Tributo Seguro de Vida: R$ " + tributosSeguroDeVida);

        sc.close();
    }
}
