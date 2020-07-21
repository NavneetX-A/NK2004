class AccountDemo
{
    public static void main()
    {
        Bank my_account=new Bank();//creating an empty account
        my_account.startAccount(1000);
        my_account.deposit(250.00);
        System.out.println("Current Balance"+my_account.getBalance());
        my_account.withdraw(80.00);
        System.out.println("Remaining balance"+my_account.getBalance());
    }
}