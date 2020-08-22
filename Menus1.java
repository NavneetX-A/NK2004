import java.util.Scanner;
class Menus1
{
    void generateMenu()
    {
        System.out.println("What would you like to do?");
        System.out.println("1.Calculate the sum of the first series");
        System.out.println("2.Calculate the sum of the second series");
        System.out.println("Press any integer other than 1/2 to exit.");
    }
    int fact(int m)
    {
        int a=1;
        for(int i=1;i<=m;i++)
                a=a*i;
        return a;
    }
    void s1()
    {
       Scanner sc=new Scanner(System.in);
       double x;
       double n;
       System.out.println("Enter x:");
       x=sc.nextDouble();
       System.out.println("Enter n:");
       n=sc.nextDouble();
       double sum=1;
       for(int i=1;i<=n;i++)
       {
           sum=sum+Math.pow(x,(2*i-1))/fact(i);
       }
       System.out.println("The sum of the first series is"+sum);
      
       
       
    }
    void s2()
    {
        Scanner sc=new Scanner(System.in);
       double x;
       double n;
       System.out.println("Enter x:");
       x=sc.nextDouble();
       System.out.println("Enter n:");
       n=sc.nextDouble();
       double sum=1;
       for(int i=1;i<=n;i++)
       {
           sum=sum+Math.pow(x,(i))/fact(i+1);
       }
       System.out.println("The sum of the second series is"+sum);

    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Menus1 obj=new Menus1();
        char choice;
        int opt;
        do
        {
            obj.generateMenu();
            System.out.println("Enter your selection[1/2]:");
            opt=sc.nextInt();
            if(opt==1)
                obj.s1();
            else if(opt==2)
                obj.s2();
            else
                return;
            System.out.println("Would you like to contine?[y/n]"); 
            choice=(sc.next()).charAt(0);
        }
        while(choice=='y');
        }
    }
    