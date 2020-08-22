import java.util.Scanner;
class Digit
{
    int num;
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=sc.nextInt();
        n=num;
    }
    void Largest()
    {
        int a=0;
        int x;
        int Largest_num=0;
        while(num!=0)
        {
            x=num%10;
            if(x>a)
                Largest_num=x;
            a=x;
            num=num/10;
        }
        System.out.println("The largest no. is"+Largest_num);
    }
    void Smallest()
    {
        int a=9;
        
        int x;
        int Smallest_num=0;
        while(n!=0)
        {
            x=n%10;
            if(x<=a)
                Smallest_num = x;  
            a=x;
            n=n/10;
        }
        System.out.println("The smallest no. is"+Smallest_num);
    }
    public static void main()
    {
        Digit obj=new Digit();
        obj.input();
        obj.Largest();
        obj.Smallest();
    }
}
    

    
    
            
