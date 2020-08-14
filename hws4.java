import java.util.Scanner;
class hws4
{
int n;
void input()
{
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter the value of n:");
   n=obj.nextInt();
}
int compute1(int f)
{
   int sum=0;
   for(int i=1;i<=f;i++)
   {
     sum=sum+i;
   }
return sum;
}
int compute2(int m)
{
   int prod=1;
   for(int i=1;i<=m;i++)
   {
     prod=(prod*i);
   }
return prod;
}
void finalcompute()
{
   double tsum=0;
   for(int i=1;i<=n;i++)
   {
     tsum=tsum+(double)compute1(i+1)/compute2(i+1);
   }
System.out.println("The answer is:"+tsum);
}
public static void main()
{
hws4 obj=new hws4();
obj.input();
obj.finalcompute();
}
}
