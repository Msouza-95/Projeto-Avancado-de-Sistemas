
package roteiro8.parte1;

import dominio.SistemaContabil;

/**
 *
 * @author MSOUZA
 */
public class SistemaContabilAdapterIBM implements ISistemaContabilAdapter {
    
    private SistemaContabil sistemacontabil;
    
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
