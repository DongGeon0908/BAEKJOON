import java.util.*;
import java.io.*;

class Main {
	public static void main(String args[]) throws Exception {
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferReader.readLine());

		HashSet<String> hashSet = new HashSet<String>();

		for (int i = 0; i < N; i++)
			hashSet.add(bufferReader.readLine());

		ArrayList<String> data = new ArrayList<String>(hashSet);

		Collections.sort(data, new Comparator<String>() {
			public int compare(String tmp, String cnp) {
				if (tmp.length() > cnp.length())
					return 1;
				else if (tmp.length() < cnp.length())
					return -1;
				else
					return tmp.compareTo(cnp);
			}
		});

		BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(System.out));// 선언

		for (String output : data) {
			bufferWriter.write(output);
			bufferWriter.newLine();
		}
		bufferWriter.flush();
		bufferWriter.close();
	}
}
