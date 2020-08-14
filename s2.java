import java.util.Scanner;
class s2
{
    int n;
    int x;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in the series:");
        n=sc.nextInt();
        System.out.println("Enter the number :");
        x=sc.nextInt();
        
        }
        void computeSum()
        {
            double s=0;
            for(int i=0;i<=n;i++)
                s=s+Math.pow(x,i);
            System.out.println("The sum is="+s);
            }
            public static void main()
            {
                s2 obj=new s2();
                obj.getData();
                obj.computeSum();
                }
            }
