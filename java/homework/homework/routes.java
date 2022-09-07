package homework;
import java.util.Random;

public class routes {
	static Random rand = new Random();
	static int number;

	public static int number() {
		number = rand.nextInt(10);
		System.out.println(number);
		return number;
	}
	

}
