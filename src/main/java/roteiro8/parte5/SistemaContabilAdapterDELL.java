
package roteiro8.parte5;

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
