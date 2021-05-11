import java.util.Scanner;

public class game {
	public static int[] player1 = { 0, 0 };
	public static int[] player2 = { 0, 0 };
	public static boolean player = false;
	public static int heal = 0;
	public static int magic = 0;
	public static int damage = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int turnlimit = input.nextInt();
		player();
		for (int i = 0; i <= turnlimit; i++) {
			turn(input);
		}
		input.close();
		fight();
	}

	public static void fight() {

		System.out.println("player 1 has: " + player1[0] + ", " + "player 2 has: " + player2[0]);
	}

	public static void player() {
		player1[0] = 100; // health
		player2[0] = 100; // health
		player1[1] = 150; // mana
		player2[1] = 150; // mana
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

		int magic = player1[1];

		System.out.println("You have " + player1[1] + " left to cast magic with");
		System.out.println("you can use the following spells with you magic: ");
		magic(input, magic);
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
		//spell(magic);
		spellcast(input);

		if (magic >= magic) {
			attack();
		}
		if (magic < magic) {
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

	public static void spellcast(Scanner input) {
		String cast = input.next();
		if (cast == "fireball") {
			magic = 100;
			damage = 250;
		}
		if (cast == "metor") {
			magic = 50;
			damage = 100;
		}
		if (cast == "lighting") {
			magic = 25;
			damage = 75;
		}
		if (cast == "Ray Beam") {
			magic = 80;
			damage = 100;
		}
		if (cast == "Darkness Flow") {
			magic = 30;
			damage = 50;
		}
		if (cast == "heal") {
			magic = 0;
			damage = -100;
		}
		if (cast == "Minion  Stepper") {
			magic = 30;
			damage = 50;
		}
		if (cast == "Cursed Chaos") {
			magic = 80;
			damage = 100;
		}
		if (cast == "Swift Attack") {
			magic = 0;
			damage = 20;
		}
		if (cast == "Hungry Muncher") {
			magic = 50;
			damage = 65;
		}
		if (cast == "Heavy Metal") {
			magic = 60;
			damage = 85;
		}
		if (cast == "Acid Poison") {
			magic = 55;
			damage = 75;
		}
		if (cast == "Heavy Impact") {
			magic = 20;
			damage = 45;
		}
		if (cast == "Icy Waves") {
			magic = 75;
			damage = 100;
		}
		if (cast == "Earthquake") {
			magic = 60;
			damage = 85;
		}
		if (cast == "Bullseye") {
			magic = 70;
			damage = 100;
		}
		if (cast == "Explosive Punch") {
			magic = 55;
			damage = 75;
		}
		if (cast == "Tornado") {
			magic = 65;
			damage = 45;
		}
		if (cast == "Hyper Kick") {
			magic = 30;
			damage = 55;
		}
		if (cast == "Scary Whisper") {
			magic = 35;
			damage = 60;
		}
		if (cast == "Stone Breaker") {
			magic = 65;
			damage = 95;
		}

		if (cast == "exit") {
			System.exit(0);
		}

	}

	public static void spell(int magic) {
		if (magic == 50) {
			System.out.print("Fireball");
			System.out.print("metor");
			System.out.print("lighting");
			System.out.print("");
			System.out.print("");
			System.out.print("heal");
		}

	}

	public static void attack() {
		if (player == false) { // player1 is attacking
			player1[1] = -magic;
			player2[0] = -damage;
			damage = 0;
		}
		if (player == true) { // player2 is attacking
			player2[1] = -magic;
			player1[0] = -damage;
			damage = 0;
		}
	}

}
