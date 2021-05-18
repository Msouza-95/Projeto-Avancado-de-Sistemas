
package roteiro8.parte2;

import servico.SistemaEstoque;
/**
 *
 * @author MSOUZA
 */
public class SistemaEstoqueAdapterIBM implements ISistemaEstoqueAdapter{
    private SistemaEstoque sistemaEstoque;
    
    
    public SistemaEstoqueAdapterIBM(){
        this.sistemaEstoque = new SistemaEstoque("IBM");
    }
    @Override
    public void diminuirQuantidadeItem() {
        this.sistemaEstoque.removerItemEstoque();
    }

    @Override
    public void aumentarQuantidadeItem() {
        this.sistemaEstoque.adicionarItemEstoque();
    }
    
}
