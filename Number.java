
class Number
{

int compute2(int m)
{
int prod=1;
for(int i=1;i<=m;i++)
{
prod=(prod*i);
}
return prod;
}
void compute()
{
int x;
int sum=0;
int n;
for(int num=1;num<10;num++)
{
n=num;
while(n!=0)
{
x=n;
sum=compute2(x);
n=n/10;
if(sum==num)
System.out.println("Special no."+num);
}
}
}
void compute1()
{
int y;
int sum1=0;
int n1;
for(int i=10;i<=1000;i++)
{
n1=i;
while(n1!=0)
{
y=n1%10;
sum1=sum1+compute2(y);
n1=n1/10;

}
if(sum1==i)
{
System.out.println("Special no."+i);
}  
}
}
public static void main()
{
Number obj=new Number();
obj.compute();
obj.compute1();
    }}
            
            
        
      