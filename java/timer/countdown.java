import java.util.Scanner;

public class countdown {

	public static void main(String[] args) {
		int sec = 01;
		int min = 00;
		int hour = 00;
		question(sec, min, hour);

	}

	private static void question(int sec, int min, int hour) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the way you want the time to go");
		String count = input.next();
		timer(sec, min, hour, count);
		// run error
		/*
		 * if (count == "up" || count == "down") { timer(count); } else {
		 * System.exit(0); }
		 */
		input.close();
	}

	public static void timer(int sec, int min, int hour, String count) {
		print(sec, min, hour);
		while (hour != 60) {
			if (count == "up") {
				sec = sec + 1;
			}
			if (min == 60) {
				hour = hour + 1;
				min = 00;
			}
			if (sec == 60) {
				min = min + 1;
				sec = 00;
			}
			if (count == "down") {
				sec = sec - 1;
			}
			if (min == -1) {
				hour = -1;
				min = 60;
			}

			if (sec == -1) {
				min = -1;
				sec = 60;
			}
			print(sec, min, hour);

		}
	}

	private static void print(int sec, int min, int hour) {
		System.out.println(hour + ":" + min + ":" + sec);

	}

}
