//import java.util.StringTokenizer;
public class SplitInString {
    public static void main(String[] args) {
        String st=new String("University of Asia pacific");
        String words[]=st.split(" ");
        for(String s:words){
            System.out.println(s);
        }
    }
}
