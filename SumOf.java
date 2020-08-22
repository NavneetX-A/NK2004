import java.util.Scanner;
class SumOf
{
    int num;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    int firstDigit(int n) 
    { 
    while (n >= 10)  
    n /= 10; 
    return n; 
    } 
    int lastDigit(int n) 
    { 
    return (n % 10); 
    } 
    void add()
    {
        int sum=firstDigit(num)+lastDigit(num);
        System.out.println("The sumof the first and last digits of the no. is"+sum);
    }
    public static void main()
    {
        SumOf obj=new SumOf();
        obj.input();

        obj.add();
    }
}
