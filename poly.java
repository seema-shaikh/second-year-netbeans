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
public class poly {
    static int offset;
    static String key="acmya";
    public static int[] values;
    poly()
    {
        values=new int[key.length()];
    for(int i=0;i<key.length();i++)
    {
        char t=key.charAt(i);
    values[i]=t-97;
    }
    }
    
    public  String encrypt(String msg)
    {
    StringBuilder sb=new StringBuilder();
    int offset_pos=0;
    for(int i=0; i<msg.length();i++)
    {
        char t=msg.charAt(i);
    offset=values[offset_pos];
    offset_pos++;
    if((t>='a')&&(t<='z'))
    {
    int t1=t-'a'+offset;
    t1=t1%26;
    char ans=(char)(t1+'a');
    sb.append(ans);
    }
    if(offset_pos==key.length())
        offset_pos=0;
    }
    
    return sb.toString();
    }
            
    public  String decrypt(String msg)
    {
    StringBuilder sb=new StringBuilder();
    int offset_pos=0;
    for(int i=0; i<msg.length();i++)
    {
        char t=msg.charAt(i);
    offset=values[offset_pos];
    offset_pos++;
    if((t>='a')&&(t<='z'))
    {
    int t1=t-'a'-offset;
    if(t1<0)
    t1=t1+26;
    char ans=(char)(t1+'a');
    sb.append(ans);
    }
    if(offset_pos==key.length())
        offset_pos=0;
    }
    
    return sb.toString();
    }
}
