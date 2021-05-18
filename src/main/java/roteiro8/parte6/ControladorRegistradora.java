
package roteiro8.parte6;

import servico.SistemaEstoque;
import dominio.SistemaContabil;

/**
 *
 * @author MSOUZA
 */
public class ControladorRegistradora {
    private SistemaEstoqueAdapter sistemaEstoqueAdapter;
    private SistemaContabilAdapter sistemaContabilAdapter;
    private AdapterFatory fatory; 
    
    
    public ControladorRegistradora(){
       System.out.println("Controlador de Registradora Criado");
       this.fatory =AdapterFatory.getInstance();
    }
    
    public void criarSistemaContabilAdapter(String name){
        
        this.sistemaContabilAdapter = this.fatory.criarSistemaContabilAdapter(name);
    }
    
    public void criarSistemaEstoqueAdapter(String name){
        
       this.sistemaEstoqueAdapter = this.fatory.criarSistemaEstoqueAdapter(name);
    }
    
    public void diminuirQuantidadeItem(){
        this.sistemaEstoqueAdapter.diminuirQuantidadeItem();
    }
    
    public void registrarVendaSistemaContabil(){
        this.sistemaContabilAdapter.finalizarVenda();
    }
    
   
}
