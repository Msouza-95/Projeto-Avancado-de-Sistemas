
package roteiro8.parte2;

/**
 *
 * @author MSOUZA
 */
public class TesteContolador {
    
    public static void main(String[] args) { 
        testeControladorContabil();
        testeControleEstoque();
    } 
    
    public static void testeControladorContabil(){
        System.out.println("Criando o Controlador Contabil");
        ControladorContabil controladorcontabil = new ControladorContabil();
        
        
        System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil DELL");
        controladorcontabil.criarSistemaContabilAdapter("DELL");
        controladorcontabil.calcularImposto();
        System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil IBM");
        controladorcontabil.criarSistemaContabilAdapter("IBM");
        controladorcontabil.calcularImposto();
    }
    
    
    public static void testeControleEstoque(){
        System.out.println("Criando o Controlador de Estoque");
        ControladorEstoque controladorEstoque = new ControladorEstoque();
        
        System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque DELL");
        controladorEstoque.criarSistemaEstoqueAdapter("DELL"); 
        controladorEstoque.aumentarQuantidadeItems();
   
        System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque IBM");
        controladorEstoque.criarSistemaEstoqueAdapter("IBM");
        controladorEstoque.aumentarQuantidadeItems(); 
        
        
    }
}
