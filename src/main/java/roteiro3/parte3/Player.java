
package roteiro3.parte3;

/**
 *
 * @author MSOUZA
 */
public  abstract class Player {

   protected String name; 
    
    public Player(String name){
        this.name = name; 
    }
    
    public void treinar(){
        System.out.println(this.name + " running workout");
    }
    
    public void estiloCompetidor(){
        System.out.println(this.name + " Very Competitive");
    }
    
    
    
    public abstract void definirTatica();
}
