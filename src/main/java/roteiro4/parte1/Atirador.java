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
public class Atirador {
    public String name;
    public Arma arma; 
   public Atirador(String name, Arma arma){
       this.name = name;
       this.arma = arma;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Arma getArma() {
        return arma;
    }

   
    public void setArma(Arma arma) {
        this.arma = arma;
    }
   
    public void carregarArma(){
        System.out.println("Ação"+ this.name + ":");
        this.arma.carregar();
    }
    
    public void fazerMira(){
        System.out.println("Ação"+ this.name + ":");
        this.arma.mirar();
    }
   public void usarArma(){
       System.out.println("Ação"+ this.name + ":");
       this.arma.atirar();
   }
}
