
package roteiro3.parte1;

/**
 *
 * @author MSOUZA
 */
public class SoccerPlayer extends Player {
    
    public SoccerPlayer(String name){
        super(name); 
    }
    
    
    @Override 
    public void definirTatica(){
        System.out.println(super.name + " Team work");
        
    }
}
