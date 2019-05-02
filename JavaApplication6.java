/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author admin
 */
public class JavaApplication6 extends JFrame  {

    /**
     * @param args the command line arguments
     */
    public JavaApplication6()
    {
    JComboBox jc=new JComboBox();
    jc.addItem("Seema");
   jc.addActionListener(new ActionListener()
   {
   public void actionPerformed(ActionEvent ae)
   {
   jc.setName("10");
   }
   });
    JPanel p=new JPanel();
    p.add(jc);
    add(p);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       JavaApplication6 j= new JavaApplication6();
       j.setVisible(true);
    }
    
}
