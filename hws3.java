    import java.util.Scanner;
    class hws3
    {
        int n;
        void input()
        {
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the value of n:");
            n=obj.nextInt();
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
            int sum=0;
            int d;
            for(int i=2;i<=n;i+=2)
            {
                if(i%4==0)
                    sum=sum-fact(i);
                else
                    sum=sum+fact(i);
            }
        System.out.println("The answer is:"+sum);
    }
    public static void main()
    {
        hws3 obj=new hws3();
        obj.input();
        obj.compute();
    }
}