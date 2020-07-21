class SI2
{
    double rate,principal,time,interest;
    void init(double r,double t,double p)
    {
        rate=r;
        principal=p;
        time=t;
    }
    double calc()
    {
        interest=principal*rate*time/3;
        return interest;
    }
    public static void main()
    {
        SI2 obj=new SI2();
        obj.init(10.5,2,30000);
        double result=obj.calc();
        System.out.println(result);
    }
}
