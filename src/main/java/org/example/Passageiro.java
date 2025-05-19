package org.example;

import java.util.regex.Pattern;

public class Passageiro {
    private int id;
    private String nome;
    private String cpf;
    private String email;

    public Passageiro(int id, String nome, String cpf, String email) {
        if (!validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        if (!validarEmail(email)) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public static boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }

    public static boolean validarEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(regex, email);
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | CPF: " + cpf + " | E-mail: " + email;
    }
}
