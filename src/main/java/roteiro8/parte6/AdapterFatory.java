
package roteiro8.parte6;

/**
 *
 * @author MSOUZA
 */
public class AdapterFatory {
    private SistemaEstoqueAdapter sistemaEstoqueAdapter; 
    private SistemaContabilAdapter sistemaContabilAdapter;
    
    private static AdapterFatory instance = new AdapterFatory(); 
 
    
    private AdapterFatory(){
        
    }
    
    
    public static AdapterFatory getInstance(){
        return instance;
    }
    
    public SistemaContabilAdapter criarSistemaContabilAdapter(String name){
        if(name.equals("IBM")){
            this.sistemaContabilAdapter = new SistemaContabilAdapterIBM();
        }
        else if(name.equals("DELL")){
            this.sistemaContabilAdapter = new SistemaContabilAdapterDELL();
        }else if(name.equals("SAP")){
            this.sistemaContabilAdapter= new SistemaContabilAdapterSAP();
        }
        
        return this.sistemaContabilAdapter;
    }
    
    
    public SistemaEstoqueAdapter criarSistemaEstoqueAdapter(String name){
        
        if(name.equals("IBM")){
           this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        } else if(name.equals("DELL")){
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
        }else if(name.equals("SAP")){
            this.sistemaEstoqueAdapter= new SistemaEstoqueAdapterSAP();
        }
        
        return this.sistemaEstoqueAdapter; 
    }
}
