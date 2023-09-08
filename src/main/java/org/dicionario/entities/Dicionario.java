package org.dicionario.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Dicionario {

    private String objeto;
    private String cor;

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void adicionarObjetoCor() {
        adicionarObjetoCor(null, null, null);
    }

    public void adicionarObjetoCor(Map<String, List<String>> dicionario, String objeto, String cor){
        if (!dicionario.containsKey(objeto)){
            dicionario.put(objeto, new ArrayList<>());
        }
        dicionario.get(objeto).add(cor);
    }

}
