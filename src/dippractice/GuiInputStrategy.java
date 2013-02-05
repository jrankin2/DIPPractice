
package dippractice;

import javax.swing.JOptionPane;

public class GuiInputStrategy implements InputStrategy {
    
    public String inputMessage(){
        String input = JOptionPane.showInputDialog("Input something:", "");
        return input;
    }
}
