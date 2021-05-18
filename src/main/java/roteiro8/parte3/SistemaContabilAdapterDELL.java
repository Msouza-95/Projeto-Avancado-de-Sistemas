
package roteiro8.parte3;

import dominio.SistemaContabil; 
/**
 *
 * @author MSOUZA
 */
public class SistemaContabilAdapterDELL implements ISistemaContabilAdapter {
    
    private final SistemaContabil sistemacontabil;
    
    
    public  SistemaContabilAdapterDELL(){
        this.sistemacontabil = new SistemaContabil("DELL"); 
    }

    @Override
    public void finalizarVenda() {
        this.sistemacontabil.registrarVenda();
    }

    @Override
    public void registrarImposto() {
        this.sistemacontabil.calcularImposto();
    }
    
    
}
