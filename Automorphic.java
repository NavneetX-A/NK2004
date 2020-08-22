import java.util.Scanner;
class Automorphic
{
int num;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
num=sc.nextInt();
}

void compute()
{
    int sqr=num*num;
    int n=num;
    int count=0;
    int x;
    while(num!=0)
    {
        x=num%10;
        count++;
        num=num/10;
    }
    if(sqr%Math.pow(10,count)==n)
    {
        System.out.println("It is an automorphic no.");
    }
    else
    {
        System.out.println("Not an automorphic number");
    }
        
        


}
public static void main()
        {
            Automorphic obj=new Automorphic();
            obj.input();
            obj.compute();
        }
    }

  