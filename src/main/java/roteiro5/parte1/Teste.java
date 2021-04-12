/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro5.parte1;

/**
 *
 * @author MSOUZA
 */
public class Teste {
    
    public static void main(String[]args){
        ControladorAereo c1 = new ControladorAereo();
        ControladorAereo c2 = new ControladorAereo();
        
        
        c1.solicitarDecolagem();
        c2.solicitarDecolagem();
        System.out.println(" ");
        
        c1.solicitarAterrissagem();
        c2.solicitarAterrissagem();
    }
    
}
