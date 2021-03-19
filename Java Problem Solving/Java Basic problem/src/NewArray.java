import java.net.SocketTimeoutException;
import java.util.Scanner;
public class NewArray {
        public static void main(String args[]){
            Scanner scan=new Scanner(System.in);
            int x[][]=new int[10][10];
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    x[i][j]=scan.nextInt();
                }

            }
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.println(x[i][j]);
                }

            }

        }

    }
