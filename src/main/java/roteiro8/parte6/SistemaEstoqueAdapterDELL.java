
package roteiro8.parte6;

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
