 import java.util.*;
 class p9
 {
    public static void main(String args[])
    {
        for(int i =0;i<=4;i++)
        
        {
            for (int j=0;j<=i;j++)
            {
                if(i%2!=0 && j%2!=0)
                {
                    System.out.print("1");
                }                               //p9
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
 }
