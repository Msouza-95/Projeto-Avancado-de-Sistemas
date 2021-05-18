
package roteiro8.parte5;

/**
 *
 * @author MSOUZA
 */
public class ControladorContabil {
    
    private SistemaContabilAdapter sistemacontabilAdapter; 
    
    public ControladorContabil(){
        System.out.println("COntrolador de Sitema de Contabil Criado");
    }
    
    public void criarSistemaContabilAdapter(String name){
        if(name.equals("IBM")){
            this.sistemacontabilAdapter = new SistemaContabilAdapterIBM();
        }
        else if(name.equals("DELL")){
            this.sistemacontabilAdapter = new SistemaContabilAdapterDELL();
        }else if(name.equals("SAP")){
            this.sistemacontabilAdapter= new SistemaContabilAdapterSAP();
        }
    }
    
    
    public void calcularImposto(){
        this.sistemacontabilAdapter.registrarImposto();
    }
    
}
