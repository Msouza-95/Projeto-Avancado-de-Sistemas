
package roteiro8.parte6;

import dominio.SistemaContabil; 
/**
 *
 * @author MSOUZA
 */
public class SistemaContabilAdapterDELL extends SistemaContabilAdapter {
    
    private SistemaContabil sistemacontabil;
    
    
    public  SistemaContabilAdapterDELL(){
        this.sistemacontabil = new SistemaContabil("DELL"); 
    }

    
}
