import java.util.Scanner;
public class Q11
{
      public static void main() 
     {
        
        Scanner a = new Scanner(System.in);
        System.out.print("Enter no. of students- ");
        int n = a.nextInt();//variable 'n' stores the value of the no. of students
        
        int rollNo[] = new int[n];//variable 'n' stores the value of the no. of students
        String name[] = new String[n];//variable stores the names of 'n' students
        int eng[] = new int[n];//variable stores the marks of 'English'of 'n' students
        int sci[]=new int[n];//variable stores the marks of 'Science'of 'n' students
        int maths[] = new int[n];//variable stores the marks of 'Mathematics'of 'n' students
        double avg[] = new double[n];//variable stores average of 'n' students
        
        for (int i=0;i<n;i++) 
        {
            System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = a.nextInt();
            a.nextLine();
            System.out.print("Name: ");
            name[i] = a.nextLine();
            System.out.print("Subject 1 Marks: ");
            eng[i] = a.nextInt();
            System.out.print("Subject 2 Marks: ");
            sci[i] = a.nextInt();
            System.out.print("Subject 3 Marks: ");
            maths[i] = a.nextInt();
            avg[i] = (eng[i] + sci[i] + maths[i]) / 3.0;
        }
        System.out.println("Roll No\tName\tRemark");
        for (int i=0; i<n;i++) 
        {
            String remark;
            if (avg[i] < 40) 
                remark = "Poor";
            else if (avg[i] < 60)
                remark = "Pass";
            else if (avg[i] < 75)
                remark = "First Class";
            else if (avg[i] < 85)
                remark = "Distinction";
            else
                remark = "Excellent";
            System.out.println(rollNo[i] + "\t"+ name[i] + "\t"+ remark); 
        }
     }
}
