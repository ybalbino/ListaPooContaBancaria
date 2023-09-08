package org.animal.entities;

public class Mamifero extends Animal{
    private String alimento;

    public Mamifero(String nome, double comprimento, String alimento){
        super(nome, comprimento, 4, "caramelo","terra",0);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString(){
        return super.toString() + "\nAlimento: " + alimento;
    }
}
