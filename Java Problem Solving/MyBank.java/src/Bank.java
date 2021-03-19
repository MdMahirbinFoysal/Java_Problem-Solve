import java.util.ArrayList;

public class Bank {
    String bankName;
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    public Bank(String bankName) {
        super();
        this.bankName = bankName;
    }
    private void addAccount(BankAccount acc)
    {
        accounts.add(acc);
    }
    public void addAccount(String name, double balance)
    {
        BankAccount b1= new BankAccount(name,balance);
        addAccount(b1);
        System.out.println("Success");
    }
    public BankAccount findAccount(String accNum)
    {
        for(int i=0; i<accounts.size(); i++)
        {
            BankAccount b=accounts.get(i);
            if(b.getAccNum().equals(accNum))
                return b;
        }
        return null;
    }
    public void deposit(String accNum, double depAmount)
    {
        BankAccount b=findAccount(accNum);
        if(b!=null)
        {
            b.deposit(depAmount);
            System.out.println("Amount added!");
        }
        else
            System.out.println("Account Not Found!");
    }
    public void withdraw(String accNum, double withAmount)
    {
        BankAccount b=findAccount(accNum);
        if(b!=null)
        {
            b.withdraw(withAmount);
        }
        else
            System.out.println("Account Not Found!");
    }
    public void display(String accNum)
    {
        BankAccount b=findAccount(accNum);
        if(b!=null)
        {
            b.display();
        }
        else
            System.out.println("Account Not Found!");
    }
    public void display()
    {
        System.out.println(bankName);
        for(int i=0; i<accounts.size(); i++)
        {
            BankAccount b=accounts.get(i);
            b.display();
        }
    }
}
