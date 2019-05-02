/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternASP;

/**
 *
 * @author admin
 */
public class patternasp {
    public static void main(String[] args)
    {
        String str="ABCDEFG";
        char[][] arr=new char[str.length()][2*str.length()-1];
       char c='A';
        //char t=(char)count;
        arr[0]=new char[7];
           arr[1]=new char[6];
              arr[2]=new char[5];
                 arr[3]=new char[4];
                    arr[4]=new char[3];
                       arr[5]=new char[2];
                          arr[6]=new char[1];
                           
    for(int i=0;i<arr.length;i++)
    {
       
    for(int j=0;j<arr[i].length;j++)
    {
    
      arr[i][j]=c++;
      
       }
    c='A';
    
    }
    
    //print
      for(int i=0;i<arr.length;i++)
    {
        int j;
    for( j=0;j<arr[i].length;j++)
    {
               System.out.print("" +arr[i][j] +"");
              
               
    }
    
    System.out.println();
    }
    
      
      
    }
}
