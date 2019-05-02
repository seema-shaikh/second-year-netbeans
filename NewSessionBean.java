/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbpackage;
import java.math.*;
import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author admin
 */
@Stateless
public class NewSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public int simple(int p, int r, int n,int op)
    {
    return p*r*n;
    }
     public double compund(int p, int r, int n,int op)
    {
       
       return  (p*Math.pow((1+r/100), n));
    }
     public ArrayList<String> init(String p,String r, String n, String op)
     {
         ArrayList<String> a=new ArrayList();
         a.add(p);
          a.add(r);
           a.add(n);
            a.add(op);
         return a;
     }
}
