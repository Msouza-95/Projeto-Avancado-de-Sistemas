
package roteiro3.parte3;

/**
 *
 * @author MSOUZA
 */
public class ChessPlayer extends Player implements Runnable {
    
    public ChessPlayer(String name){
        super(name);
    }
    
    public void definirTatica(){
        System.out.println(super.name + " Dominates the center of the board");
    }
    
    @Override 
    public void correr() { 
        System.out.println(super.name + " - DO not run! he thinks!");
    }
}
