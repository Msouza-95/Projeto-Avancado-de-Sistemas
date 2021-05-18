
package roteiro8.parte6;

/**
 *
 * @author MSOUZA
 */
public class ControladorContabil {
    
    private SistemaContabilAdapter sistemacontabilAdapter;
    private AdapterFatory fatory; 
    
    public ControladorContabil(){
        System.out.println("COntrolador de Sitema de Contabil Criado");
        this.fatory =  AdapterFatory.getInstance();
    }
    
    public void criarSistemaContabilAdapter(String name){
        
       this.sistemacontabilAdapter = this.fatory.criarSistemaContabilAdapter(name);
    }
    
    
    public void calcularImposto(){
        this.sistemacontabilAdapter.registrarImposto();
    }
    
}
