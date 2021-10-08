package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidatoEnemTest {

    @Test
    void deveRetonarAprovado() {
        CandidatoEnem Candidato = new CandidatoEnem();
        Candidato.setNota1(8.0f);
        Candidato.setNota2(8.0f);
        assertEquals("Aprovado", Candidato.verificarAprovacao());
    }

    @Test
    void deveRetonarReprovado() {
        CandidatoEnem Candidato = new CandidatoEnem();
        Candidato.setNota1(8.0f);
        Candidato.setNota2(7.9f);
        assertEquals("Reprovado", Candidato.verificarAprovacao());
    }

    @Test
    void deveRetornarInformacoes() {
        CandidatoEnem Candidato = new CandidatoEnem();
        Candidato.setNota1(8.0f);
        Candidato.setNota2(8.0f);
        Candidato.setNome("Luiz");
        Candidato.setMatricula(551);
        assertEquals("CandidatoGraduacao{matricula=551, nome='Luiz', resultado=Aprovado}", Candidato.getInfo());
    }
}