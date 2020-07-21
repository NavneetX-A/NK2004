import java.util.Scanner;
public class Q4
{
    public static void main()
    {
        System.out.println("Enter 1 for Term Deposit");
        System.out.println("Enter 2 for Recurring Deposit");

        boolean s=false;
        while (s==false)//if the user inputs any invalid character then the loop will continue and it will again ask for a input
        {
        Scanner myobj=new Scanner(System.in);
        int deposit=myobj.nextInt();   
        switch(deposit)
        {
            case 1://if the user requires Term Deposit
            {
                System.out.println("Enter the Principal");
                double principal=myobj.nextDouble();
                System.out.println("Enter the rate of interest");
                double rate=myobj.nextDouble();
                System.out.println("Enter the time period in years");
                double time=myobj.nextDouble();
                double maturity=principal*Math.pow(1+rate/100,time);
                System.out.println("The maturity amount is "+maturity);
                s=true;
                break;
            }
            case 2://if the user requires Recurring Deposit
            {
                System.out.println("Enter the monthly installment");
                double mi=myobj.nextDouble();
                System.out.println("Enter the rate of interest");
                double r=myobj.nextDouble();
                System.out.println("Enter the time period in months");
                double n=myobj.nextDouble();
                double maturity_value=mi*n+mi*((n*(n+1))/2)*(r/100)*(1/12);
                System.out.println("The maturity amount is "+maturity_value);
                s=true;
                break;
                
            }
            default://if the user inputs a invalid character the progarm will give him/her a reminder
            {
            System.out.println("Invalid Input.Enter 1 or 2");
            break;
        }
    }
    }
}
}

                