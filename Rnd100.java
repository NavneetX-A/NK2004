public class Rnd100
{
    public static void main()
    {
        System.out.println("Random numbers between 1 and 100 are");
        for(int i=0;i<5;i++)
        {
            System.out.println("Random number["+(i+1)+"):"+(int)(Math.random()*100));
        }}
    }
