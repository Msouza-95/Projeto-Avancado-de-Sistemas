
package roteiro3.parte2;

/**
 *
 * @author MSOUZA
 */
public class TesteJogo {
    
    public static void main(String [] args){
        
        System.out.println("Teniis player details");
        TennisPlayer guga = new TennisPlayer(" Gustavo Kuerten");
        guga.treinar();
        guga.estiloCompetidor();
        guga.definirTatica();
        guga.correr();
        System.out.println("******************");
        
        SoccerPlayer ronaldo = new SoccerPlayer(" Ronaldinho Gaucho");
        ronaldo.treinar();
        ronaldo.estiloCompetidor();
        ronaldo.definirTatica();
        ronaldo.correr();
        System.out.println("******************");
        
        CardPlayer jose = new CardPlayer(" Jose das cartas");
        jose.treinar();
        jose.estiloCompetidor();
        jose.definirTatica();
        jose.correr();
        System.out.println("******************");
        
        ChessPlayer garry = new ChessPlayer(" Garry kasparov ");
        garry.treinar();
        garry.estiloCompetidor();
        garry.definirTatica();
        garry.correr();
        System.out.println("******************");
        
        GolfPlayer tiger = new GolfPlayer(" Tiger Woods ");
        tiger.treinar();
        tiger.estiloCompetidor();
        tiger.definirTatica();
        tiger.correr();
    }
    
}
