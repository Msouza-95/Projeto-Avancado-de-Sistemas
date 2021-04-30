
package roteiro5.parte3;

/**
 *
 * @author MSOUZA
 */
public class EagerSingleton {
    
    private static EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton(){
    }
    
    public static EagerSingleton getInstance(){
        return instance; 
    }
    
}
