
package networksecurty;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class BlowFish {
    
    public static void main(String[] args)
    {
            try {
    
    System.out.println("Encrption for blowfish:\n");
    String str=JOptionPane.showInputDialog( "enter your string ");
    KeyGenerator kg=KeyGenerator.getInstance("BlowFish");
  
    SecretKey sk=kg.generateKey();
        
            Cipher c=Cipher.getInstance("BlowFish");
            c.init(Cipher.ENCRYPT_MODE,sk);
           byte[] arr1= c.doFinal(str.getBytes());
           
             System.out.println("Encrption for blowfish:\n");
                   c.init(Cipher.DECRYPT_MODE,sk);
                         byte[] arr2= c.doFinal(arr1);
                         String s=new String(arr2);
                         
                         JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "Encrption for blowfish:\n"+new String(arr1) + "\n decrypting" + s);
           
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(BlowFish.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(BlowFish.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(BlowFish.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(BlowFish.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(BlowFish.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    

    }
}
