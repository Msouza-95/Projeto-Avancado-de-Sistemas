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
public class Fuzil implements Arma {
    
    public void carregar(){
        System.out.println("Carregando o fuzil");
    }
    public void atirar(){
        System.out.println("Esse tiro faz um estrago");
    }
    public void mirar(){
        System.out.println("Zoom no alvo");
    }
}
