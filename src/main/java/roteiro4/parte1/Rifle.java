/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro4.parte1;

/**
 *
 * @author MSOUZA
 */
public class Rifle  implements Arma {
     public void carregar(){
        System.out.println("Carregando Rifle");
    }
    
    public void atirar(){
        System.out.println("Tiro de rifle não falha ");
    }
    public void mirar(){
        System.out.println("Alvo certeiro");
    }
}
