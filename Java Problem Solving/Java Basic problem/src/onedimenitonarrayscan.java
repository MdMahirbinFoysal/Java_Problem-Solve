import java.util.Scanner;

public class onedimenitonarrayscan {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int length1=scan.nextInt();
        int num[]=new int[length1];
        for(int i=0;i<num.length;i++){
            num[i]= Integer.parseInt(scan.next());
        }
        for(int i=0;i<num.length;i++){
           System.out.println(num[i]);
        }

    }
}
