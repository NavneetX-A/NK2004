class Fare
{
    double bill;
    void acceptandcalc(double distance)
    {
        if(distance==1)
            bill=4;
        else if(distance<=5 && distance>1)
            bill=4+4*(distance-1);
        else if(distance>5 && distance<=15)
            bill=4+4*4+6*(distance-5);
        else if(distance>15)
            bill=4+4*4+6*10+8*(distance-15);
        else
            bill=0;
        System.out.println("The bill is:"+bill);
    }
}
