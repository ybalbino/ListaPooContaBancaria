package org.animal.aplication;

import org.animal.entities.Animal;
import org.animal.entities.Mamifero;
import org.animal.entities.Peixe;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Jardim Zoológico!");
        System.out.println("Insira os dados dos animais: ");

        //Criando tubarão
        System.out.println("Nome do Tubarão: ");
        String nomeTubarao = sc.nextLine();
        System.out.println("Comprimento do Tubarão (em metros):");
        double comprimentoTubarao = sc.nextDouble();
        sc.nextLine();

        System.out.println("Caracteristicas do tubarão: ");
        String caracteristicasTubarao = sc.nextLine();

        Peixe tubarao = new Peixe(nomeTubarao, comprimentoTubarao, caracteristicasTubarao);

        //Criando um camelo
        System.out.println("Nome do Camelo: ");
        String nomeCamelo = sc.nextLine();
        System.out.println("Comprimento do Camelo (em metros):");
        double comprimentoCamelo = sc.nextDouble();
        sc.nextLine();

        System.out.println("Alimento do Camelo: ");
        String alimentoCamelo = sc.nextLine();

        Mamifero camelo = new Mamifero(nomeCamelo, comprimentoCamelo, alimentoCamelo);

        //Criando um urso do canada
        System.out.println("Nome do Urso-do-Canada: ");
        String nomeUrso = sc.nextLine();
        System.out.println("Comprimento do Urso-do-Canada (em metros):");
        double comprimentoUrso = sc.nextDouble();
        sc.nextLine();
        System.out.println("Alimento do Urso: ");
        String alimentoUrso = sc.nextLine();

        Mamifero urso = new Mamifero(nomeUrso, comprimentoUrso, alimentoUrso);

        //Criando um iguana
        System.out.println("Nome da iguana: ");
        String nomeIguana = sc.nextLine();
        System.out.println("Comprimento do iguana (em metros):");
        double comprimentoIguana = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ambiente Iguana: ");
        String ambienteIguana = sc.nextLine();

        Animal iguana = new Animal(nomeIguana, comprimentoIguana, ambienteIguana);

        //Criando um leão
        System.out.println("Nome do Leão: ");
        String nomeLeao = sc.nextLine();
        System.out.println("Comprimento do Leão (em metros):");
        double comprimentoLeao = sc.nextDouble();
        sc.nextLine();
        System.out.println("Alimento do Leão: ");
        String alimentoLeao = sc.nextLine();

        Mamifero leao = new Mamifero(nomeLeao, comprimentoLeao, alimentoLeao);

        //Criando um Mico-leao-dourado
        System.out.println("Nome do Mico-leao-dourado: ");
        String nomeMico = sc.nextLine();
        System.out.println("Comprimento do Mico-leao-dourado (em metros):");
        double comprimentoMico = sc.nextDouble();
        sc.nextLine();
        System.out.println("Alimento do Mico-leao-dourado: ");
        String alimentomico = sc.nextLine();

        Mamifero micoLeaoDourado = new Mamifero(nomeMico, comprimentoMico, alimentomico);

        System.out.println("\nInformações do tubarão: ");
        System.out.println(tubarao);

        System.out.println("\nInformações do camelo: ");
        System.out.println(camelo);

        System.out.println("\nInformações do urso: ");
        System.out.println(urso);

        System.out.println("\nInformações do iguana: ");
        System.out.println(iguana);

        System.out.println("\nInformações do leão: ");
        System.out.println(leao);

        System.out.println("\nInformações do Mico-Leão-Dourado: ");
        System.out.println(micoLeaoDourado);

        sc.close();
    }
}
