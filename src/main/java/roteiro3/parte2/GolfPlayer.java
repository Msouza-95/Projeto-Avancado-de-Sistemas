
package roteiro3.parte2;

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
    
    @Override 
    public void correr() { 
        System.out.println(super.name + " - DO not run! he put");
    }
    
}
