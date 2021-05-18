
package roteiro8.parte5;

/**
 *
 * @author MSOUZA
 */
public class ControladorEstoque {
    
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;
    
    public ControladorEstoque(){
        System.out.println("Controlador de Sitema de Estoque Criado");
    }
    
    public void criarSistemaEstoqueAdapter(String name){
  
     if(name.equals("IBM")){
           this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        } else if(name.equals("DELL")){
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
        }else if(name.equals("SAP")){
            this.sistemaEstoqueAdapter= new SistemaEstoqueAdapterSAP();
        }
    }
    
    public void aumentarQuantidadeItems(){
        this.sistemaEstoqueAdapter.aumentarQuantidadeItem();
    }
}
