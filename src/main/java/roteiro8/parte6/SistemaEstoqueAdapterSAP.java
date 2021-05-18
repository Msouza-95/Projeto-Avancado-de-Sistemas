
package roteiro8.parte6;

import servico.SistemaEstoque;

/**
 *
 * @author MSOUZA
 */
public class SistemaEstoqueAdapterSAP extends SistemaEstoqueAdapter {
    
    private SistemaEstoque sistemaEstoque;
    
    public SistemaEstoqueAdapterSAP(){
        this.sistemaEstoque = new SistemaEstoque("SAP");
    }

    
    
}
