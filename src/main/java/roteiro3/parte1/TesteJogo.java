
package roteiro3.parte1;

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
        System.out.println("******************");
        
        SoccerPlayer ronaldo = new SoccerPlayer(" Ronaldinho Gaucho");
        ronaldo.treinar();
        ronaldo.estiloCompetidor();
        ronaldo.definirTatica();
        System.out.println("******************");
        
        
    }
    
}
