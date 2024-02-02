package smartphonebz;
import java.util.InputMismatchException;
import java.util.Scanner;
public class broucher extends android{
	public void brouchers()
	{
		System.out.println("__________________________________________");
		System.out.println("       Main Menu: Operating Systems       ");
		System.out.println("__________________________________________");
	System.out.println("             ");
	System.out.print("1.  Android");
	System.out.print("   2. iOS");
	System.out.println("   3. Logout");
	//System.out.println("   3. Customization");
	System.out.println("             ");
	try {
	System.out.print("  Enter Choice: ");
	System.out.println("             ");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();

	switch(choice)
	{
	    case 1:
	        Android();
	        String un=sc.nextLine();
	        break;
	    case 2:
	    	ios i=new ios();
	    	i.iOS();
	        break;

	    case 3:
	    	access a=new access();
	    	a.L1();
	        break;

	    default:
	        System.out.println("Invalid choice");
	        brouchers();
	        break;
	} 
	
	}
	catch(InputMismatchException ie)
	{
		System.out.println("             ");
		System.out.println("Invalid entry! Please try again");
		brouchers();
	}
}
}
