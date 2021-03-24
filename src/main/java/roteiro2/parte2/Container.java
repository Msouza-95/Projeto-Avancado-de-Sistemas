/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro2.parte2;

/**
 *
 * @author MSOUZA
 */
public abstract class Container {
    public abstract void addComponent(Component c);
    
    public abstract void removeComponent(Component c);
    
    public abstract void doLayout(); 
    
    public void dispose(){
        System.out.println("Fechar Container");
    }
    
}
