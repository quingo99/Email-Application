
public class infor {
	String password;
	String username;
	
	public infor(register u)
	{
		this.username = u.getFirstname() + u.getLastname()+"@" + u.getDepartment()+"weber.edu";
		this.password = u.getPassword();
	}
	
	public void printInfor()
	{
		System.out.println("Your email is: " + this.username);
		
	}
	
}
