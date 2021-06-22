import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final String REGEX = " ";
    private static final int MAX = 31;
    private static int[][] dp = new int[MAX][MAX];

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> input = input(br.readLine());

        dp[1][1] = 1;

        for (int i = 1; i < MAX; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    dp[i][j] = 1;
                    continue;
                }
                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }

        bw.write(toString(area(input.get(0), input.get(1), input.get(2))));

        bw.flush();
        bw.close();
        br.close();
    }

    public static String toString(int inputData) {
        return String.valueOf(inputData);
    }

    public static List<Integer> input(String inputData) {
        return Arrays
                .asList(inputData.split(REGEX))
                .stream()
                .map(i -> Integer.parseInt(i))
                .collect(Collectors.toList());
    }

    public static int area(int r, int c, int w) {
        int sum = 0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j <= i; j++) {
                sum += dp[r + i][c + j];
            }
        }
        return sum;
    }
}
