
package roteiro8.parte4;

import servico.SistemaEstoque;
import dominio.SistemaContabil;

/**
 *
 * @author MSOUZA
 */
public class ControladorRegistradora {
    private ISistemaEstoqueAdapter sistemaEstoqueAdapter;
    private ISistemaContabilAdapter sistemaContabilAdapter;
    
    
    public ControladorRegistradora(){
       System.out.println("Controlador de Registradora Criado");
    }
    
    public void criarSistemaContabilAdapter(String name){
        if(name.equals("IBM")){
            this.sistemaContabilAdapter = new SistemaContabilAdapterIBM();
        }
        else if(name.equals("DELL")){
            this.sistemaContabilAdapter = new SistemaContabilAdapterDELL();
        }else if(name.equals("SAP")){
            this.sistemaContabilAdapter= new SistemaContabilAdapterSAP();
        }
        
    }
    
    public void criarSistemaEstoqueAdapter(String name){
        
        if(name.equals("IBM")){
           this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterIBM();
        } else if(name.equals("DELL")){
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterDELL();
        }else if(name.equals("SAP")){
            this.sistemaEstoqueAdapter = new SistemaEstoqueAdapterSAP();
        }
    }
    
    public void diminuirQuantidadeItem(){
        this.sistemaEstoqueAdapter.diminuirQuantidadeItem();
    }
    
    public void registrarVendaSistemaContabil(){
        this.sistemaContabilAdapter.finalizarVenda();
    }
    
   
}
