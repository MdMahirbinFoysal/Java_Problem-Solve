import com.sun.xml.internal.ws.util.xml.CDATA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestInputOutput {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter country name,gold,silver and bronze medal:");
       // Scanner scan=new Scanner(System.in);
        Scanner scan=null;
        try{
            scan=new Scanner(new FileInputStream("New Text Document.txt"));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
            PrintStream p= new PrintStream("Output1.txt");
        if (scan == null) throw new AssertionError();
        while(scan.hasNext()){
                String data=scan.nextLine();
                String[] da= data.split(" ");
                int sum=0;
                for(int i=1;i< da.length;i++){
                    int medal=Integer.parseInt(da[i]);;
                    sum+=medal;
                }
                p.println(data+"=  "+sum);
            }
            scan.close();
            p.close();
        }
    }

