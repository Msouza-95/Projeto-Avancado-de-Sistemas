 
package roteiro7.parte1;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSOUZA
 */
public class DataBase {
    private List<Produto> produtos;
    private List<Cliente> clientes; 
    
    
    public DataBase(){
        this.clientes = new ArrayList<Cliente>();
        this.produtos = new ArrayList<Produto>();
        
        this.produtos.add(  new Produto(1,"Prod A", 2.9)); 
        this.produtos.add(  new Produto(2,"Prod B", 3.1)); 
    }
    
    public Cliente selectCliente(int id){
        for(Cliente c: this.clientes){
            if(c.getId()== id){
                return c ; 
            }
        }
        return null; 
        
    }
    
    public Produto selectProduto(int id){
        for(Produto p : this.produtos){
            if(p.getId()== id)
                return p;
        }
        return null; 
    }
    
    public void addCliente(Cliente c){
        this.clientes.add(c); 
    }
    
    public void addProduto(Produto p){
        this.produtos.add(p); 
    }
    
    public void processarPagamento(Cliente c, double total){ 
        System.out.println("Processando o pagamento : \n " + c);
        System.out.println("Pagamento realizado com sucesso ! Total = " + total); 
    }
}
