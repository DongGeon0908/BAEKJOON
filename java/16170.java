import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy\nMM\ndd");

		String formatTime = format.format(System.currentTimeMillis());

		System.out.println(formatTime);

	}
}
