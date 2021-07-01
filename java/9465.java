import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        while (T-- > 0) {
            int n = scan.nextInt();
            int[][] data = new int[2][n + 1];

            for (int a = 0; a < 2; a++) {
                for (int b = 1; b < n + 1; b++) {
                    data[a][b] = scan.nextInt();
                }
            }

            int[][] dp = new int[2][n + 1];

            dp[0][0] = 0;
            dp[1][0] = 0;
            dp[0][1] = data[0][1];
            dp[1][1] = data[1][1];

            for (int j = 2; j < n + 1; j++) {
                dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + data[0][j];
                dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + data[1][j];
            }

            System.out.println(Math.max(dp[0][n], dp[1][n]));
        }


    }
}
