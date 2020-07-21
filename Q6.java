public class Q6
{
    public static void main(String s)
    {
        String[]word=s.split(" ");//splits the sentence into separate words
        String largest=" ";//initial value of 'largest' is kept empty
        for (int i=0;i<word.length;i++)
        {
            if(word[i].length() > largest.length())
            {
                largest = word[i];

            }
        } 
        System.out.println("The largest word is:"+largest);
    }
}
