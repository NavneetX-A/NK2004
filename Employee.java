public class Employee
{
    String employee_name;float employee_salary,HRA,total_salary;//instance variables
    String nameemp(String name)//method for inputing employee name
    {
        employee_name=name;
        return employee_name;
    }
     float salaryemp(float salary)//method for inputing employee salary
    {
        employee_salary=salary;
        HRA=50*employee_salary/100;
        total_salary=HRA+employee_salary;
        return total_salary;
    }
     public static void main()
    {
        Employee obj=new Employee();//creating an object
        String x=obj.nameemp("Navneet");  
        float y=obj.salaryemp(5000);
        System.out.println("The name of the employee is "+x);
        System.out.println("The total salary of the employee="+y);
    }
}


        
        