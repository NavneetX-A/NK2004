import java.util.Scanner;
class Electricity
{
    double bill;
    int units;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of units:");
        int consumption=sc.nextInt();
        units=consumption;
    }
    void compute()
    {
        if((units>0)&&(units<=100))
            bill=units*40/100;
        else if(units>100&&units<=300)
            bill=100*40/100+(units-100)*60/100;
        else
            bill=100*40/100+200*60/100+(units-300);
        bill=bill+500;
        System.out.println("The bill is Rs."+bill);
        }
        void main()
        {
            Electricity obj=new Electricity();
            obj.accept();
            obj.compute();
        }
    }
    
