
public class timer {
	public timer(int sec, int min, int hour, String count) {
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

		}
	}
}
