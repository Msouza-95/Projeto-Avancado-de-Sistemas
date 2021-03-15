/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro1.parteFinal;

/**
 *
 * @author MSOUZA
 */
public class RelatorioReserva {
    public Connection connection; 
     
    public RelatorioReserva(Connection c){
        this.connection = c; 
    }
     
     public void gerarRelatorio(){
        this.connection.connect();
        System.out.println("Lógica de negócio para Gerar o Relatorio");
    }
}
