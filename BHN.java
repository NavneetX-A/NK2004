import java.util.Scanner;
class BHN
{
    double Order_Unit;
    double Total_cost;
    String c;
    void accept()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no.of Order_Unit:");
        Order_Unit=obj.nextDouble();
        System.out.println("Enter the character:");
        c=obj.nextLine();
    }
    void compute()
    {
            if(Order_Unit<=15)
                Total_cost=150*Order_Unit;
            else if(Order_Unit>15&&Order_Unit<=20)
                Total_cost=145*Order_Unit;
            else if(Order_Unit>20&&Order_Unit<=30)
                Total_cost=140*Order_Unit;
            else if(Order_Unit>30&&Order_Unit<=50)
                Total_cost=135*Order_Unit;
            else
                Total_cost=130*Order_Unit;
        if(c.toLowerCase()=="y"||c.toLowerCase()=="n")
            Total_cost=Total_cost-10*Total_cost/100;
        
        }

        
        void display()
        {
            System.out.println("The Total_cost is:"+Total_cost);
        }
    }
