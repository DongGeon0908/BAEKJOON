import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int A = scan.nextInt();
      int B = scan.nextInt();
      int C = scan.nextInt();

      if (C * 2 <= A + B) {
         System.out.println(A + B - C * 2);
      } else {
         System.out.println(A + B);
      }
   }
}
