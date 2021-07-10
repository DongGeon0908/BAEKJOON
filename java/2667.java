import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        m = n;

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            grid[i] = br.readLine().toCharArray();
        }

        solve(grid, m, n);
        Collections.sort(data);
        bw.write(data.size() + "\n");
        for (int i : data) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // dfs
    static int m, n;
    static int count;
    static List<Integer> data = new ArrayList<>();
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};


    private static void solve(char[][] grid, int m, int n) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count = 0;
                    dfs(grid, i, j);
                    data.add(count);
                }
            }
        }
    }

    private static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != '1') {
            return;
        }
        grid[i][j] = '0'; // visited;
        count++;
        for (int[] dir : dirs) {
            dfs(grid, i + dir[0], j + dir[1]);
        }
    }


}
