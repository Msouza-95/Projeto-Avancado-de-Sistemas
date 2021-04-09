
package roteiro4.parte2;




public class Teste {
    
    public static void main(String[]args ){
      
        Arma pistola = new Pistola(); 
        Atirador atirador01 = new Atirador(" General Matheus ",pistola); 
        
        System.out.println("\n" + atirador01.getName() + " brincando com a Pistola"); 
        atirador01.carregarArma();
        atirador01.fazerMira();
        atirador01.usarArma();
        
        Arma fuzil = new Fuzil(); 
        atirador01.setArma(fuzil);
        
        System.out.println("\n" + atirador01.getName() + " brincando com a Fuzil"); 
        atirador01.carregarArma();
        atirador01.fazerMira();
        atirador01.usarArma();
        
        Arma rifle = new Rifle();
        atirador01.setArma(rifle);
        
        System.out.println("\n" + atirador01.getName() + " brincando com a Rifle"); 
        atirador01.carregarArma();
        atirador01.fazerMira();
        atirador01.usarArma();
        
         Arma shot = new ShotGunAdapter(); 
        atirador01.setArma(shot);
        
        System.out.println("\n" + atirador01.getName() + " brincando com a ShotGun"); 
        atirador01.carregarArma();
        atirador01.fazerMira();
        atirador01.usarArma();
    }
    
}
