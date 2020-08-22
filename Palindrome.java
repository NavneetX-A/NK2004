import java.util.Scanner;
class Palindrome
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
    int a=num;
    int digit=-1;
    int rev=0;
    while(n!=0)
    {
        digit=n%10;
        rev=rev*10+digit;
        n=n/10;
    }
    System.out.println("The reverse of the number is:"+rev);
    if(a==rev)
    {
        System.out.println("It is a palindrome no.");
    }
    else
    {
        System.out.println("It is not a plaindrome no.");
    }
}
    public static void main()
    {
        Palindrome obj=new Palindrome();
        obj.input();
        obj.reverse();
    }
}
