
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);

        int[][] data = new int[N][M];

        for (int i = 0; i < N; i++) {
            String[] cnp = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                data[i][j] = Integer.parseInt(cnp[j]);
            }
        }

        int result = 1;
        int length = 1;

        while (length <= N && length <= M) {
            for (int i = 0; i <= N - length; i++) {
                for (int j = 0; j <= M - length; j++) {
                    if (isSameValue(data, length, i, j) && isRange(result, length)) {
                        result = length;
                    }
                }
            }
            length++;
        }
        bw.write(String.valueOf(result * result));

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isSameValue(int[][] data, int length, int i, int j) {
        return data[i][j] == data[i + length - 1][j] && data[i][j + length - 1] == data[i + length - 1][j + length - 1] && data[i + length - 1][j] == data[i + length - 1][j + length - 1];
    }

    private static boolean isRange(int result, int length) {
        return result < length;
    }
}
