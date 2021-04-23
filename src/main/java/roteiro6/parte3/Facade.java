
package roteiro6.parte3;

/**
 *
 * @author MSOUZA
 */
public class Facade {
    private DataBase db;
    private Cliente cliente;
    private Produto produto;
    
    
    public Facade(){
        this.db = new DataBase();
    }
    
    public void registrarCliente(String name, int id){
        this.cliente = new Cliente(id,name);
        
        this.db.addCliente(this.cliente);
        
    }
    
    public void comprar(int produtoID, int clienteId ){
        this.cliente = db.selectCliente(clienteId);
        this.produto = db.selectProduto(produtoID);
        
        this.cliente.getCarrinho().addProduto(this.produto);
    }
            
    public void finalizarCompra(int clienteId){
        
        this.cliente = db.selectCliente(clienteId);
        double total = this.cliente.calcularTotal(); 
        db.processarPagamento(this.cliente, total);
    }
}
