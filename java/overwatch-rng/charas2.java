import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class charas2 {
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static String[] t = new String[9];
	static String[] d = new String[18];
	static String[] s = new String[8];
	
	public static void arry() {
		// tanks
		t[1] = "d.va";
		t[2] = "orisa";
		t[3] = "reinheart";
		t[4] = "Roadhog";
		t[5] = "Sigma";
		t[6] = "windston";
		t[7] = "Wreking ball";
		t[8] = "zarya";

		// dps
		d[1] = "Ashe";
		d[2] = "Bastion";
		d[3] = "Cassidy";
		d[4] = "Echo";
		d[5] = "Doomfist";
		d[6] = "Genji";
		d[7] = "Hanzo";
		d[8] = "Junkrat";
		d[9] = "Mei";
		d[10] = "Pharah";
		d[11] = "Reaper";
		d[12] = "Soldier: 76";
		d[13] = "Sombra";
		d[14] = "Symmetra";
		d[15] = "Torbjörn";
		d[16] = "Tracer";
		d[17] = "Widowmaker";

		// support
		s[1] = "Ana";
		s[2] = "Baptiste";
		s[3] = "Brigitte";
		s[4] = "Lúcio";
		s[5] = "Mercy";
		s[6] = "Moira";
		s[7] = "Zenyatta";
	}

	public static String overwatch(String role) {
		
		int number = rand.nextInt(8);
		String output = "test";
		output = output + number;
		if (role == "tanks") {
			output = (String)t[number];
		}
		if (role == "dps") {
			output = (String) d[number];
		}
		if (role == "support") {
			output = (String) s[number];
		}
		//System.out.println(input);
		System.out.println(number);
		System.out.println(output);

		/*
		 * //tanks String t1 = "d.va"; String t2 = "orisa"; String t3 = "reinheart";
		 * String t4 = "Roadhog"; String t5 = "Sigma"; String t6 = "windston"; String t7
		 * = "Wreking ball"; String t8 = "zarya";
		 * 
		 * //dps String d1 = "Ashe"; String d2 = "Bastion"; String d3 = "Cassidy";
		 * String d4 = "Echo"; String d5 = "Doomfist"; String d6 = "Genji"; String d7 =
		 * "Hanzo"; String d8 = "Junkrat"; String d9 = "Mei"; String d10 = "Pharah";
		 * String d11 = "Reaper"; String d12 = "Soldier: 76"; String d13 = "Sombra";
		 * String d14 = "Symmetra"; String d15 = "Torbjörn"; String d16 = "Tracer";
		 * String d17 = "Widowmaker";
		 * 
		 * //support String s1 = "Ana"; String s2 = "Baptiste"; String s3 = "Brigitte";
		 * String s4 = "Lúcio"; String s5 = "Mercy"; String s6 = "Moira"; String s7 =
		 * "Zenyatta";
		 */

		return output;
	}

	public static void main(String[] args) {
		System.out.print("Enter the role you would like to receive a hero for? ");
		String role = scan.nextLine();
		System.out.println("Here is what you entered: " + role);
		System.out.println();
		arry();
		String end;
		end = overwatch(role);
		System.out.println(end);

	}

}
