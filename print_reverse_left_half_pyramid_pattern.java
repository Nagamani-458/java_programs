import java.util.Scanner;
public class Pattern
{
    public static void main(String args[])
    {
        int i,j;
        for(i=5;i>0;i--)
        {
            for(j=0;j<5-i;j++)
            {
        System.out.print(" ");
            }
         for(j=0;j<i;j++)
         {
         System.out.print("*");
         }
         System.out.println();
        }
    }
}
