import java.util.Scanner;
class hws2
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
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
                sum=sum-i;
            else 
                sum=sum+i;
        }
        System.out.println("The answer is:"+sum);
    }
    public static void main()
    {
        hws2 obj=new hws2();
        obj.input();
        obj.compute();
    }
}
