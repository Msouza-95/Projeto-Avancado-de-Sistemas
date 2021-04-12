
package roteiro5.parte2;


/**
 *
 * @author MSOUZA
 */
public class ControladorAereo {
    
    private boolean permetidoAterrissar;
    private boolean permetidoDecolar; 
    private static  ControladorAereo instance = new ControladorAereo();
 
    private ControladorAereo(){
        this.permetidoAterrissar = false;
        this.permetidoDecolar = true; 
    }
    
    public static ControladorAereo getInstance(){
        return instance; 
    }
    public void solicitarAterrissagem(){
        if(this.permetidoAterrissar){
            System.out.println("Permissão para aterrissagem concedida ");
            this.permetidoAterrissar = false; 
            this.permetidoDecolar= true; 
        }
        else{
            System.out.println("Permissão para aterrissagem Negada");
        }   
    }
    
    public void solicitarDecolagem(){
        
        if(this.permetidoDecolar){
             System.out.println(" Permissão para Decolar concedida!");
             this.permetidoAterrissar = true;
             this.permetidoDecolar = false; 
        }
        else{
            System.out.println("Permissão para Decolar Negada");
        }
    }
}
