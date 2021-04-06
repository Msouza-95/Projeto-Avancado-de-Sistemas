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
public class Pistola  implements Arma{
    
    public void carregar(){
        System.out.println("Carregando pistola");
    }
    
    public void atirar(){
        System.out.println("Pistola com tiro certo");
    }
    public void mirar(){
        System.out.println("Você está na mira");
    }
}
