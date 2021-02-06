import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String tmp = scan.nextLine();

      int result = 10;
      for (int i = 1; i < tmp.length(); i++) {
         if (tmp.substring(i, i + 1).equals(tmp.substring(i - 1, i))) {
            result = result + 5;
         } else {
            result = result + 10;
         }
      }
      System.out.println(result);
   }
}
