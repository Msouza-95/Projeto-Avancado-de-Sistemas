

package roteiro2.parte2;

/**
 *
 * @author MSOUZA
 */
public class TesteHeranca {
    
    public static void main(String[]args){
        
        Component button = new Component("Button");
        Component textBox = new Component("TextBox");
        Component textField = new Component("TextField");
        Component checkBox = new Component("CheckBox");
        Component combobox = new Component("Combobox");
        Component label = new Component("Label");
        Component radioButton = new Component("RadioButton");
        
        Container c1 = new GridContainer(2,2);
        
        c1.addComponent(button);
        c1.addComponent(textBox);
        c1.addComponent(textField);
        c1.addComponent(checkBox);
        
        c1.doLayout();
        
        System.out.println(" ************************ ");
        
        Container c2 = new FlowContainer();
        
        c2.addComponent(combobox);
        c2.addComponent(label);
        c2.addComponent(radioButton);
        
        c2.doLayout();
        
        System.out.println(" ************************ ");
        
        Container c3 = new FlowContainerBordaPontilhada();
        
        c3.addComponent(textBox);
        c3.addComponent(label);
        c3.addComponent(button);
        
        c3.doLayout();
        
        System.out.println(" ************************ ");
         
        Container c4 = new FlowContainerBordaSolida();
        
        c4.addComponent(combobox);
        c4.addComponent(combobox);
        c4.addComponent(checkBox);
        
        c4.doLayout();
        
        System.out.println(" ************************ ");
        
        Container c5 = new GridContainerBordaSolida(2,2);
        
        c5.addComponent(button);
        c5.addComponent(textBox);
        c5.addComponent(textField);
        c5.addComponent(checkBox);
        
        c5.doLayout();
        
        System.out.println(" ************************ ");
        
        Container c6 = new GridContainerBordaPontilhada(1,1);
        
      
        c6.addComponent(textField);
        c6.addComponent(checkBox);
        
        c6.doLayout();
       System.out.println(" ************************ ");
        
    }
    
}
