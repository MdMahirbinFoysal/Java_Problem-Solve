import java.util.Scanner;

public class FixedPassword1 {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
          int i=0;

            while (i != 2002) {
                i = scan.nextInt();
                System.out.println("Senha Invalida");
            }
            System.out.println("Acesso Permitido");


    }


}
