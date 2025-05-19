package org.example;

import java.util.ArrayList;
import java.util.List;

public class CadastroPassageiro {
    private List<Passageiro> passageiros = new ArrayList<>();

    public void cadastrarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public List<Passageiro> listarPassageiros() {
        return passageiros;
    }
}
