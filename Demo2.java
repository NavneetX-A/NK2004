class Demo2
{
    int num1,num2,ans;//instance variable
    void init()//non parameterised method,void,called,header,prototype,multiple method,non interactive method,non static method
    {
        num1=5;//body of method
        num2=6;//local variable
    }
    void calc()
    {
        ans=num1+num2;
    }
    void display()
    {
        System.out.println("The result is:"+ans);
    }
}
