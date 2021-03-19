import java.util.Scanner;

public class IndividualDigits {
    public static void main(String args[]){
        System.out.println("Enter your Number:");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        individualNumber(a);
     }
     public static void individualNumber(int x){
         int rem=0;
         while(x!=0){
             rem=x%10;
             System.out.println("Digit:"+rem);
             x=x/10;
         }
     }
}
