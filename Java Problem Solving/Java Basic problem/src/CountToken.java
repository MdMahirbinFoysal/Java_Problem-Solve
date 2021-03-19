import java.util.StringTokenizer;

public class CountToken {
    public static void main(String[] args) {
        StringTokenizer n=new StringTokenizer("university of asia pacific");
        int count=n.countTokens();
        for(int i=0;i<count;i++){
            System.out.println(n.nextToken());
        }
    }
}
