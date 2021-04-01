

package roteiro3.parte3;

/**
 *
 * @author MSOUZA
 */
public class TennisPlayer extends Player implements Runnable{
    
    public TennisPlayer(String name){
        super(name);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.name + " Hit the ball over the opponent");
    }
    
    @Override
    public void correr(){
      System.out.println(this.name + " Runs a lot during the game");
    }
 }
