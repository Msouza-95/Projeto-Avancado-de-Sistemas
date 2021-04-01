
package roteiro3.parte3;

/**
 *
 * @author MSOUZA
 */
public class GolfPlayer extends Player{
    
    public GolfPlayer(String name){
        super(name);
    }
    
    
    public void definirTatica(){
        System.out.println(super.name + "Scores with the number of strokes predicted");
    }
    
    
    
}
