
package roteiro3.parte3;

/**
 *
 * @author MSOUZA
 */
public class SoccerPlayer extends Player implements Runnable  {
    
    public SoccerPlayer(String name){
        super(name); 
    }
    
    
    @Override 
    public void definirTatica(){
        System.out.println(super.name + " Team work");
        
    }
    
    @Override
    public void correr(){
        System.out.println(this.name + " Runs a lot during the game");
    }
}
