class Revision
{
    int rad;
    double area;
     void getRadius(int radius)//Parameterised function
     {
         rad=radius;
        }
        void calcArea()//Non-Parameterised
        {
            final double pi=3.142;
            area=pi*rad*rad;
        }
        void displayResult()
        {
            System.out.println("The area of the circle is "+area);
        }
        public static void main()
        {
            Revision objref;//Reference variabe,contains null value
            objref=new Revision();//Object creation,object pointing to Revisin object
            objref.getRadius(5);//Actual parameters/arguments,Caller
            objref.calcArea();
            objref.displayResult();
        }
    }