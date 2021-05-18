
package roteiro8.parte5;

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
