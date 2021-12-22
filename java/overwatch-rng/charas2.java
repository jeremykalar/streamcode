import java.util.Random;
import java.util.Scanner;

public class charas2 {
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static String[] t = new String[8];
	static String[] d = new String[17];
	static String[] s = new String[7];
	
	public static void arry() {
		// tanks
		t[0] = "d.va";
		t[1] = "orisa";
		t[2] = "reinheart";
		t[3] = "Roadhog";
		t[4] = "Sigma";
		t[5] = "windston";
		t[6] = "Wreking ball";
		t[7] = "zarya";

		// dps
		d[0] = "Ashe";
		d[1] = "Bastion";
		d[2] = "Cassidy";
		d[3] = "Echo";
		d[4] = "Doomfist";
		d[5] = "Genji";
		d[6] = "Hanzo";
		d[7] = "Junkrat";
		d[8] = "Mei";
		d[9] = "Pharah";
		d[10] = "Reaper";
		d[11] = "Soldier: 76";
		d[12] = "Sombra";
		d[13] = "Symmetra";
		d[14] = "Torbjörn";
		d[15] = "Tracer";
		d[16] = "Widowmaker";

		// support
		s[0] = "Ana";
		s[1] = "Baptiste";
		s[2] = "Brigitte";
		s[3] = "Lúcio";
		s[4] = "Mercy";
		s[5] = "Moira";
		s[6] = "Zenyatta";

	
		
	}

	public static void overwatch(String role) {
		
		//int number = rand.nextInt(8);
		if (role == "tanks") {
			for(int i = 0; i < t.length; i++) {
				System.out.println(t[i]);
			}
		}
		if (role == "dps") {
			for(int i = 0; i < d.length; i++) {
				System.out.println(d[i]);
			}
		}
		if (role == "support") {
			for(int i = 0; i < s.length; i++) {
				System.out.println(s[i]);
				}
			}

		//System.out.println(input);
		
		//return output;
	}

	public static void main(String[] args) {
		System.out.print("Enter the role you would like to receive a hero for? ");
		String role = scan.nextLine();
		System.out.println("Here is what you entered: " + role);
		System.out.println();
		arry();
		overwatch(role);
	

	}

}
