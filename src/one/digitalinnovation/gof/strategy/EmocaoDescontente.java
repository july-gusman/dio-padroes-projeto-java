package one.digitalinnovation.gof.strategy;

public class EmocaoDescontente implements Emocao{
    @Override
    public void sentir() {
        System.out.println("Sentindo-se descontente...");
    }
}

