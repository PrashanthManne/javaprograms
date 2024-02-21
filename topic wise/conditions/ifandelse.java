package learnif;

public class ifandelse {

	public static void main(String[] args) {
		int marks = 85;
		if (marks < 35) {
			System.out.println("he faied in exam");
		}
		else if (marks >= 35 && marks <= 50) {
			System.out.println("he passsed with grade c");

		}
		else if (marks > 50 && marks <= 70) {
			System.out.println("he is passed with grade b");
		}
		else if (marks > 70 && marks < 90) {
			System.out.println("he is passed with grade a");
		}
		else  {
			System.out.println("he is passed with distinction");
		}

	}
}
