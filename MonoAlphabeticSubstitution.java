
package ns.randomchallenge1;

public class MonoAlphabeticSubstitution {
    static String str1="abcdefghijklmnopqrstuvwxyz";
    static String str2="rstuvwxyzabcdefghijklmnopq";
    static String output="";
    public static String encrypt(String pt)
    {
    for(int i=0; i<pt.length();i++)
    {
        for(int j=0; j<26;j++)
    if(pt.charAt(i)==str1.charAt(j))
    {
    output+=str2.charAt(j);
    }
    }
    return output;
    }
       static String soutput="";
    public static String decrypt(String ct)
    {
    for(int i=0; i<ct.length();i++)
    {
        for(int j=0; j<26;j++)
    if(ct.charAt(i)==str2.charAt(j))
    {
    soutput+=str1.charAt(j);
    }
    }
    return soutput;
    }
    public static void main(String args[])
    {
    System.out.println("encrpyt: "+ encrypt("cmya"));
    String s=encrypt("cmya");
    System.out.println("decrpyt: "+ decrypt(s));
    }
}
