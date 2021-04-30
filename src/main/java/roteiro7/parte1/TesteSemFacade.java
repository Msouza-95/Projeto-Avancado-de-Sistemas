
package roteiro7.parte1;


/**
 *
 * @author MSOUZA
 */
public class TesteSemFacade {
    
    
   public static void main(String[]args){
       
       // Criando uma referencia para o banco de dados
       
       DataBase db = new DataBase();
    
    // Criando o cliente e adicionando ao banco de dados
     Cliente client1 = new Cliente(1,"Matheus"); 
     db.addCliente(client1);
    
    // Criando o carrinho de compras e adicionando ao cliente criado
     CarrinhoCompra carrinho = new CarrinhoCompra(); 
     client1.setCarrinho(carrinho);
    // Cliente 01 comprando os produtos 1 e 2 que estão armazenados no DB
       Produto p1 = db.selectProduto(1);
       Produto p2 = db.selectProduto(2);
        client1.getCarrinho().addProduto(p1);
        client1.getCarrinho().addProduto(p2);
    
        double total = client1.getCarrinho().getTotalCompra(); 
        db.processarPagamento(client1, total);
    // Finalizando a compra
       
       
   }
    
}
