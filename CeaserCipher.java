/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package networksecurty;

/**
 *
 * @author admin
 */
public class CeaserCipher {
    static String ALPHABET="abcdefghijklmnopqrstuvwxyz";
    public static String encrypt(String pt,int shiftkey)
    {
        pt=pt.toLowerCase();
        String ct="";
        for(int i=0;i<pt.length();i++)
        {
            int position = ALPHABET.indexOf(pt.charAt(i));
            int keyVal=(position+shiftkey)%26;
            char c=ALPHABET.charAt(keyVal);
            ct+=c;
        }
    return ct;
    }
    
    public static String decrypt(String ct, int shiftkey)
    {
        String pt="";
        ct=ct.toLowerCase();
        for(int i=0;i<ct.length();i++)
        {
        int position=ALPHABET.indexOf(ct.charAt(i));
        int keyVal=(position-shiftkey)%26;
        if(keyVal<0)
        {
        keyVal=26+keyVal;
        }
        char c=ALPHABET.charAt(keyVal);
        pt+=c;
        }
            
    return pt;
    }
    public static void main(String[] args)
    {
    System.out.println("encrypted text is: \t"+encrypt("raoool",3));
     System.out.println("encrypted text is: \t"+decrypt(encrypt("raoool",3),3));
    }
}
