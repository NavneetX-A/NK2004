import java.util.Scanner;
class Avg
{
    int num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void natural()
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        double avg=(double)sum/num;
        System.out.println("The average of n natural numbers is"+avg);
    }
        void odd()
    {
        int sum=0;
        for(int i=1;i<=num;i+=2)
        {
            sum=sum+i;
        }
        double avg;
        if(num%2==0)
        {
            avg=(double)sum/(num/2);
            System.out.println("The average of n odd numbers is"+avg);
        }
        else if(num%2!=0)
        {
             avg=(double)sum/(num/2)+1;
             System.out.println("The average of n odd numbers is"+avg);
        }
        else
        {
            
        }
        
        
    }

    void even()
    {
          int sum=0;
        for(int i=2;i<=num;i+=2)
        {
            sum=sum+i;
        }
        

        double avg=(double)sum/(num/2);
        System.out.println("The average of n even numbers is"+avg);
    }

    public static void main()
    {
        Avg obj=new Avg();
        obj.input();
        obj.natural();
        
        obj.odd();
        obj.even();
    }
}

    
    