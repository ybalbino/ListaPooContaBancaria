package org.dicionario.aplication;

import org.dicionario.entities.Dicionario;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //Criando dicionario de objetos e cores
        Map<String, List<String>> objetoCorDincionario = new HashMap<>();

        Dicionario dicionario = new Dicionario();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite o nome do objeto (ou sair para encerrar): ");
            String objeto = sc.nextLine();

            if (objeto.equalsIgnoreCase("sair")){
                break;
            }

            System.out.println("Digite a cor do objeto: ");
            String cor = sc.nextLine();

            dicionario.adicionarObjetoCor(objetoCorDincionario, objeto, cor);
        }
         //Imprimindo todo dicionario
        System.out.println("Dicionario de Objetos e Cores: ");

        for (Map.Entry<String, List<String>> entry : objetoCorDincionario.entrySet()){
            String objeto = entry.getKey();
            List<String> cores = entry.getValue();

            System.out.println(objeto + " -> " + String.join(", ", cores) );
        }

        sc.close();
    }

}
