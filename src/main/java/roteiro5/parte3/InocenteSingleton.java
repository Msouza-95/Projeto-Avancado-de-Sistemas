
package roteiro5.parte3;

/**
 *
 * @author MSOUZA
 */
public class InocenteSingleton {
    
    private InocenteSingleton(){
}
    public static InocenteSingleton getInstance(){
        return new InocenteSingleton();
    }
}