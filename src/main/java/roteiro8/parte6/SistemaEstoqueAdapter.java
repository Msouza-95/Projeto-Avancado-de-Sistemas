
package roteiro8.parte6;

import servico.SistemaEstoque;

/**
 *
 * @author MSOUZA
 */
public abstract class SistemaEstoqueAdapter {
    
    protected SistemaEstoque sistemaEstoque; 
    
    public void diminuirQuantidadeItem() {
        this.sistemaEstoque.removerItemEstoque();
    }

 
    public void aumentarQuantidadeItem() {
        this.sistemaEstoque.adicionarItemEstoque();
    }
    
}
