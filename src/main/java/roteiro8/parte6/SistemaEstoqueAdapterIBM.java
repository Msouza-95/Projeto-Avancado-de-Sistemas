
package roteiro8.parte6;

import servico.SistemaEstoque;
/**
 *
 * @author MSOUZA
 */
public class SistemaEstoqueAdapterIBM extends SistemaEstoqueAdapter{
    private SistemaEstoque sistemaEstoque;
    
    
    public SistemaEstoqueAdapterIBM(){
        this.sistemaEstoque = new SistemaEstoque("IBM");
    }
    
    
}
