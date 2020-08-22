import java.util.Scanner;
class Armstrong
{
    int num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void compute()
    {
    int a=num;
    int digit;
    double sum=0;
    while(num!=0)
    {
        digit=num%10;
        sum=sum+Math.pow(digit,3);
        num=num/10;
    }
    if(sum==a)
    {
        System.out.println("It is an armstrong no.");
    }
    else
    {
        System.out.println("It is not an armstrong no.");
    }
}
    public static void main()
    {
        Armstrong obj=new Armstrong();
        obj.input();
        obj.compute();
    }
}
    