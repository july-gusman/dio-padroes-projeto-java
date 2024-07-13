package one.digitalinnovation.gof.strategy;

public class Gato {
    private Emocao emocao;

    public void setEmocao(Emocao emocao) {
        this.emocao = emocao;
    }
    public void sentir() {
        Emocao.sentir();

    }
}
