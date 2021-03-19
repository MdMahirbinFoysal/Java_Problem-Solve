class BankAccount {
    String name;
    int id;
    double balance;

    public BankAccount(String name,int id,double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }
    void deposit(double depAmount){
        balance+=depAmount;
    }
    void withdraw(double withdraw){
        if(balance>withdraw){
            balance-=withdraw;
        }
        else
            System.out.println("Not enough Balance");
    }
    double getBalance(){
        return balance;
    }
    void display(){
        System.out.println("Name: "+name+" Id Number: "+id+" Balance: "+balance);
    }

}



public class Bank {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Foysal",18201034,10000.0f);
        b.display();
       b.withdraw(2000f);
        System.out.println("After Withdraw now balance: "+b.getBalance());
        b.deposit(10000f);
        System.out.println("After deposit Balance: "+b.getBalance());
        b.display();
    }

}
