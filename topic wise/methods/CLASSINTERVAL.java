package learnif;

public class CLASSINTERVAL {

	public static void main(String[] args) {
		CLASSDECLARATION c = new CLASSDECLARATION();
		c.sid=5615;		
		c.sname ="john"  ;
		c.sgender= "male";
		c.std = 9 ;
		c.sec = "a";
		c.school = "sri raja rajeshwari high school ";
		System.out.println("the student sid number is  " + c.sid);
		System.out.println("the student name = " + c.sname);
		System.out.println("the student gender is   " + c.sgender);
		System.out.println("the student standard is   " + c.std);
		System.out.println("the student section  is  " + c.sec);
		System.out.println("the class c address is   " + c);
		System.out.println("the school name is    " + c.school);
		System.out.println("_____________ end _________________");
		
		
		CLASSDECLARATION c1 = new CLASSDECLARATION();
		c1.sid=1234;
		c1.sname ="john"  ;
		c1.sgender= "male";
		c1.std = 9 ;
		c1.sec = "a";
		System.out.println("the student sid number is   " + c.sid);
		System.out.println("the student name =   " + c1.sname);
		System.out.println("the student gender is   " + c1.sgender);
		System.out.println("the student standard is   " + c1.std);
		System.out.println("the student section  is   " + c1.sec);
		System.out.println("the class c address is   " + c1);
		System.out.println("_____________ end _________________");
		CLASSDECLARATION c2 = new CLASSDECLARATION();
		c2.sid=1111;
		c2.sname ="happy birthday"  ;
		c2.sgender= "male";
		c2.std = 32 ;
		c2.sec = "party";
		System.out.println("the student sid number is   " + c2.sid);
		System.out.println("the student name =   " + c2.sname);
		System.out.println("the student gender is   " + c2.sgender);
		System.out.println("the student standard is   " + c2.std);
		System.out.println("the student section  is   " + c2.sec);
		System.out.println("the class c address is   " + c2);
		System.out.println("_____________ end _________________");

	}

}
