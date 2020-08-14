class P6
{
    void displaygrade(String name,double percent)
    {
        System.out.println("Students Name:"+name);
        System.out.println("Perccentage maeks obtained is"+percent);
        //Classifying the grade
        if(percent>=90&&percent<=100)
            System.out.println("Grade obtained is A");
        else if(percent>=80)
            System.out.println("Grade obtained is B");
        else if(percent>=40)
            System.out.println("Grade obtained is C");
        else if(percent>=0)
            System.out.println("Grade obtained is D");
        else
            System.out.println("Invalid percentage value");
        }
    }
