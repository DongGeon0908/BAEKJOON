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

        char[] A = br.readLine().toCharArray();
        char[] B = br.readLine().toCharArray();

        char[] result1 = new char[A.length];
        char[] result2 = new char[A.length];
        char[] result3 = new char[A.length];
        char[] result4 = new char[A.length];
        char[] result5 = new char[A.length];


        for (int i = 0; i < A.length; i++) {
            if (A[i] == B[i] && A[i] == '1') {
                result1[i] = '1';
            } else {
                result1[i] = '0';
            }

            if (A[i] == '1' || B[i] == '1') {
                result2[i] = '1';
            } else {
                result2[i] = '0';
            }

            if (A[i] == '1' && A[i] == '1' && B[i] == '1') {
                result3[i] = '0';
            } else if (A[i] == '1' || B[i] == '1') {
                result3[i] = '1';
            } else {
                result3[i] = '0';
            }

            if (A[i] == '0') {
                result4[i] = '1';
            } else {
                result4[i] = '0';
            }

            if (B[i] == '0') {
                result5[i] = '1';
            } else {
                result5[i] = '0';
            }
        }

        for (char c : result1) {
            bw.write(c);
        }
        bw.write("\n");


        for (char c : result2) {
            bw.write(c);
        }
        bw.write("\n");

        for (char c : result3) {
            bw.write(c);
        }
        bw.write("\n");

        for (char c : result4) {
            bw.write(c);
        }
        bw.write("\n");

        for (char c : result5) {
            bw.write(c);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
