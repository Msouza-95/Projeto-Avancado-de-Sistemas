
package roteiro8.parte4;

/**
 *
 * @author MSOUZA
 */
public class TesteContolador {
    
    public static void main(String[] args) { 
        testeControladorContabil();
        testeControleEstoque();
        testeControladoraRegistradora();
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
        
        System.out.println("Teste de Integração do Controlador Contabil - Sistema Contabil SAP");
        controladorcontabil.criarSistemaContabilAdapter("SAP");
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
        
        System.out.println("Teste de Integração do Controlador de Estoque - Sistema de Estoque SAP");
        controladorEstoque.criarSistemaEstoqueAdapter("SAP");
        controladorEstoque.aumentarQuantidadeItems(); 
        
        
    }
    
    
    public static void testeControladoraRegistradora(){
        System.out.println("Criando o Controlador da Registradora"); 
        ControladorRegistradora controladorregistradora = new ControladorRegistradora();
        
        System.out.println("Teste de Integração do Controlador da Registradora - Sistema de Estoque DELL");
        controladorregistradora.criarSistemaEstoqueAdapter("DELL");
        controladorregistradora.diminuirQuantidadeItem();
        
        System.out.println("Teste de Integração do Controlador da Registradora - Sistema de Estoque IBM");
        controladorregistradora.criarSistemaEstoqueAdapter("IBM");
        controladorregistradora.diminuirQuantidadeItem(); 
        
        System.out.println("Teste de Integração do Controlador da Registradora - Sistema de Estoque SAP");
        controladorregistradora.criarSistemaEstoqueAdapter("SAP");
        controladorregistradora.diminuirQuantidadeItem();
        
        System.out.println("Teste de Integração do Controlador da Registradora - Sistema Contabil DELL");
        controladorregistradora.criarSistemaContabilAdapter("DELL");
        controladorregistradora.registrarVendaSistemaContabil();
        
        System.out.println("Teste de Integração do Controlador da Registradora - Sistema Contabil IBM"); 
        controladorregistradora.criarSistemaContabilAdapter("IBM");
        controladorregistradora.registrarVendaSistemaContabil(); 
        
        System.out.println("Teste de Integração do Controlador da Registradora - Sistema Contabil SAP"); 
        controladorregistradora.criarSistemaContabilAdapter("SAP");
        controladorregistradora.registrarVendaSistemaContabil();
    }
}
