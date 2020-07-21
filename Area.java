class Area
{
    void area(int x)
    {
        System.out.println("The area of the square is "+x*x);
    }
    void area(int y,int z)
    {
        System.out.println("The area of the rectangle is "+y*z);
    }
    void area(double r)
    {
        System.out.println("The area of the circle is "+22*r*r/7);
    }
    public static void main()
    {
        Area obj=new Area();
        obj.area(8);
        obj.area(9,10);
        obj.area(9.0);
    }
}
    
    
