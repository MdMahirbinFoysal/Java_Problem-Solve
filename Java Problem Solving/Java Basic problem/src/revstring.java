import java.util.Scanner;

public class revstring {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
       char name[]=scan.nextLine().toCharArray();
       for(int i=name.length-1;i>=0;i--){
           System.out.print(name[i]);
       }


    }

}
