package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoPismTest {

    @Test
    void deveRetonarAprovado() {
        CandidatoPism Candidato = new CandidatoPism();
        Candidato.setNota1(7.0f);
        Candidato.setNota2(7.0f);
        assertEquals("Aprovado", Candidato.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        CandidatoPism Candidato = new CandidatoPism();
        Candidato.setNota1(7.0f);
        Candidato.setNota2(6.9f);
        assertEquals("Reprovado", Candidato.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        CandidatoPism Candidato = new CandidatoPism();
        Candidato.setNota1(7.0f);
        Candidato.setNota2(6.9f);
        Candidato.setNome("Mario");
        Candidato.setMatricula(151);
        assertEquals("Candidato{matricula=151, nome='Mario', resultado=Reprovado}", Candidato.getInfo());
    }
}