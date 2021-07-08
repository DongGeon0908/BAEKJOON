import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> check = new HashSet<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");

            if (tmp[0].equals("add")) {
                check.add(Integer.parseInt(tmp[1]));
            } else if (tmp[0].equals("check")) {
                if (check.contains(Integer.parseInt(tmp[1]))) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (tmp[0].equals("remove")) {
                check.remove(Integer.parseInt(tmp[1]));
            } else if (tmp[0].equals("toggle")) {
                if (check.contains(Integer.parseInt(tmp[1]))) {
                    check.remove(Integer.parseInt(tmp[1]));
                } else {
                    check.add(Integer.parseInt(tmp[1]));
                }
            } else if (tmp[0].equals("all")) {
                check.clear();
                for (int j = 1; j <= 20; j++) {
                    check.add(j);
                }
            } else {
                check.clear();
            }

        }


        bw.flush();
        bw.close();
        br.close();
    }
}
