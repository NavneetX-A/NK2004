import java.util.Scanner;
class whilehw1
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
        int s=1;
        int a;
        while(n!=0)
        {
            a=n%10;
            s=s*a;
            n=n/10;
        }
        System.out.println("The product of the digits of the number is:"+s);
    }
    public static void main()
    {
        whilehw1 obj=new whilehw1();
        obj.input();
        obj.compute();
    }
}
        
