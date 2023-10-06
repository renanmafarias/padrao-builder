package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorBuilderTest {

    @Test
    void deveRetornarExcecaoParaJogadorSemNumeroContrato() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setNome("Neymar")
                    .build();
           fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de contrato inválido.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaJogadorSemNome() {
        try {
            JogadorBuilder jogadorBuilder = new JogadorBuilder();
            Jogador jogador = jogadorBuilder
                    .setNumeroContrato(25)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido.", e.getMessage());
        }
    }

    @Test
    void deveRetornarJogadorValido() {
        JogadorBuilder jogadorBuilder = new JogadorBuilder();
        Jogador jogador = jogadorBuilder
                .setNumeroContrato(25)
                .setNome("Neymar")
                .build();

        assertNotNull(jogador);
    }
}