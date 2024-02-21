package learnif;

public class CLASSDECLARATION {

int sid;
String sname ;
String sgender;
int std ;
String sec;
String school;
public static void main (String[] args) {
CLASSDECLARATION c = new CLASSDECLARATION();
c.sid = 101;
c.sname = "Prashanth";
c.sgender = "male";
c.std = 8;
c.sec = "A";
c.school = "kkts";
System.out.println("the id number of the student " + c.sid);
System.out.println("the name  of the student " + c.sname);
System.out.println("the gender of the the student " + c.sgender);
System.out.println("the class  of the student " + c.std);
System.out.println("the school name of the student " + c.school);
System.out.println("the section of the student " + c.sec);
System.out.println("the address  of the student " + c);
}
}

