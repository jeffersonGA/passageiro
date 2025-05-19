package org.example;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPassageiro cadastro = new CadastroPassageiro();

        while (true) {
            System.out.println("\n1 - Cadastrar passageiro\n2 - Listar passageiros\n3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("E-mail: ");
                    String email = scanner.nextLine();

                    try {
                        Passageiro passageiro = new Passageiro(cadastro.listarPassageiros().size() + 1, nome, cpf, email);
                        cadastro.cadastrarPassageiro(passageiro);
                        System.out.println("✅ Passageiro cadastrado com sucesso!");
                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ Erro: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n📜 Passageiros cadastrados:");
                    if (cadastro.listarPassageiros().isEmpty()) {
                        System.out.println("Nenhum passageiro cadastrado.");
                    } else {
                        cadastro.listarPassageiros().forEach(System.out::println);
                    }
                    break;

                case 3:
                    System.out.println("🚪 Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠️ Opção inválida, tente novamente.");
            }
        }
    }
}
