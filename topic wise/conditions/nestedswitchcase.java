package learnif;

public class nestedswitchcase {

	public static void main(String[] args) {
		String country = "aus";
		String name = "fielder";
		switch (country) {
		case "india":
			System.out.println("your are selected india");
			switch (name) {
			case "cri":
				System.out.println("virat kohli " + name);
				break;
			case "football":
				System.out.println("chatri  " + name);
				break;
			case "wwe":
				System.out.println("khali " + name);
				break;
			case "tenni":
				System.out.println("saniya " + name);
				break;
			case "chess":
				System.out.println("pragnandha  " + name);
				break;
			default:
				System.out.println("your are selected the different field");
			}
			break;
		case "aus":
			System.out.println("your are selected australia");
			switch (name) {
			case "batter":
				System.out.println("smith");
				break;
			case "bowler":
				System.out.println("stark");
				break;
			case "keeper":
				System.out.println("pane");
				break;
			case "alrounder":
				System.out.println("maxwell");
				break;
			case "opener":
				System.out.println("warner");
				break;
			default:
				System.out.println("your are selected the different field");
			}
			break;

		default:
			System.out.println("you are select the wrong country");

		}

	}
}