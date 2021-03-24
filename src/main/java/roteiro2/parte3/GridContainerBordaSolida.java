
package roteiro2.parte3;

/**
 *
 * @author MSOUZA
 */

import java.util.Arrays;
import java.util.List;

public class GridContainerBordaSolida extends GridContainer {
    
    public GridContainerBordaSolida (int lineMax , int columnMax){
        super(lineMax, columnMax); 
    }
    
 
    
    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println("Este container contêm bordas solidas");
        System.out.println(" Elementos presentes no container");
        System.out.println(Arrays.deepToString(super.elements)); 
        System.out.println(" Método dispose como herança para fechar o container"); 
        this.dispose(); System.out.println("--------------------------------"); 
    }
    
}
