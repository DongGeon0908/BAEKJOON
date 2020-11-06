import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int check = 0;
		for(int i=0; i < N; i++) {
			int tmp = scan.nextInt();
			if(tmp == 0) {
				check = check - 1;
			} else {
				check = check + 1;
			}
		}
		
		if(check > 0) {
			System.out.println("Junhee is cute!");
		} else {
			System.out.println("Junhee is not cute!");
		}
	}

}
