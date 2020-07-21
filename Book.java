class Book
{
    String code,title;
    double price;
    Book(String bookcode,String t,double pr)
    {
        code=bookcode;
        title=t;
        price=pr;
    }
    String getTitle()
    {
        return title;
    }
    String getCode()
    {
        return code;
    }
    double getPrice()
    {
        return price;
    }
    public static void main()
    {
        Book book1=new Book("Tech101","Learning Java",175.00);
        Book book2=new Book("Fict101","Your stories",225.00);
        Book book3=new Book("Myth101","Philosophy of Faith",375.00);
        System.out.println("Book1 details");
        System.out.println("Code:"+book1.getCode()+",Title;"+book1.getTitle()+",Price:"+book1.getPrice());
        System.out.println("Book2 details");
        System.out.println("Code:"+book2.getCode()+",Title;"+book2.getTitle()+",Price:"+book2.getPrice());
        System.out.println("Book3 details");
        System.out.println("Code:"+book3.getCode()+",Title;"+book3.getTitle()+",Price:"+book3.getPrice());
        
        
        

}
}

    
    
    
        