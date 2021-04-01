
package roteiro3.parte2;

/**
 *
 * @author MSOUZA
 */
public class CardPlayer extends Player {
    
    public CardPlayer(String name){
        super(name);
    }
    public void definirTatica(){
        System.out.println(super.name + " He's a very calm player");
    }
    
    @Override 
    public void correr() { 
        System.out.println(super.name + " - DO not run! he thinks!");
    }
    
}
