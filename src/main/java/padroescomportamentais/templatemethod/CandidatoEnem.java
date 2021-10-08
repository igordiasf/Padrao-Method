package padroescomportamentais.templatemethod;

public class CandidatoEnem extends Candidato {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 8.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

    @Override
    public String getTipo() {
        return "CandidatoGraduacao";
    }
}
