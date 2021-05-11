import java.util.Scanner;

public class game {
	public static int[] player1 = { 0, 0 };
	public static int[] player2 = { 0, 0 };
	public static boolean player = false;
	public static int heal = 10;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int turnlimit = input.nextInt();
		player();
		for (int i = 0; i <= turnlimit +1; i++) {
			turn(input);
		}
		input.close();
		fight();
	}

	public static void fight() {

		System.out.println("player 1 has: " + player1[0] + ", " + "player 2 has: " + player2[0]);
	}

	public static void player() {
		player1[0] = 100;
		player2[0] = 100;
		player1[1] = 50;
		player2[1] = 50;
	}

	public static void turn(Scanner input) {
		if (player == false) {
			player1turn(input);
			return;
		}
		if (player == true) {
			player2turn(input);
			return;
		}
	}

	public static void player1turn(Scanner input) {
		
		int cost = player1[1];
	
		System.out.println("You have " + player1[1] + " left to cast magic with");
		System.out.println("you can use the following spells with you magic: ");
		magic(input, cost);
		player1[0] += heal;
	}

	public static void player2turn(Scanner input) {
		int magic = player2[1];
		
		System.out.println("You have " + player2[1] + " left to cast magic with");
		System.out.println("you can use the following spells with you magic: ");
		magic(input, magic);
		player2[0] += heal;
	}

	public static void magic(Scanner input, int magic) {
		int magiccost = 0;
		if (magic == 50) {
			spells(magic);
		} else {
			System.out.println("you do not have enough to attack");
		}
		if (player == false) {
			player = true;
			return;
		}
		if (player == true) {
			player = false;
			return;
		}
	}

	private static void spells(int magic) {
		
		
	}

	public static void attack(int attackmagic) {

	}

}
