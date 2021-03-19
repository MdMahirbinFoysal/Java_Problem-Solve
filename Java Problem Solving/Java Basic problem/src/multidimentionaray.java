import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class multidimentionaray {
    public static void main(String args[]){
        //int number[][]={{1,2,3,4},{6,7,8,3}};
        Scanner in=new Scanner(System.in);
        //int number[][] =new int([5][5]);
        int number[][]=new int[10][10];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                number[i][j]=parseInt(in.next());
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }


    }

    }

