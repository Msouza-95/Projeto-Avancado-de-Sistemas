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
public class ServicoReserva {
    private OracleConnection connection; 
    
    public ServicoReserva(){
        this.connection = new OracleConnection();
    }
    
    public void criarReserva(){
        this.connection.connect();
        System.out.println("Lógica de negócio para Reserva do Quarto");
    }
    
}
