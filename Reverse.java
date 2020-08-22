import java.util.Scanner;
class Reverse
{
    int num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void reverse()
    {
    int n=num;
    int digit=-1;
    int rev=0;
    while(n!=0)
    {
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
    System.out.println("The reverse of the number is:"+rev);
    }
    public static void main()
    {
        Reverse obj=new Reverse();
        obj.input();
        obj.reverse();
    }
}
