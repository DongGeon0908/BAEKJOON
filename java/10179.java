import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double N = scan.nextDouble();

      for (int i = 0; i < N; i++) {
         double tmp = scan.nextDouble();
         System.out.print("$");
         System.out.printf("%.2f", tmp * 0.8);
         System.out.println();
      }
   }
}
