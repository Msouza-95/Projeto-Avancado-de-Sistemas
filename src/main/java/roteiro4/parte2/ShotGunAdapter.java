
package roteiro4.parte2;

import armas.artilharia.ShotGun;
/**
 *
 * @author MSOUZA
 */

public class ShotGunAdapter extends ShotGun implements Arma {

    @Override
    public void carregar() {
       this.loadGun();
    }

    @Override
    public void atirar() {
       this.shotKill();
    }

    @Override
    public void mirar() {
        this.targetEnemy();
    }

 
}
