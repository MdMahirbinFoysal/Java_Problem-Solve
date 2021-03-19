import java.util.Scanner;

public class Piramid2 {
    public static void main(String[] args) {
        System.out.println("Enter pyramid column: ");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        valueofPyramid(x);

    }
    public static void valueofPyramid(int n) {
        if (n <= 9) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= i; j++)
                    System.out.print(j);
                for (int j = i - 1; j >= 1; j--)
                    System.out.print(j);

                System.out.println();
            }
        }
        else {
            System.out.println(n+" column is not possible: ");
            n=9;
            System.out.println("Pyramid possible up to 9 column: ");

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= i; j++)
                    System.out.print(j);
                for (int j = i - 1; j >= 1; j--)
                    System.out.print(j);

                System.out.println();
            }
        }
    }
    }
