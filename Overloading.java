//WAP to demonstrate method overloading to accept values of different data types namely char,int etc.and print them.
class Overloading
{
    void prnsqr(int i)
    {
        System.out.println("Integer"+i+"square is "+i*i);
    }
    void prnsqr(char c)
    {
        System.out.println(c+"is a character"+"Thus no square");
    }
    void prnsqr(float f)
    {
        System.out.println("Float"+f+"square is"+f*f);
    }
    void prnsqr(double d)
    {
        System.out.println("double "+d+"square is "+d*d);
    }
public static void main()
{
    Overloading obj=new Overloading();
    obj.prnsqr(4);
    obj.prnsqr(3.6);
    obj.prnsqr('A');
    obj.prnsqr(6.5f);
}
}
    
        