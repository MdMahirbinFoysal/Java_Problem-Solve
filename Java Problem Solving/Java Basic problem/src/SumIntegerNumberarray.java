import java.util.Scanner;

public class SumIntegerNumberarray {
    public static void main(String args[]) {
        System.out.println("Enter you input:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a[] = new int[x];

        for (int i =0; i < x; i++) {
            System.out.println("enter your digit:");
            a[i] = scan.nextInt();
        }
        sumIntegerNumber(a);
    }
    public static void sumIntegerNumber(int p[]){
        int sum=0;
        for (int i =0; i <p.length; i++) {
            while(p[i] % 2==0)
            {
                System.out.println("Even number is:"+p[i]);
                sum=sum+p[i];
                i++;
            }
        }

        System.out.println("Sum of all Even number is: "+sum);
    }


}
