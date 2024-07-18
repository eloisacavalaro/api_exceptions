package com.api.exceptions;

import java.util.Scanner;

public class Lista3 {

    public void ex1(){

        Scanner sc = new Scanner (System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();

        try {
            System.out.println("O resultado da divisao é : " + numero/numero2);
        } catch (Exception e) {
            System.out.println("Não é possível dividir o número por zero.");
            System.out.println("Erro:" + e.getMessage());
        }


    }
    public void menu(){

        Scanner sc = new Scanner(System.in);
        int opcao;
        String[] nomes = {"Lucas", "Enzo", "Eloisa"};

        System.out.println("===== MENU =====");
        System.out.println("1 - Opção 1");
        System.out.println("2 - Opção 2");
        System.out.println("3 - Opção 3");
        opcao = sc.nextInt();
        sc.nextLine();

        try {
            switch (opcao) {
                case 1:
                    System.out.println("Lista de nomes:");
                    for (int i = 0; i < nomes.length; i++) {
                        System.out.println(i + " - " + nomes[i]);
                    }

                    System.out.print("Escolha um índice: ");
                    if (sc.hasNextInt()) {
                        int indice = sc.nextInt();
                        if (indice >= 0 && indice < nomes.length) {
                            System.out.println("Nome escolhido: " + nomes[indice]);
                        } else {
                            System.out.println("Índice inválido. Nenhum nome selecionado.");
                        }
                    } else {
                        System.out.println("Entrada inválida. Nenhum nome selecionado.");
                        sc.next(); 
                    }
                    break;

                case 2:
                    System.out.println("Opção 2.");
                    break;

                case 3:
                    System.out.println("Opção 3.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }



    }

}
