import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        
        for(int i=0; i < Integer.parseInt(T); i++){
            String tmp = scan.nextLine();
            System.out.println(i+1 +". " + tmp);
        }
      
    }

}
