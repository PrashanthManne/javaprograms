package learnif;

public class stringequal {

	public static void main(String[] args) {
		int otp = 1234;
		String uname = "cricket";
		String pswd = "cri@123";
		String fname = "virat";
		if (uname.equals("cricket") && pswd.equals("cri@123"))
		{
			System.out.println("login sucessful ");
		} 
		else {
				System.out.println("your entered  the incorrect  password ");
				
				if(fname.equals("virat") || otp==1234)
				{
					System.out.println("uname =" +uname +"  " + "pswd " +pswd);

				}
			}
	}
}
	