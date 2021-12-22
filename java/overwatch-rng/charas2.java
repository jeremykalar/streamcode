import java.util.Random;
import java.util.Scanner;

public class charas2 {
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);
	static String[] t =  {"d.va", "orisa","reinheart", "Roadhog","Sigma","windston", "Wreking ball","zarya"};
	static String[] d = { "Ashe", "Bastion", "Cassidy", "Echo", "Doomfist", "Genji", "Hanzo", "Junkrat", "Mei",
			"Pharah", "Reaper", "Soldier: 76", "Sombra", "Symmetra", "Torbjörn", "Tracer", "Widowmaker" };
	static String[] s = { "Ana","Baptiste","Brigitte","Lúcio", "Mercy", "Moira", "Zenyatta",};



	public static void overwatch(String role) {
		// should be print out the arrays above
		// int number = rand.nextInt(8);
		String tanks = "tanks";
		String dps = "dps";
		String support = "support";
		if (role == tanks) {
			for (int i = 0; i < 6; i++) {
				System.out.println(t[i]);
				System.out.println(d[i]);
				System.out.println(s[i]);
			}

		}
	}

	public static String print() {
		System.out.print("Enter the role you would like to receive a hero for? ");
		String role = scan.nextLine();
		System.out.println("Here is what you entered: " + role);
		System.out.println();
		return role;
	}

	public static void main(String[] args) {
		String role = "dps";
		// role = print();
			overwatch(role);
		}
	}
