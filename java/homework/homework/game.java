package homework;

import java.util.Scanner;
import homework.*;
public class game {
	static String heroname;
	static Scanner input = new Scanner(System.in);
	static String way;

	public static void main(String[] args) {
		//name();
		//path();
		int test = routes.number;
		System.out.println(test);
	}

	public static void path() {
		System.out.println("which way do you want to go");
		String path = input.next();
		System.out.println("is this your choice: " + path);
		String answer = input.next();
		boolean output = true;
		System.out.println(output);
		if (answer == "yes") {
			output = true;
		}
		if (answer == "no") {
			output = false;
		}
		if (answer == "exit") {
			exit();
		}
		if (output = true) {
			System.out.println(path);
			way = path;
			System.out.println(path);
		} else {
			path();
		}
	}

	public static void name() {
		System.out.println("enter the Hero's name");
		heroname = input.next();

	}

	public static void exit() { // move to its own class
		System.out.println("The game has ended");
		System.exit(0);
	}
}
