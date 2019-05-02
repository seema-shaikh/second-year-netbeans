
package ns.randomchallenge1;

import java.math.*;

public class Vernam {
    public static void main(String args[])
    {
    String pt="SEEMA";
    char[] ptArray=pt.toCharArray();
      String ciph="tybscit";
    char[] ciphArray=ciph.toCharArray();
    char[] encoded=new char[ptArray.length];        //encoded is char[] of length ptaray
    System.out.println("Encoding:\n");
    for(int i=0;i<ptArray.length;i++)           // for loop mei pt.length
    {
    encoded[i]=(char)(ptArray[i]^ciphArray[i]);
    System.out.println(encoded[i]+"\n");
    }
    System.out.println("\ndecoding:\n");
    //char[] decoded=new char[ciphArray.length];
     for(int i=0;i<ptArray.length;i++)          // for loop mei pt.length
    {
    char c=(char)(encoded[i]^ciphArray[i]);     //decoded is character and not char[]
    System.out.println(c+"\n");
    }
    }
}
