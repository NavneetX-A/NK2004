import java.util.Scanner;
class s1
{
    int n;
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms in the series:");
        n=sc.nextInt();
        }
        void computeSum()
        {
            int sum=0;
            for(int i=1;i<=n;i++)
                sum=sum+i;
            System.out.println("The sum of the series="+sum);
            }
            public static void main()
            {
                s1 obj=new s1();
                obj.getData();
                obj.computeSum();
                }
            }
        
        
