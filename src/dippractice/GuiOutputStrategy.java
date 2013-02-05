package dippractice;

import javax.swing.JOptionPane;

public class GuiOutputStrategy implements OutputStrategy{
    @Override
    public void outputMessage(String msg){
        JOptionPane.showMessageDialog(null, msg);
    }
}
