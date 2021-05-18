
package roteiro8.parte3;

/**
 *
 * @author MSOUZA
 */
public class ControladorEstoque {
    
    private ISistemaEstoqueAdapter sistemaEstoqueAdapter;
    
    public ControladorEstoque(){
        System.out.println("Controlador de Sitema de Estoque Criado");
    }
    
    public void criarSistemaEstoqueAdapter(String name){
  
     if(name.equals("IBM")){
           this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        } else if(name.equals("DELL")){
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
        }
    }
    
    public void aumentarQuantidadeItems(){
        this.sistemaEstoqueAdapter.aumentarQuantidadeItem();
    }
}
