class IncomeTax
{
    void taxcalc(String name,double income)
    {
        int tax;
        if(income<=40000)
            tax=0;
        else if(income>40000&&income<=70000)
            tax=20;
        else if(income>70000&&income<=100000)
            tax=30;
        else
            tax=40;
        System.out.println("Employee name:"+name);
        System.out.println("The tax due is:"+tax/100*income);
    }
}
