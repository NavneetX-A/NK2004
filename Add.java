class Add
{
    int num1,num2,sum;
    void add(int n1,int n2)
    {
        num1=n1;
        num2=n2;
    }
    void add()
    {
        sum=num1+num2;
        System.out.println("The sum is "+sum);
    }
public static void main()
{
    Add obj=new Add();
    obj.add(6,9);
    obj.add();
    
}
}
        
