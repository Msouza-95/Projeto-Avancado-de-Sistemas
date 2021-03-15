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
public class TesteConexao {
    public static void main(String[]args){
        
        Connection db = new SqlServerConnection();
        ServicoQuarto quarto = new ServicoQuarto(db);
        quarto.verificarQuarto();
        
        ServicoReserva reserva = new ServicoReserva(db);
        reserva.criarReserva();
        
        RelatorioReserva relatorio = new RelatorioReserva(db);
        relatorio.gerarRelatorio();
    }
}
