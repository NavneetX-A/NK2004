public class series1Q10
{
    public static void main()
    {
        String s="";
        for(int i=1;i<=5;i++)
        {
            if(i%2!=0)
            {
               s=s+"*";
               System.out.println(i+s);
            }
            else
            {
                s=s+"#";
                System.out.println(i+s);
            }
        }
    }
}
            

     
                    