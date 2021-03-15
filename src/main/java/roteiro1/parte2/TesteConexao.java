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
public class TesteConexao {
    public static void main(String[]args){
        ServicoQuarto quarto = new ServicoQuarto();
        quarto.verificarQuarto();
        
        ServicoReserva reserva = new ServicoReserva();
        reserva.criarReserva();
        
        RelatorioReserva relatorio = new RelatorioReserva();
        relatorio.gerarRelatorio();
    }
}
