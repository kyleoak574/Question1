package Quizq;
import java.util.Scanner;
	public class PlayerStats {
		Scanner scan= new Scanner(System.in);
		String name;
		int singles, atbats, hits, doubles, triples, homeruns, runs, walks;
	
		public PlayerStats() {
			System.out.print("Enter player's name: ");
			name = scan.nextLine();
			System.out.print("Enter player's at bats: ");
			atbats = scan.nextInt();
			System.out.print("Enter player's hits: ");
			hits = scan.nextInt();
			System.out.print("Enter player's doubles: ");
			doubles = scan.nextInt();
			System.out.print("Enter player's triples: ");
			triples = scan.nextInt();
			System.out.print("Enter player's home runs: ");
			homeruns = scan.nextInt();
			System.out.print("Enter player's runs: ");
			runs = scan.nextInt();
			System.out.print("Enter player's walks: ");
			walks = scan.nextInt();
			singles = hits-doubles-triples-homeruns;
			System.out.print("The batting average is: " + batavg());
		}
		public double batavg()
		{	
			return hits/atbats;
		}
		public double onbasepercentage()
		{
			return (hits+walks)/(atbats+walks);
		}
		public double sluggingpercentage()
		{
			return (singles+(2*doubles)+(3*triples)+(4*homeruns))/atbats;
		}
		public double onBasePlusSlugging()
		{
			return (hits+walks)/(atbats+walks)+((singles+(2*doubles)+(3*triples)+(4*homeruns))/atbats);
		}
		public double totalbases()
		{
			return (singles)+(2*doubles)+(3*triples)+(4*homeruns);
		}

	}
