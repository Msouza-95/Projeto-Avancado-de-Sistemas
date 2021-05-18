
package roteiro8.parte6;

/**
 *
 * @author MSOUZA
 */
public class ControladorEstoque {
    
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;
    private AdapterFatory fatory; 
    
    public ControladorEstoque(){
        System.out.println("Controlador de Sitema de Estoque Criado");
        this.fatory = AdapterFatory.getInstance();
    }
    
    public void criarSistemaEstoqueAdapter(String name){
        
        this.sistemaEstoqueAdapter = this.fatory.criarSistemaEstoqueAdapter(name);
     
    }
    
    public void aumentarQuantidadeItems(){
        this.sistemaEstoqueAdapter.aumentarQuantidadeItem();
    }
}
