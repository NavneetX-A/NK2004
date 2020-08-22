//WAP a menu driven program to calculate the volume of cone,cylinder and sphere.
import java.util.Scanner;
class Menu1
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1.Calculate the volume of Sphere");
        System.out.println("2.Calculate the volume of Cylinder");
        System.out.println("3.Calculate the volume of Cone");
        System.out.println("Press any integer other than 1/2/3 to exit.");
    }
    void calcSphereVolume()
    {
       Scanner sc=new Scanner(System.in);
       double volume;
       int radius;
       System.out.println("Enter the radius of the sphere:");
       radius=sc.nextInt();
       volume=(4/3)*(3.14)*radius*radius*radius;
       System.out.println("The volume of the Sphere="+volume);
    }
    void calcCylinderVolume()
    {
       Scanner sc=new Scanner(System.in);
       double volume;
       int radius;
       int height;
       System.out.println("Enter the radius of the cylinder:");
       radius=sc.nextInt();
       System.out.println("Enter the height of the cylinder:");
       height=sc.nextInt();
       volume=(3.14)*radius*radius*height;
       System.out.println("The volume of the Cylinder="+volume);
    }
    void calcConeVolume()
    {
       Scanner sc=new Scanner(System.in);
       double volume;
       int radius;
       int height;
       System.out.println("Enter the radius of the cone:");
       radius=sc.nextInt();
       System.out.println("Enter the height of the cone:");
       height=sc.nextInt();
       volume=(1/3)*(3.14)*radius*radius*height;
       System.out.println("The volume of the Cone="+volume);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Menu1 obj=new Menu1();
        char choice;
        int opt;
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1/2/3]:");
            opt=sc.nextInt();
            if(opt==1)
                obj.calcSphereVolume();
            else if(opt==2)
                obj.calcCylinderVolume();
            else if(opt==3)
                obj.calcConeVolume();
            else
                return;
            System.out.println("Would you like to contine?[y/n]"); 
            choice=(sc.next()).charAt(0);
        }
        while(choice=='y');
        }
    }
    