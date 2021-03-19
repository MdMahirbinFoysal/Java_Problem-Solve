import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println("Enter input Aray Number");
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            a[i]=scan.nextInt();
        }
        maxMInArray(a);
    }
    public static void maxMInArray(int y[]){
        int max=y[0],min=y[0];
        for(int i=0;i<y.length;i++){

            if(y[i]>max){
                max=y[i];
                }
            if(y[i]<min){
                min=y[i];
            }
        }
        System.out.println("Maximum Number is:"+max);
        System.out.println("Minimum Number is:"+min);
    }
}
