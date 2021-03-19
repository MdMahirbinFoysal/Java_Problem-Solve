public class Fibopnacchi {
    public static int factorial(int n){
        if (n <= 0)
            return 1; // stop condition
        return n * factorial(n-1); // call itself

    }
    public static void main( String[] args ){
        System.out.println("Factorial of 5 is: " + factorial(5));
        System.out.println("Factorial of 6 is: " + factorial(6));
    }
}
