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
public class MonoAlphabetic {
    static String str= "abcdefghijklmnopqrstuvwxyz";
    static String str1="qwertyuiopasdfghjklzxcvbnm";
    static String stroutput="";
    public static String encrypt(String pt)
    {
    pt.toLowerCase();
    
    
    for(int i=0;i<pt.length();i++)
    {
        for(int j=0;j<str.length();j++)
        {
            if(pt.charAt(i)==str.charAt(j))
        stroutput+=str1.charAt(j);
        }
    }
    return stroutput;
    }
   
    public static String decrypt(String ct)
    {
        stroutput="";
        String pt="";
        ct.toLowerCase();
        for(int i=0;i<ct.length();i++)
        {
        for(int j=0;j<26;j++)
        {
        if(ct.charAt(i)==str1.charAt(j))
            stroutput+=str.charAt(j);
        }
        }
    return stroutput;
    }
    public static void main(String[] args)
    {
        String enc=encrypt("raoool");
    System.out.println("encrypted text is: \t"+enc);
    
        System.out.println("decrypted text is: \t"+decrypt(enc));
    }
}
