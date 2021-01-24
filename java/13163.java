import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        String T = scan.nextLine();
        
        for(int i=0; i < Integer.parseInt(T); i++){
            String tmp = scan.nextLine();
            String[] cnp = tmp.split(" ");
            cnp[0] = "god";
            for(String a : cnp){
                System.out.print(a);
            }
            System.out.println();
        }
      
    }

}
