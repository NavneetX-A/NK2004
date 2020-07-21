public class CharCodeCalcs
{
    public static void main()
    {
        char letter1='A';
        char letter2=(char)(letter1+1);
        char letter3=letter2;
        System.out.println("The sequence of letters:"+letter1+letter2+(++letter3));
        System.out.println("Here are the decimal codes for the letters:\n"+letter1+":"+(int)letter1+""+letter2+":"+(int)letter2+""+letter3+":"+(int)letter3);
    }
}
