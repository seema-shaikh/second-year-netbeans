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
public class PolyAlphabetic {
    static String key="java";
    static int[] keyArray=new int[key.length()];
    PolyAlphabetic()
    {
    for(int i=0;i<key.length();i++)
    {
        char c = key.charAt(i);
        int ascii=c-97;
        keyArray[i]+=ascii;
        
    }
    for(int i=0;i<key.length();i++)
    {
        System.out.println(""+keyArray[i]);
    }
    }
    
    public static String encrypt(String pt)
    {
        String ct="";
        pt=pt.toLowerCase();
     
        int offset=0;
        //StringBuffer sb=new StringBuffer();
        String[] s=new String[pt.length()];
        for(int i=0; i<pt.length();i++)
        {
               int offset_pos=keyArray[i];
        char t=pt.charAt(offset_pos);
       int t1=t-'a'+offset;
        if(offset_pos==key.length())
        {
        offset_pos=0;
        }
        offset_pos++;
        sb=(char)sb+(char)t1;
        }
        return sb.toString();
    }
    public static String decrypt(String ct)
    {
        ct=ct.toLowerCase();
        return pt;
    }
    public static void main(String[] args)
    {
    new PolyAlphabetic();
    }
}
