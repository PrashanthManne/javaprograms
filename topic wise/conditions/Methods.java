package learnif;
import java.util.Scanner;


public class Methods {
	Scanner s = new Scanner (System.in);
	void square ()
	{
		System.out.println("enter the vaules of the side ");
		int side = s.nextInt();
		
		System.out.println("the area of the square " +(side *side ));
		System.out.println("the perimeter of the square " +(4 *side ));
	}
	void rect ()
	{
		System.out.println("enter the vaules of the length and breadth ");
		int len = s.nextInt();
		int bre = s.nextInt();
		
		System.out.println("the area of the rectangle " +(len * bre ));
		System.out.println("the perimeter of the rectangle " +(2*(len+bre)));
	}
	void rhombus ()
	{
		System.out.println("enter the vaules of the diagonals d1 and d2 ");
		int d1 = s.nextInt();
		int d2 = s.nextInt();
		System.out.println("enter the vaules of the side ");
		int side = s.nextInt();
		System.out.println("the area of the square " +(d1 *d2 ));
		System.out.println("the perimeter of the square " +(4 *side ));
	}
	void triangle (int a , int b , int c)
	{
		System.out.println("enter the vaules of the base and height  ");
		int base = s.nextInt();
		int height = s.nextInt();
		System.out.println("the area of the triangle  " +((0.5)*(base*height)));
		System.out.println("the perimeter of the triangle  " +(a+b+c ));
	}
	void cube ()
	{
		System.out.println("enter the vaules of the side ");
		int side = s.nextInt();
		
		System.out.println("the volume of the CUBE  " +(side*side *side ));
		System.out.println("the l S A  of the CUBE " +(4 *side*side ));
		System.out.println("the l S A  of the CUBE " +(6 *side*side ));
	}
	void cubiod  ()
	{
		System.out.println("enter the vaules of the CUBOID ");
		int len = s.nextInt();
		int bre = s.nextInt();
		int he = s.nextInt();
		
		System.out.println("the volume  of the cuboid  " +(len *bre*he ));
		System.out.println("the l S A  of the CUBE " +(2*((len*bre)+(bre*he))));
		System.out.println("the T S A  of the CUBE " +((2*((len*bre)+(bre*he)+(len*he)))));

	}
	void cylinder ()
	{
		System.out.println("enter the vaules of the height and radius  ");
		double  rad = s.nextDouble();
		double  he = s.nextDouble();
		double pi = 3.14;
		System.out.println("the volume of the CUBE  " +(pi*rad *rad*he ));
		System.out.println("the l S A  of the CUBE " +(2*pi*rad*he ));
		System.out.println("the t S A  of the CUBE " +(2*pi*rad*(he+rad)));	
		}
	void sphere  ()
	{
		System.out.println("enter the vaules of the sphere i. e rad");
		int rad = s.nextInt();
		double pi = 3.14;
		System.out.println("the volume  of the sphere  " +(4/3*pi * rad*rad*rad ));
		System.out.println("the tsa  of the square " +(4 *pi*rad*rad ));
	}
	void cone  ()
	{
		System.out.println("enter the vaules of vone i.e slantheight ,height , rad ");
		double  sl = s.nextInt();
		double  rad = s.nextInt();
		double  he = s.nextInt();
		double  pi = 3.14;
		System.out.println("the volume  of the cone is  " +(1/3*pi *rad*rad*he));
		System.out.println("the lsa of the cone  " +(pi*rad*sl ));
	}
	void bigger()
	{System.out.println("the object should be in the circular shape");
	
		double r1=s.nextDouble();
		double r2 =6371 ;// earth radius 
		
		if (r1>r2)//r1 must be bigger than r2
		{
			double size =((r1*r1*r1)/(r2*r2*r2));
			System.out.println("the object r1 times bigger than the   objects    "+size);
		}
		else if(r2>r1)
		{
			double size =((r2*r2*r2)/(r1*r1*r1));
			System.out.println("the oject is smaller than the radius of r1  " + size);
		}
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods m = new Methods ();
		

	m.bigger();
		
		
	
		
		
		
		
		
		
		
		
	}

}
