
package roteiro3.parte4;

/**
 *
 * @author MSOUZA
 */
public class ChessPlayer extends Player {
    
    public ChessPlayer(String name, RunBehavior habilidadeCorrer){
        super(name, habilidadeCorrer);
    }
    
    public void definirTatica(){
        System.out.println(super.name + " Dominates the center of the board");
    }
    
    
}
