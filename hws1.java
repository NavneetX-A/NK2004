import java.util.Scanner;
class hws1
{
    int n;
    void input()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=obj.nextInt();
    }
    void compute()
    {
        int a=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
           a=a+i;
           sum=sum+a;
        }
        System.out.println("The answer is:"+sum);
    }
    public static void main()
    {
        hws1 obj=new hws1();
        obj.input();
        obj.compute();
    }
}

   
