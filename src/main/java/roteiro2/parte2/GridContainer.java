
package roteiro2.parte2;

/**
 *
 * @author MSOUZA
 */
import java.util.Arrays;
import java.util.List;

public class GridContainer extends Container {
    private Component[][] elements; 
    private int lineCount= 0;
    private int columnCount= 0; 
    private int columnMax = 0; 
    private int lineMax = 0; 
    
    public GridContainer (int lineMax , int columnMax){
        this.lineMax = lineMax;
        this.columnMax = columnMax;  
        this.elements = new Component[lineMax][columnMax];
    }
    
    @Override 
    public void addComponent(Component c){
        if( this.lineCount == this.lineMax && this.columnCount == this.columnMax ){
                System.out.println("Não é possivel add novos elementos");
        }else{
            this.elements[this.lineCount][this.columnCount]=c; 
            this.columnCount ++; 
            if(columnCount==this.columnMax){
                this.lineCount ++; 
               if(this.lineCount < this.lineMax){
                   this.columnCount = 0; 
               }
            }
        }
    }
    @Override
    public void removeComponent(Component c){
        for(int i =0 ; i<this.lineMax;i++){
            for(int j=0 ;j <this.columnMax;j++){
                if (this.elements[i][j]== c){
                    this.elements[i][j]= null;
                }
            }
         
        }
    }
    
    
    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println(" Elementos presentes no container");
        System.out.println(Arrays.deepToString(elements)); 
        System.out.println(" Método dispose como herança para fechar o container"); 
        this.dispose(); System.out.println("--------------------------------"); 
    }
}
