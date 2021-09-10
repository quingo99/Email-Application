import java.util.Scanner;
import java.util.ArrayList;

public class main {
	static register e = new register();
	static Scanner scnr = new Scanner(System.in);
	static int NUM = 0;
	static ArrayList<infor> userList = new ArrayList<infor>();

	public static void main(String[] args)
	{
		
		int x;
		
		try {
			do {
				
					System.out.println("1. Register ");
					System.out.println("2. Sign in ");
					System.out.println("0. Exit ");
					x = scnr.nextInt();
					if(x < 0 || x > 2)
						throw new Exception("Choose wrong");
					else if( x == 1) {
						setRegister();
						getInfor();
						print();
					}
					else if(x==2)
						Signin();
					
			}while(x != 0);
		}
		catch(Exception e)
		{
			System.out.println("!!!!!!!! Error!!!!!!!!  \n" + e.getMessage() );
		}
		
	}
	public static void setRegister()
	{
		String f, l, p;
		int x;
		System.out.println("Enter your first name: ");
		f = scnr.next();
		e.setFirstName(f);
		
		System.out.println("Enter yout last name: ");
		l = scnr.next();
		e.setLastName(l);
		
		System.out.println("Enter your password: ");
		p = scnr.next();
		e.setPassword(p);
		
		try {
			System.out.println("Department code: \n\n");
			System.out.println("1. Sale ");
			System.out.println("2. Development ");
			System.out.println("3. Financial ");
			System.out.println("0. Private ");
			System.out.println("Enter code: ");
			x = scnr.nextInt();
			e.setDepartment(x);
		}
		catch(Exception ex)
		{
			System.out.println("Error: " + ex);
		}
		
	}
	
	public static void getInfor()
	{
		
		infor user = new infor(e);
		user.printInfor();
		userList.add(user);
	}
	public static void print()
	{
		for(int i = 0; i < userList.size(); i++)
		{
			userList.get(i).printInfor();
		}
	}
	
	public static void Signin()
	{
		String username;
		String passWord;
		Boolean check = false;
		System.out.print("Enter User Name: ");
		username = scnr.next();
		System.out.print("Enter Password");
		passWord = scnr.next();
		for(int i = 0; i < userList.size(); i++)
		{
			
			if(username.equals(userList.get(i).username) && passWord.equals(userList.get(i).password)) {
				System.out.println("Sign in successful");
				check = true;
			}
			
		}
		if(!check)
			System.out.println("Username or Password is incorrect");

		
		
	}
	
	

}
