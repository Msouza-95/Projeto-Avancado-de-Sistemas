
package roteiro3.parte4;

/**
 *
 * @author MSOUZA
 */
public class CardPlayer extends Player {
    
    public CardPlayer(String name, RunBehavior habilidadeCorrer){
        super(name, habilidadeCorrer);
    }
    public void definirTatica(){
        System.out.println(super.name + " He's a very calm player");
    }
    
    
    
}
