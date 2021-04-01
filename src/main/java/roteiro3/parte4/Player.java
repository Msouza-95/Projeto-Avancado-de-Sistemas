
package roteiro3.parte4;

/**
 *
 * @author MSOUZA
 */
public  abstract class Player {

   protected String name; 
   public RunBehavior habilidadeCorrer;
    
    public Player(String name,RunBehavior habilidadeCorrer ){
        this.name = name;
        this.habilidadeCorrer = habilidadeCorrer;
    }
    
    public void treinar(){
        System.out.println(this.name + " running workout");
    }
    
    public void estiloCompetidor(){
        System.out.println(this.name + " Very Competitive");
    }
    
    public void correr(){
        this.habilidadeCorrer.correr(); 
    }
    
    public abstract void definirTatica();

    /**
     * @param habilidadeCorrer the habilidadeCorrer to set
     */
    public void setHabilidadeCorrer(RunBehavior habilidadeCorrer) {
        this.habilidadeCorrer = habilidadeCorrer;
    }
}
