/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro1.parte1;

/**
 *
 * @author MSOUZA
 */
public class ServicoQuarto {
   private MysqlConnection connection ;
   
   public ServicoQuarto(){
       this.connection = new MysqlConnection(); 
   }
   
   public void verificarQuarto(){
       this.connection.connect(); 
       System.out.println("Lógica de negócio para o Serviço de Quarto");
   }
}
