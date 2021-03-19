import java.util.Scanner;

public class swap {
    public static void main(String args[]) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int temp=x;
        x=y;
        y=temp;
        System.out.println(x+","+y);
    }

}
