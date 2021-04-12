
package roteiro5.parte1;

/**
 *
 * @author MSOUZA
 */
public class ControladorAereo {
    
    private boolean permetidoAterrissar;
    private boolean permetidoDecolar; 
 
    public ControladorAereo(){
        this.permetidoAterrissar = false;
        this.permetidoDecolar = true; 
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
