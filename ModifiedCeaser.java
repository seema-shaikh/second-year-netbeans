
package ns.randomchallenge1;

import java.util.Scanner;

public class ModifiedCeaser {
    static String ALPHABET="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args)
    {
    System.out.println("modified ceaser: \n enter shiftkey: \t");
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    
    System.out.println("\nEncrpyting:\n");
    String en=encrypt("cmya",a);
    System.out.println(en);
    System.out.println("\nDecrypting:\n");
    System.out.println(decrypt(en,a));
    
    }
    public static String encrypt(String pt, int shiftkey)
    {
        pt=pt.toLowerCase();
        String ct="";
        
        for(int i=0;i<pt.length();i++)                          //mistake: pt.lrngth() -----no alphabet.length
        {
            int position= ALPHABET.indexOf( pt.charAt(i));
            int keyval=(shiftkey+position)%26;
             char replaceVal=ALPHABET.charAt(keyval);
             ct+=replaceVal;
              
        }
    return ct;
    }
    public static String decrypt(String ct, int shiftkey)
    {
        ct=ct.toLowerCase();
        String pt="";
        for(int i=0;i<ct.length();i++)
        {
        int position=ALPHABET.indexOf(ct.charAt(i));
       int keyval=(position-shiftkey)%26;               //int keyval --no changes in original shiftkey
       if(keyval<0)
           keyval=keyval+26;
       char replaceVal=ALPHABET.charAt(keyval);
       pt+=replaceVal;
        }
         
       
        
    return pt;
    }
}
 
