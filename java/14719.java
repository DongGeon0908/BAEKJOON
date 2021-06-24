import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final String REGEX = " ";
    private static int result = 0;
    private static List<Integer> right = new ArrayList<>();
    private static List<Integer> left = new ArrayList<>();
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> input = makeList(br.readLine());
        List<Integer> height = makeList(br.readLine());

        if (height.size() > TWO) {
            makeLeft(height);
            makeRight(height);
            makeResult(height);
        }

        bw.write(parsingString(result));

        bw.flush();
        bw.close();
        br.close();
    }

    private static void makeResult(List<Integer> height) {
        for (int i = ZERO; i < height.size(); i++) {
            result += Math.min(left.get(i), right.get(height.size() - ONE - i)) - height.get(i);
        }
    }

    private static void makeRight(List<Integer> height) {
        int max = height.get(height.size() - ONE);

        right.add(max);

        for (int i = height.size() - TWO; i >= ZERO; i--) {
            if (max < height.get(i)) {
                right.add(height.get(i));
                max = height.get(i);
            } else {
                right.add(max);
            }
        }
    }

    private static void makeLeft(List<Integer> height) {
        int max = height.get(ZERO);
        left.add(max);

        for (int i = ONE; i < height.size(); i++) {
            if (max < height.get(i)) {
                left.add(height.get(i));
                max = height.get(i);
            } else {
                left.add(max);
            }
        }
    }

    private static String parsingString(int input) {
        return String.valueOf(input);
    }

    private static List<Integer> makeList(String input) {
        return Arrays
                .stream(input.split(REGEX))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
