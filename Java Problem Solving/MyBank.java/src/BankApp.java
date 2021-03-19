import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
        Bank myBank=new Bank("New Switch Bank");
        System.out.println("Input ‘1’ means create new account"+"\n"+"tInput ‘2’ means deposit money"+"\n"+"Input ‘3’ means withdraw money. "+"\n"+"Input ‘4’ means display the account info of a particular account."+"\n"+"Input ‘5’ means display all accounts info."+"\n"+"Input ‘0’ means exit the system."+"\n");
        Scanner scan=new Scanner(System.in);
        while(true){
            int num=scan.nextInt();
            scan.nextLine();
            if(num==1){
                System.out.println("Enter member name: ");
                String name=scan.nextLine();
                System.out.println("Initial Balance: ");
                double bal=scan.nextDouble();
                myBank.addAccount(name,bal);
            }
            if(num==2){
                System.out.println("Enter your Account Number: ");
                String accNum=scan.nextLine();
                System.out.println("Enter Balance  wants to Deposit: ");
                double bal1=scan.nextDouble();
                myBank.withdraw(accNum,bal1);
            }
            if(num==3){
                System.out.println("Enter your Account Number: ");
                String accNum=scan.nextLine();
                System.out.println("Enter Balance  wants to Withdraw: ");
                double bal1=scan.nextDouble();
                myBank.withdraw(accNum,bal1);
            }
            if(num==4){
                System.out.println("Enter Your Account Number: ");
                String accNum=scan.nextLine();
                myBank.display(accNum);
            }
            if(num==5){
                myBank.display();
            }
            if(num==0){
                break;
            }
        }

        }
    }


