import java.util.Random;

public class BankAccount {
    private String memberName, accNumber;
    private double accountBalance;
    public BankAccount(String memberName,double accountBalance){
        super();
        this.memberName =memberName;
        this.accountBalance=accountBalance;
        Random rand=new Random();
        accNumber ="" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+ rand.nextInt(10)+ rand.nextInt(10);
    }
    void deposit(double depAmount){
        this.accountBalance+=depAmount;

    }
    void withdraw(double withAmount)
    {
        if(withAmount<=this.accountBalance)
        {

            this.accountBalance-=withAmount;
        }
        else
            System.out.println("Not enough balance!");
    }
    String getAccNum(){
        return accNumber;
    }
    double getBalance(){
        return accountBalance;
    }
    void display(){
        System.out.println(memberName +" "+accNumber+" "+accNumber);
    }


}
