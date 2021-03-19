import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        //int y=scan.nextInt();
        pyramid(x);


    }
    public static void pyramid(int a){
        for(int i=a;i>=1;i--){
         for(int j=1;j<=i;j++){

             System.out.print(j);

         }
            System.out.printf("\n");
        }

    }
}
