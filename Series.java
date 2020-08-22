import java.util.Scanner;
class Series
{
    double series(double n)//first method inside which the sum of the second series is calculated
    {
        double sum=0;
        for(double i=1;i<=n;i++)
        {
            sum=sum+1/i;
        }
        return sum;
    }
    double series(double a,double n)//second method inside which the sum of the second series is calculated
    {
        double sum=0;
        int j=1;//numerator
        int k=2;//power of 'a'
        for(int i=1;i<=n;i++)//loop will continue till 'n' terms
        {
            sum=sum+j/Math.pow(a,k);
            j+=3;//increments the numerator
            k+=3;//increments the power of 'a'
        }
        return sum;
    }
    public static void main()
    {
        Series obj=new Series();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n for the first series:");
        System.out.println("The sum of the first series is:"+obj.series(sc.nextDouble()));//asks for input for 'n' for the first series
        System.out.println("Enter \'a\' and \'n\' for the second series respectively:");
        System.out.println("The sum of the second series is:"+obj.series(sc.nextDouble(),sc.nextDouble()));//asks for input for 'n' and 'a' for the second series
    }
}
    
        
