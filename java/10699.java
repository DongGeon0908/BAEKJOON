import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");

		Date time = new Date();

		System.out.println(format1.format(time));
	}
}
