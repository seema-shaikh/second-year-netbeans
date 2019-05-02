/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
//akhil
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class dynamicComponent extends JFrame implements ActionListener{

    private final JPanel Panel;
    
    public dynamicComponent()
    {
    super("Add dynamic component:");
    setLayout(new BorderLayout());
    this.Panel=new JPanel();
    this.Panel.setLayout(new FlowLayout());
add(Panel,BorderLayout.CENTER);
    }
   
    public static void main(String[] args){
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}
