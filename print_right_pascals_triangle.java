import java.util.Scanner;
public class Pattern
{
    public static void main(String args[])
    {
        int i,j;
        int num=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
        System.out.print("* \t");
            }
            System.out.println();
        }
        for(i=5-1;i>=1;i--)
        {
         for(j=1;j<=i;j++)
         {
             System.out.print("*\t");
         }
         System.out.println();
        }
    }
}
