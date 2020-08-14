import java.util.Scanner;
class whilehw2
{
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
    }
    void compute()
    {
        int s=0;
        int a;
        while(n!=0)
        {
            a=n%10;
            s=s+a;
            n=n/10;
        }
        System.out.println("The sum of the digits of the number is:"+s);
    }
    public static void main()
    {
        whilehw2 obj=new whilehw2();
        obj.input();
        obj.compute();
    }
}
        
