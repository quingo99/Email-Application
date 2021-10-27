
public class register {
	private String firstName;
	private String lastName;
	private String department;
	private String Password;
	
	public register() {
		firstName = "Error";
		lastName = "Error";
	}
	public void setFirstName(String f)
	{
		this.firstName = f;
	}
	public void setLastName(String l)
	{
		this.lastName = l;
	}
	public void setPassword(String p)
	{
		this.Password = p;
	}
	public void setDepartment(int d)
	{
		switch(d)
		{
			case 0:
				this.department = ".";
				break;
			case 1:
				this.department = "sale.";
				break;
			case 2:
				this.department = "development.";
				break;
			case 3:
				this.department ="finance.";
				break;
			default: 
				break;
		}
	}
	public String getFirstname() 
	{
		return this.firstName;
	}
	public String getLastname() 
	{
		return this.lastName;
	}
	public String getDepartment()
	{
		return this.department;
	}
	public String getPassword()
	{
		return this.Password;
	}
}
