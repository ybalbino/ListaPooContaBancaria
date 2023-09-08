package org.conta.entities;

public class ContaBancaria implements Tributos{
    private String nomeCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, int numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
            System.out.printf("Saque R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.printf("Deposito R$ " + valor + " realizado com sucesso. ");
        } else {
            System.out.println("Valor invalido.");
        }

    }

    public void infoConta(){
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Numero Conta: "+ numConta);
        System.out.println("Saldo Conta: " + saldo);
    }
    @Override
    public double calcularTributos(){
        return getSaldo()*0.01;
    }
}
