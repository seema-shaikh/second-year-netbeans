
package networksecurty;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.util.Scanner;


public class RC4 
 {
   
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException
    {
    System.out.println("-----------------RC4 algorith------------");
      System.out.println("\n\t\t\tEnter the string to be encrypted:");
      Scanner s = new Scanner(System.in);
     String str= s.next();
       System.out.println("\n\t\t\tEnter the key for rc4:");
     
     String key= s.next();
     byte[] enc=encrypt(key,str);
     System.out.println(enc);
     String dec=decrypt(key,enc);
     System.out.println(new String(dec));
    }
    
    public static byte[] encrypt(String key, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException 
    {
        String s="";
  
    KeyGenerator kg=KeyGenerator.getInstance("RC4");
       kg.init(new SecureRandom(key.getBytes()));
     SecretKey sk= kg.generateKey();
 
    Cipher c=Cipher.getInstance("RC4");
  
    c.init(Cipher.ENCRYPT_MODE, sk);
   byte[] arr=c.doFinal(str.getBytes());
   s=new String(arr);

return arr;
    }
    
     public static String decrypt(String key, byte[] str) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException 
    {
        String s="";
   
    KeyGenerator kg=KeyGenerator.getInstance("RC4");
     
    kg.init(new SecureRandom(key.getBytes()));
    SecretKey sk= kg.generateKey();
    Cipher c=Cipher.getInstance("RC4");
  
    c.init(Cipher.DECRYPT_MODE, sk);
   byte[] arr=c.doFinal(str);
   
      
   
return new String(arr);
    }
}
