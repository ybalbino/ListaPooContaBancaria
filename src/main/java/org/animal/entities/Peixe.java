package org.animal.entities;

public class Peixe extends Animal{
    private String caracteristicas;

    public Peixe(String nome, double comprimento, String caracteristicas){
        super(nome, comprimento, 0, "preto", "agua", 0);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString(){
        return super.toString() + "\nCaracteristicas: " + caracteristicas;
    }
}
