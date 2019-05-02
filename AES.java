/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ns.randomchallenge1;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author admin
 */
public class AES {
    public static void main(String args[])
    {
        try {
            String s="java";
            KeyGenerator kg=KeyGenerator.getInstance("AES");
            Key k=kg.generateKey();
            Cipher c=Cipher.getInstance("AES");
            c.init(Cipher.ENCRYPT_MODE,k);
            
           
            byte[] encByte = c.doFinal(s.getBytes());
            String encStr=new String(encByte);
            System.out.println("encoded"+encStr);
               c.init(Cipher.ENCRYPT_MODE,k);
            byte[] decByte = c.doFinal(encByte);
               String decStr=new String(decByte);
            System.out.println("decoded"+decStr);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
            Logger.getLogger(AES.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(AES.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
