import java.util.Scanner;

public class array {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int data=input.nextInt();
        String array[]=new String[data];
        for(int i=0;i<data;i++)
        {
            array[i]=input.next();
        }
        System.out.println("This ia my Frind name:");
        for(int i=0;i<data;i++)
        {
            System.out.println(array[i]);
        }

    }
}
