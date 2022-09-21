package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cliente> clienteList = new ArrayList();

    public Main() {
    }

    public static void main(String[] args) {
        int contador = 0;
        LOOL:
        while (true) {
            ++contador;
            System.out.println("Quantas vezes você entrou no loop?" + contador);
            System.out.println("Você deseja continuar ou sair do loop?");
            System.out.println("Se você deseja sair do loop digite 1");
            System.out.println("Se deseja criar uma entidade cliente, digite 2");
            System.out.println("se deseja remover o cliente digite 3");
            System.out.println("se deseja buscar um cliente específico digite 4");
            System.out.println("se deseja ver todos os clientes digite 5");
            System.out.println("se deseja atualizar a idade de um cliente específico digite 6");
            Scanner scanner = new Scanner(System.in);
            int opcaoEscolhida = scanner.nextInt();
            if (opcaoEscolhida == 1) {
                System.out.println("você entrou" + contador + "vezes no Loop");
                System.out.println("Você esta saindo do loop.... ");
                break LOOL;
            }

            if (opcaoEscolhida == 2) {
                Cliente cliente = new Cliente();
                System.out.println("Digite o nome do clinte e a idade");
                Scanner dg = new Scanner(System.in);
                cliente.nome = dg.nextLine();
                cliente.idade = Integer.valueOf(dg.nextLine());
                if (cliente.idade > 65) {
                    cliente.aposentadoria=2000;
                    System.out.println("Você tem o volor de atributo de 2000R$");
                } else {
                    System.out.println("Você não tem o atributo de 2000 R$ devido sua idade ser menor que 65 anos.");
                }

                System.out.println("nome do Cliente :" + cliente.nome);
                System.out.println("Idade do Cliente :" + cliente.idade);
                clienteList.add(cliente);
            }

            if (opcaoEscolhida == 3) {
                for (int l = 0; l < clienteList.size(); ++l) {
                    System.out.println("Digite o nome do usuario que você deseja remover");
                    Scanner dg = new Scanner(System.in);
                    String nm = dg.nextLine();
                    if (nm.equals(((Cliente) clienteList.get(l)).nome)) {
                    }

                    clienteList.remove(l);
                }
            }

            if (opcaoEscolhida == 4) {
                System.out.println("Digite o nome do cliente");
                Scanner dg = new Scanner(System.in);
                String nm = dg.nextLine();
                Iterator var14 = clienteList.iterator();

                while (var14.hasNext()) {
                    Cliente x = (Cliente) var14.next();
                    if (nm.equals(x.nome)) {
                        System.out.println("o Nome é:" + x.nome + "e a idade é:" + x.idade+x.aposentadoria);
                    }
                }
            }

            if (opcaoEscolhida == 5) {
                Iterator var11 = clienteList.iterator();

                while (var11.hasNext()) {
                    Cliente x = (Cliente) var11.next();
                    System.out.println("o Nome é:" + x.nome + "e a idade é: " + x.idade+x.aposentadoria);
                }
            }
            if (opcaoEscolhida == 6) {

                for (int l = 0; l <= clienteList.size(); ++l) {
                    Scanner dg = new Scanner(System.in);
                    String nm = dg.nextLine();
                    if (nm.equals(((Cliente) clienteList.get(l)).idade)) {
                    }

                    System.out.println("DIgite a nova idade do seu cliente");
                    Scanner nmNova = new Scanner(System.in);
                    int idnew = nmNova.nextInt();
                    ((Cliente) clienteList.get(l)).idade = idnew;
                }
            }
        }
    }
}
