package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy2.*;

import java.util.concurrent.atomic.AtomicReference;


public class Test {
    public static <Facade> void main(String[] args) {
        //Testes relacionados ao Design Pattern Singleton;
        //Singleton.

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        //Strategy2

        Emocao alegre = new EmocaoAlegre();
        Emocao descontente = new EmocaoDescontente();
        EmocaoFeliz feliz = new EmocaoFeliz();

        Gato gato = new Gato();
        gato.setEmocao(alegre);
        gato.sentir();
        gato.sentir();
        gato.setEmocao(descontente);
        gato.sentir();
        gato.setEmocao(feliz);
        gato.sentir();
        gato.sentir();



    }
    }


