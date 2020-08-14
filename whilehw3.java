import java.util.Scanner;
class whilehw3
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
        int count=0;
        int a;
        while(n!=0)
        {
            a=n%10;
            count++;
             n=n/10;
        }
        System.out.println("The count of the digits of the number is:"+count);
    }
    public static void main()
    {
        whilehw3 obj=new whilehw3();
        obj.input();
        obj.compute();
    }
}
