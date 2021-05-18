
package roteiro8.parte2;

/**
 *
 * @author MSOUZA
 */
public class ControladorContabil {
    
    private ISistemaContabilAdapter sistemacontabilAdapter; 
    
    public ControladorContabil(){
        System.out.println("COntrolador de Sitema de Contabil Criado");
    }
    
    public void criarSistemaContabilAdapter(String name){
        if(name.equals("IBM")){
            this.sistemacontabilAdapter = new SistemaContabilAdapterIBM();
        }
        else if(name.equals("DELL")){
            this.sistemacontabilAdapter = new SistemaContabilAdapterDELL();
        }
    }
    
    
    public void calcularImposto(){
        this.sistemacontabilAdapter.registrarImposto();
    }
    
}
