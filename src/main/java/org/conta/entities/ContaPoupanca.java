package org.conta.entities;

import java.util.Calendar;
import java.util.Date;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    //Construtor para acessar a classe os atributos de ContaBancaria.
    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int diaRendimentoContaPoupanca) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    //
    public void calcularNovoSaldo(double taxaRendimento){
        int diaAtual = obterDiaAtual();

        if (diaAtual == diaRendimento){
            double saldoAtual = super.getSaldo();
            double rendimento = saldoAtual * taxaRendimento;
            super.depositar(rendimento);
            System.out.println("Rendimento R$" + rendimento + " aplicando a conta.");
        }
    }
    private int obterDiaAtual(){
        Calendar calendario = Calendar.getInstance();
        Date dataAtual = calendario.getTime();
        return calendario.get(Calendar.DAY_OF_MONTH);//indica dia do ano
    }



}
