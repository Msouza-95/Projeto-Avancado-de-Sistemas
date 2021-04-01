
package roteiro3.parte4;

/**
 *
 * @author MSOUZA
 */
public class TesteJogo {
    
    public static void main(String [] args){
        
        RunFast correRapido = new RunFast();
        RunNoWay naoCorre = new RunNoWay(); 
        
        System.out.println("Teniis player details");
        TennisPlayer guga = new TennisPlayer(" Gustavo Kuerten",correRapido);
        guga.treinar();
        guga.estiloCompetidor();
        guga.definirTatica();
        guga.correr();
      
        
        SoccerPlayer ronaldo = new SoccerPlayer(" Ronaldinho Gaucho", correRapido);
        ronaldo.treinar();
        ronaldo.estiloCompetidor();
        ronaldo.definirTatica();
        ronaldo.correr();
        System.out.println("******************");
        
        CardPlayer jose = new CardPlayer(" Jose das cartas",naoCorre);
        jose.treinar();
        jose.estiloCompetidor();
        jose.definirTatica();
        jose.correr();
        System.out.println("******************");
        
        ChessPlayer garry = new ChessPlayer(" Garry kasparov ",naoCorre);
        garry.treinar();
        garry.estiloCompetidor();
        garry.definirTatica();
        garry.correr();
        System.out.println("******************");
        
        GolfPlayer tiger = new GolfPlayer(" Tiger Woods ",naoCorre);
        tiger.treinar();
        tiger.estiloCompetidor();
        tiger.definirTatica();
        tiger.correr();
        
        // começar a correr 
        
        tiger.setHabilidadeCorrer(correRapido);
        tiger.correr(); 
    }
    
}
