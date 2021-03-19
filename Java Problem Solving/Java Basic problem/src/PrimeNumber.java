import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter your Number:");
        Scanner scan=new Scanner((System.in));
        int x=scan.nextInt();
        primeNumber(x);
    }
    public static void primeNumber(int a){
        int i,c=0;
        for ( i = 1; i <= a; i++) {
            if (a % i == 0) {
                c++;
            }
        }

        if (c == 2) {
           System.out.println(a+ " :is a Prime number");
        }
        else {
            System.out.println(a+ " :is not a Prime number");
        }
    }
}
