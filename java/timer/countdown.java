import java.util.Scanner;

public class countdown {

	public static void main(String[] args) {
		System.out.println("enter the way you want the time to go");
		Scanner input = new Scanner(System.in);
		String count = input.next();
		int hour = 00;
		int min = 00;
		int sec = 01;
		timer(sec, min, hour, count);
		input.close();
	}

	public static void timer(int sec, int min, int hour, String count) {
		System.out.println(hour + ":" + min + ":" + sec);
		while(hour != 60) {
			if (count == "up") {
				sec = sec+1;
			}
			if (min == 60) {
				hour = +1;
				min = 00;
			}
			if (sec == 60) {
				min = +1;
				sec = 00;
			}
			if (count == "down") {
				sec = -1;
			}
			if (min == -1) {
				hour = -1;
				min = 60;
			}

			if (sec == -1) {
				min = -1;
				sec = 60;
			}
			System.out.println(hour + ":" + min + ":" + sec);
		}
	}

}
