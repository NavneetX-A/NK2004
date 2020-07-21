public class Q8
{
    void check(String str,char ch)
    {
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
        }
        System.out.print("number of "+ch);
        System.out.println(" present is="+count);
    }
    void check(String s1)
    {
        s1=s1.toLowerCase();//converts the inputed String to lower case
        char[]vowels={'a','e','i','o','u'};
        for(int i=0;i<s1.length();i++)
        {
            for(int j=0;j<vowels.length;j++)
            {
                if(s1.charAt(i)==vowels[j])//checks whether a letter of the inputed string belongs to the array of vowels
                {
                    System.out.println(vowels[j]);
                }
            }
        }
    }
}
        
        

       
        
    