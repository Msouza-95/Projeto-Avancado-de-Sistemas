
package roteiro6.parte3;

/**
 *
 * @author MSOUZA
 */
public class TesteComFacade {
    
    public static void main(String[] args) { 
        
     Facade facade = new Facade();
     
     facade.registrarCliente("Matheus souza", 222); 
     facade.comprar(1, 222); 
     facade.comprar(2, 222); 
     facade.finalizarCompra(222);
    }
}
