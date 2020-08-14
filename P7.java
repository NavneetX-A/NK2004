class P7
{
    void computecom(int sales)
    {
        int commission;
        if(sales<10000)
            commission=5;
        else if(sales>=10000&&sales<=50000)
            commission=8;
        else
            commission=10;
        System.out.println("The commission percent is:"+commission);
    }}
