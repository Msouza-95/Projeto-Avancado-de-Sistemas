
package roteiro8.parte5;

import servico.SistemaEstoque;

/**
 *
 * @author MSOUZA
 */
public class SistemaEstoqueAdapterDELL extends SistemaEstoqueAdapter {
    
    private SistemaEstoque sistemaEstoque;
    
    
    public SistemaEstoqueAdapterDELL(){
        this.sistemaEstoque = new SistemaEstoque("DELL");
    }
    
    
    
    
}
