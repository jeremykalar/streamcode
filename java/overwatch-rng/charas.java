import java.util.Random;
import java.util.Scanner;

public class charas {
	static Random rand = new Random();
	static Scanner scan = new Scanner(System.in);

	public static void overwatch(String role)  {
		
		char t = 't';
		char d = 'd';
		char s = 's';
		String input = "test";
		int number = rand.nextInt(8);
		String output = "test";
		output = output + number;
		if(role == "tanks") {
			input = t + output;
		} else if(role == "dps")
		{
			input = d + output;
		}
		else if(role == "support")
		{
			input = s + output;
		}
		System.out.println(input);
		System.out.println(number);
		//tanks
		String t1 = "d.va";
		String t2 = "orisa";	
		String t3 = "reinheart";
		String t4 = "Roadhog";
		String t5 = "Sigma";
		String t6 = "windston";
		String t7 = "Wreking ball";
		String t8 = "zarya";
		
		//dps
		String d1 = "Ashe";
		String d2 = "Bastion";
		String d3 = "Cassidy";
		String d4 = "Echo";
		String d5 = "Doomfist";
		String d6 = "Genji";
		String d7 = "Hanzo";
		String d8 = "Junkrat";
		String d9 = "Mei";
		String d10 = "Pharah";
		String d11 = "Reaper";
		String d12 = "Soldier: 76";
		String d13 = "Sombra";
		String d14 = "Symmetra";
		String d15 = "Torbjörn";
		String d16 = "Tracer";
		String d17 = "Widowmaker";

	//support
		String s1 = "Ana";
		String s2 = "Baptiste";
		String s3 = "Brigitte";
		String s4 = "Lúcio";
		String s5 = "Mercy";
		String s6 = "Moira";
		String s7 = "Zenyatta";
	}
	
	
	

	public static void main(String[] args) {
		System.out.print("Enter the role you would like to receive a hero for? ");
		String role = scan.nextLine(); 
		System.out.println("Here is what you entered: " + role); 
		System.out.println();
		overwatch(role);
	}

}
