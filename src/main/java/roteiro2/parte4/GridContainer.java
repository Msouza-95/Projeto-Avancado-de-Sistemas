
package roteiro2.parte4;

/**
 *
 * @author MSOUZA
 */


import java.util.Arrays;
import java.util.List;

public class GridContainer extends Container {
    protected Component[][] elements; 
    protected int lineCount= 0;
    protected int columnCount= 0; 
    protected int columnMax = 0; 
    protected int lineMax = 0; 
    
    public GridContainer (int lineMax , int columnMax){
        this.lineMax = lineMax;
        this.columnMax = columnMax;  
        this.elements = new Component[lineMax][columnMax];
    }
    
    public GridContainer (int lineMax , int columnMax, Borda borda){
        super(borda);
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
        if(this.borda!=null){
            this.borda.gerarBorda();
        }
        System.out.println(" Elementos presentes no container");
        System.out.println(Arrays.deepToString(elements)); 
        System.out.println(" Método dispose como herança para fechar o container"); 
        this.dispose(); System.out.println("--------------------------------"); 
    }
}
