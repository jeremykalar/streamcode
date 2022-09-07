package homework;

import java.util.Scanner;
import homework.*;
import path.*;
public class game {
	static String heroname;
	static Scanner input = new Scanner(System.in);
	static String way;

	public static void main(String[] args) {
		//name();
		//path();
		//int test = routes.number();
		//System.out.println(test);
		path.path();
	}



	public static void name() {
		System.out.println("enter the Hero's name");
		heroname = input.next();

	}

	
}
