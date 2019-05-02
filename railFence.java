/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ns.randomchallenge1;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class railFence {
    int depth;
    static String encrypt(String pt, int depth)
    {
    int r=depth;
    int len=pt.length();
    int c=len/depth;
   String ct="";
    char[][] mat=new char[r][c];
    int k=0;
    for(int i=0; i<c; i++)
    {
    for(int j=0; j<r;j++)
    {
        if(k!=len)
    mat[j][i]=pt.charAt(k++);
        
    }
    }
      for(int i=0;i<r;i++)  
      {
      for(int j=0;j<c;j++)
      {
      ct+=mat[i][j];
      }
      }
      return ct;
    }
    
    static String decrypt(String ct, int depth)
    {
        int r=depth;
        int len=ct.length();
        int c=len/depth;String pt="";
        char mat[][]=new char[r][c];
        int k=0;
        for(int i=0;i<r;i++)
        {
        for(int j=0;j<c;j++)
        {
        mat[i][j]=ct.charAt(k++);
        }
        
        }
        
        for(int i=0;i<c;i++)
        {
        for(int j=0;j<r;j++)
        {
     pt+=mat[j][i];
        }
        
        }
    return pt;
    }
    
    public static void main(String[] args)
    {
       System.out.println("encryption: \n"+ encrypt("attacktheenemy",2)) ;
       String s=encrypt("attacktheenemy",2);
       System.out.println("encryption: \n"+ decrypt(s,2)) ;
    }
}
