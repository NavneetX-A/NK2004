import java.util.Scanner;
public class Wage
{
    double hours;
    double rate;
    double wages;
    void accept()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no.of hours worked:");
        hours=obj.nextDouble();
        System.out.println("Enter the rate per hour:");
        rate=obj.nextDouble();
    }
    void compute()
    {
        if(hours>0&&hours<=35)
            wages=hours*rate;
        else if(hours>35&&hours<=60)
            wages=35*rate+1.5*(hours-35)*rate;
        else if(hours>60&&hours<=70)
            wages=rate*35+1.5*25+2*(hours-60)*rate;
        else
            wages=0;
        }
        void display()
        {
            System.out.println("The weekly wages is:"+wages);
        }
    }

        
        
    
        
        
        
    