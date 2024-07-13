package one.digitalinnovation.gof;

/**
 * Singleton "Lazy Holder".
 * @see <a href="https://stackflow.com/a/24018148">Referencia </a>
 *
 * @author july-gusman
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder () {
        super();
    }
    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }



}
