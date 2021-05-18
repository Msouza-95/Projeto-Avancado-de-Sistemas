
package roteiro8.parte2;

import dominio.SistemaContabil;

/**
 *
 * @author MSOUZA
 */
public class SistemaContabilAdapterIBM implements ISistemaContabilAdapter {
    
    private final SistemaContabil sistemacontabil;
    
    public SistemaContabilAdapterIBM(){
        this.sistemacontabil = new SistemaContabil("IBM");
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
