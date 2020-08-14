import java.util.Scanner;
class ACircle
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("Area of circle is:"+area);
    }
}
