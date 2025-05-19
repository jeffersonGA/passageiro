package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PassageiroTest {

    @Test
    void testCpfValido() {
        assertTrue(Passageiro.validarCPF("12345678901"));
    }

    @Test
    void testCpfInvalido() {
        assertFalse(Passageiro.validarCPF("12345"));
    }

    @Test
    void testEmailValido() {
        assertTrue(Passageiro.validarEmail("teste@email.com"));
    }

    @Test
    void testEmailInvalido() {
        assertFalse(Passageiro.validarEmail("email_invalido"));
    }

    @Test
    void testCadastroPassageiro() {
        CadastroPassageiro cadastro = new CadastroPassageiro();
        Passageiro passageiro = new Passageiro(1, "Maria", "12345678901", "maria@email.com");
        cadastro.cadastrarPassageiro(passageiro);

        assertEquals(1, cadastro.listarPassageiros().size());
        assertEquals("Maria", cadastro.listarPassageiros().get(0).getNome());
    }
}
