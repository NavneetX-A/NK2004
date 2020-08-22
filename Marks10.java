import java.util.Scanner;
class Marks10
{
    public static void main()
    {
    Scanner sc=new Scanner(System.in);
    int[]marks=new int[10];
    int sum=0;
    for(int i=0;i<=9;i++)
    {
        System.out.println("Enter the marks of the "+(i+1)+"student");
        if(i!=10)
        {
        marks[i]=sc.nextInt();
        sum=marks[i]+sum;
        
    }
    else
    {
        break;
        }
    }
    double avg=(double)sum/10;
    System.out.println("The average is"+avg);
}
}
    

        
    
    
    
