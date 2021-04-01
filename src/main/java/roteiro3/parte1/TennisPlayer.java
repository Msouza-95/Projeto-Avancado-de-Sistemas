

package roteiro3.parte1;

/**
 *
 * @author MSOUZA
 */
public class TennisPlayer extends Player{
    
    public TennisPlayer(String name){
        super(name);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.name + " Hit the ball over the opponent");
    }
}
