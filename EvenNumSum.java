import java.util.Scanner;
class EvenNumSum
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the number");
        int n=sc.nextInt();
        int sum=0;
        if(n>=2)
        {
        for(int i=2;i<n;i+=2)
        {
            sum=sum+i;
        }
        System.out.println("The output is:"+sum);
    }
    else
    {
        System.out.println("Error.Value inputed less than two");
    }
}
}
