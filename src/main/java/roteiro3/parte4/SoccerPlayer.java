
package roteiro3.parte4;

/**
 *
 * @author MSOUZA
 */
public class SoccerPlayer extends Player {
    
    public SoccerPlayer(String name, RunBehavior habilidadeCorrer){
        super(name,habilidadeCorrer); 
    }
    
    
    @Override 
    public void definirTatica(){
        System.out.println(super.name + " Team work");
        
    }
}
