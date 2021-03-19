import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestIo {
    public static void main(String[] args) throws FileNotFoundException {
       // System.out.println("Please Enter 3 number: ");
        Scanner scan=null;
        try{
           scan=new Scanner(new FileInputStream("input.txt"));
        }
      catch (FileNotFoundException e){
          e.printStackTrace();
      }
        int sum=0,count=0;
        double av;
        while (scan.hasNext()){
            sum+=scan.nextInt();
            count++;
        }
        av=(double)sum/count;
        //PrintStream p= new PrintStream("output.txt");
        PrintWriter p=new PrintWriter("output.txt");
        p.println("Sum: "+sum);
        p.printf(String.format("Avg: %.2f",av));
        p.close();
        scan.close();
    }
}
