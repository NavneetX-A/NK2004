    import java.util.Scanner;
    class s3
    {
        int n;
        int x;
        void input()
        {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the value of n:");
            n=obj.nextInt();
            System.out.println("Enter the value of x:");
            x=obj.nextInt();
        }
        int fact(int m)
        {
            int a=1;
            for(int i=1;i<=m;i++)
                a=a*i;
            return a;
        }
        void compute()
        {
            double sum=0;
            for(int i=1;i<=n;i++)
            {
                sum=sum+(Math.pow(x,i))/fact(i);

            }
        System.out.println("The answer is:"+sum);
    }
    public static void main()
    {
        s3 obj=new s3();
        obj.input();
        obj.compute();
    }
}
