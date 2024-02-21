package learnif;

public class arraysclass {

	public static void main(String[] args) {
		/*
		 * String [] names = {"prashanth","ramesh","lucky ","raju ","aravind "}; for
		 * (int i = 0;i<=names.length-1;i++) { System.out.println(names[i]); }
		 */
		int[] marks = { 56, 58, 33, 28, 56, 97 };
		double sum = 0;
		for (int j = 0; j <= marks.length - 1; j++) {
			System.out.println(marks[j]);
			if (marks[j]>35)
			{
				System.out.println(j+"  he is passed  with " + marks[j] + ";  got " + (marks[j] - 35) + " more than the pass marks");
			}
			else 
			{
				System.out.println(j+"  he is failed with " + marks[j] + ";  got " +(35 - marks[j]) + "  less than the  pass marks" );
			}
			sum = sum + marks[j];
		}
		System.out.println("total sum " + sum);
		double per = sum / marks.length;
		System.out.println("total percentage  is " + per);
		
		
		}

	}


