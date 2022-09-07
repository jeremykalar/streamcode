package homework;

import java.util.Scanner;


public class path {
	static Scanner input = new Scanner(System.in);
	static String way;

	public static void path() {
		System.out.println("which way do you want to go");
		String path = input.next();
		System.out.println("is this your choice: " + path);
		String answer = input.next();
		boolean output;
		
		if (answer == "yes") {
			output = true;
		}
		else {
			output = false;
			System.out.println("test");
		}
		if (answer == "no") {
			output = false;
		}
		if (output = true) {
			System.out.println(path);
			way = path;
			System.out.println(path);
		} else {
			path();
		}
	}

}
