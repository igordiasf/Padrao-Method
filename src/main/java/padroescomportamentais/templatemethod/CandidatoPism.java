package padroescomportamentais.templatemethod;

public class CandidatoPism extends Candidato {

    public String verificarAprovacao() {
        if (this.calcularMedia() >= 7.0f) {
            return "Aprovado";
        }
        else {
            return "Reprovado";
        }
    }

}
