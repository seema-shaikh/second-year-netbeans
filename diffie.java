
package ns.randomchallenge1;
import java.math.BigInteger;
import java.util.Scanner;

public class diffie {
    public static void main(String[] args)
    {
    Scanner s=new Scanner(System.in);
   
    BigInteger P=s.nextBigInteger();
    BigInteger G=s.nextBigInteger();
    
    BigInteger A=s.nextBigInteger();//alice chooses random 
    BigInteger B=s.nextBigInteger();//bob chooses random
    
    BigInteger X=G.modPow(A,P);//alice sends x to bob
    BigInteger Y=G.modPow(B, P);
    
    BigInteger k1=Y.modPow(A, P);
    BigInteger k2=X.modPow(B, P);
           System.out.println(k1.intValue()+"\t"+k2.intValue());
    
    
    }
}
