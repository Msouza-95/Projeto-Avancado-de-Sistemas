
package roteiro8.parte6;

import dominio.SistemaContabil;
/**
 *
 * @author MSOUZA
 */
public class SistemaContabilAdapterSAP extends SistemaContabilAdapter{

    private SistemaContabil sistemaContabil;
    
    
    public SistemaContabilAdapterSAP(){
        this.sistemaContabil = new SistemaContabil("SAP");
    }
    
    
}
