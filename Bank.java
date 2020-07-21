class Bank
{
    double balance;
    Bank()
    {
        balance=0;
    }
    void startAccount(double amt)
    {
        balance=amt;
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double amount)
    {
        balance-=amount;//amt withdrawn without any check
        
    }
    double getBalance()
    {
        return balance;
    }
}
        
        
        
        
    