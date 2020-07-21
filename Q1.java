import java.util.Scanner;
public class Q1
{
    public static void main()
    {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number of rows for floyd's triangle-");//for getting the no. of rows
      int rows=input.nextInt();//'rows'is the variable which stores the inputed value 
      int number=1;
      for (int i=1;i<=rows;i++)
      {
         for (int j=1;j<=i;j++)
         {  
           System.out.print(number+" ");
           number++;
         }
         System.out.println();
      }
    }
}