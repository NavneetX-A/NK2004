import java.util.Scanner;

public class Q5
{
    public static void main()
    {
      System.out.println("Enter 1 to print triangle of numbers");
      System.out.println("Enter 2 to print triangle of alphabets");
      Scanner obj=new Scanner(System.in);
      int a=obj.nextInt();
      System.out.println("Enter the no.of rows");
      int n=obj.nextInt();//variable 'n' stores the no.of rows required by the user
      switch(a)
      {
           case 1://if the user requires a triangle of numbers
           String s="";
           for(int i=1;i<=n;i++)
           {
                s=s+i+" ";
                System.out.println(s);
           }
           break;
           case 2://if the user requires a triangle of alphabets
           for (int i=n;i>0;i--)
           {
                int alphabet = 65;
                for (int j = 0; j < i; j++)
                {
                    System.out.print((char)(alphabet + j) + " ");
                }
                System.out.println();
           }
            
           break;
           default://if the user inputs anything invalid
           System.out.println("Invalid Input");
      }
    }
}

            


    
