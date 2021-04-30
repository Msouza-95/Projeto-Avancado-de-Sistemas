
package roteiro7.parte1;



/**
 *
 * @author MSOUZA
 */
public class TesteComFacade {
    
    public static void main(String[] args) { 
        
     Facade facade = Facade.getInstance();
     Facade facade2 = Facade.getInstance();
     
     facade.registrarCliente("Matheus souza", 222); 
     facade.comprar(1, 222); 
     facade.comprar(2, 222); 
     facade.finalizarCompra(222);
     
     System.out.println(facade == facade2 ? "Instâncias iguais" : "Instâncias diferentes");
    }
}
