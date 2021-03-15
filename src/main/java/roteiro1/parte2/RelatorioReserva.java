/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro1.parte2;

/**
 *
 * @author MSOUZA
 */
public class RelatorioReserva {
    public OracleConnection connection; 
     
    public RelatorioReserva(){
        this.connection = new OracleConnection(); 
    }
     
     public void gerarRelatorio(){
        this.connection.connect();
        System.out.println("Lógica de negócio para Gerar o Relatorio");
    }
}
