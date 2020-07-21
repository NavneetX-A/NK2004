import java.util.*;
public class EmployeeIncome
{
    int pan;
    String name;
    double taxincome;
    double tax;
    public void input()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter pan number");
        pan=Integer.parseInt(kb.next());
        System.out.println("Enter name");
        name=kb.next();
        System.out.println("Enter taxable income");
        taxincome=Double.parseDouble(kb.next());
    }
    void calc()
    {
        if(taxincome<=100000)
            tax=0;
        else if((taxincome>=100001)&&(taxincome<=150000)) 
            tax=10*(taxincome-100000)/100;
        else if((taxincome>=150001)&&(taxincome<=250000)) 
            tax=5000+20*(taxincome-150000)/100;
        else  
            tax=25000+30*(taxincome-250000)/100;
    }
    void display()
    {
        System.out.println("Pan Number\t"+"Name\t"+"Tax-income\t"+"Tax");
        System.out.println(pan+"\t"+name+"\t"+taxincome+"\t"+tax);
    }
}
    

