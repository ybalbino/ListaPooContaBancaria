package org.conta.entities;
public class ContaEspecial extends ContaBancaria{
    private double limite;
    public ContaEspecial(String nomeCliente, int numConta, double saldo, double limiteEspecial) {
        super(nomeCliente, numConta, saldo);
    }

    @Override
    public void sacar (double valor){
        if (valor > 0 && (super.getSaldo() + limite) >= valor){
            super.sacar(valor);
            System.out.println("Saque R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}
