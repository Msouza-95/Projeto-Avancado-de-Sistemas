
package roteiro3.parte4;

/**
 *
 * @author MSOUZA
 */
public class GolfPlayer extends Player{
    
    public GolfPlayer(String name,RunBehavior habilidadeCorrer){
        super(name, habilidadeCorrer);
    }
    
    
    public void definirTatica(){
        System.out.println(super.name + "Scores with the number of strokes predicted");
    }
   
    
}
