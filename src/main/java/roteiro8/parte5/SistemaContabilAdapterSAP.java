
package roteiro8.parte5;

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
