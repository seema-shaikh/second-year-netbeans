
package ns.randomchallenge1;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;

public class des {
    public static void main(String args[])
    {
        try{
    KeyGenerator kg=KeyGenerator.getInstance("DES");
    
   Key k= kg.generateKey();
    Cipher c=Cipher.getInstance("DES/CBC/PKCS5Padding");
    c.init(Cipher.ENCRYPT_MODE,k);
    String s="java";
    byte[] encByte=c.doFinal(s.getBytes());
    String encStr=new String(encByte);
    System.out.println(encStr);
    
    IvParameterSpec iv=new IvParameterSpec(c.getIV());
    c.init(Cipher.DECRYPT_MODE,k,iv);
    
    byte[] decByte=c.doFinal(encByte);
    String decStr=new String(decByte);
      System.out.println(decStr);
    }
        catch(Exception e)
        {
            
        }
    }

}
