
package roteiro6.parte1;

/**
 *
 * @author MSOUZA
 */
public class Cliente {
    private int id;
    private String name;
    private CarrinhoCompra carrinho; 
    
    public Cliente(int id, String name){
        this.id = id;
        this.name = name;
        this.carrinho = carrinho; 
        
    }
    
    @Override 
    public String toString() {
        return "Cliente : " + this.getId() + "\n"+ "Nome : "+ this.getName()+ "\n"; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarrinhoCompra getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(CarrinhoCompra carrinho) {
        this.carrinho = carrinho;
    }
    
}
