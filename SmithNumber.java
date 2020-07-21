import java.util.Scanner;
public class SmithNumber
{
static int sumDigit(int n)//method for calculating the sum of digits of the number
{
int s=0;
while(n>0)
{
s=s+n%10;
n=n/10;
}
return s;
}
int sumPrimeFact(int n)//method for calculating the sum of prime factors of a number
{
int i=2, sum=0;
while(n>1)
{
if(n%i==0)//if 'i' divides 'n' completely
{
sum=sum+sumDigit(i);//'sumDigit(i)'is used because in case of 2 or more digit prime numbers,we require the individual values of their digits
n=n/i;
}
else
{
do
{
i++;
}
while(!isPrime(i));//while the no. is prime(here a method is called)
}
}
return sum;
}
boolean isPrime(int k)//method to check whether a no. is prime or not
{
boolean b=true;
int d=2;
while(d<Math.sqrt(k))
{
if(k%d==0)
{
b=false;
}
d++;
}
return b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
SmithNumber ob=new SmithNumber();
System.out.print("Enter a Number:");
int n=sc.nextInt();
int a=ob.sumDigit(n);
int b=ob.sumPrimeFact(n);
System.out.println("Sum of Digit = "+a);
System.out.println("Sum of Prime Factor = "+b);
if(a==b)//if the sum of digits of 'n' is equal to the sum of prime factors of 'n'
System.out.print("It is a Smith Number");
else
System.out.print("It is Not a Smith Number");
}
}


