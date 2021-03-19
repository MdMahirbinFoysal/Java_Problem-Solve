import java.util.Scanner;

public class Timeus1068 {

    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        int x=scan.nextInt();
        int sum=0;
        if(x>0)
        {
            for(int i=1;i<=x;i++){
                sum=sum+i;
            }

        }
        else
            for(int i=x;i<=1;i++)
            {
                sum=sum+i;
            }
        System.out.println(sum);








    }
}
