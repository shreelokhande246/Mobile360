package smartphonebz;

import java.util.Scanner;
//interface account
//{
//	abstract public void Login();
//}

public class access{
	
	
	public void L1()
	{
		System.out.println("__________________________________________");
		System.out.println("               Login Page                ");
		System.out.println("__________________________________________");
		Login();
	}
	public void Login() 
	{  		
		  System.out.println("      ");
	   Scanner ref1=new Scanner(System.in);
	   System.out.print("Enter username: ");
	   String un=ref1.nextLine();
	  
	   System.out.println("      ");
	   Scanner ref2=new Scanner(System.in);
	   System.out.print("Enter password: ");
	   String pw=ref2.nextLine();
	   
	   if(un.equals("Shree89") && pw.equals("shree1234"))
	   {
		   System.out.println("      ");
		   System.out.println("Login Successful...!");
	   }
	   else
	   {
		   System.out.println("      ");
		   System.out.println("Invalid Credentials");
		   System.out.println("  ");   
		   
		   Login();
	   }
	  
	}
}

//IgnoreCase