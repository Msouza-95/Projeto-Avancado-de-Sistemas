
package roteiro8.parte6;

import dominio.SistemaContabil;

/**
 *
 * @author MSOUZA
 */
public class SistemaContabilAdapterIBM extends SistemaContabilAdapter {
    
    private SistemaContabil sistemacontabil;
    
    public SistemaContabilAdapterIBM(){
        this.sistemacontabil = new SistemaContabil("IBM");
    }
    
    
    
}
