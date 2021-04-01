

package roteiro3.parte4;

/**
 *
 * @author MSOUZA
 */
public class TennisPlayer extends Player{
    
    public TennisPlayer(String name, RunBehavior habilidadeCorrer){
        super(name, habilidadeCorrer);
    }
    
    @Override
    public void definirTatica(){
        System.out.println(super.name + " Hit the ball over the opponent");
    }
}
