/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ns.randomchallenge1;

/**
 *
 * @author admin
 */
public class polyAlpha {
    public static void main(String args[])
    {
    poly p=new poly();
   String r= p.encrypt("raoolissmart");
   String s=p.decrypt(r);
   System.out.println("encrpted:\n"+r+"\ndecrypted\n"+s);
    }
    
}
