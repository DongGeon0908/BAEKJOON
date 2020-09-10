import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine().trim();
         
        if (data.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(data.split(" ").length);
        }
    }
}
