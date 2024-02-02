package smartphonebz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class android extends smartphone{
	private String Androidversion;
	   private String Headphonejack;


	   public String getAndroidversion()
	    {
	        return Androidversion;
	    }

	    public void setAndroidversion(String Androidversion)
	    {
	        this.Androidversion = Androidversion;
	    }

	    /*-----------------------------------------------------------------------------*/
	    public String getHeadphonejack()
	    {
	        return Headphonejack;
	    }

	    public void setHeadphonejack(String Headphonejack)
	    {
	        this.Headphonejack = Headphonejack;
	    }

	    /*----------------------------------------------------------------------------*/

public void Android()
{
	
	broucher b=new broucher();
	//android a=new featurephones();---------> upcasting
	//featurephones f = (featurephones)a;----> Downcasting
	
	
	System.out.println("__________________________________________");
	System.out.println("             Android Devices              ");
	System.out.println("__________________________________________");
	System.out.println("             ");
	System.out.print("1. Feature-phone");
	System.out.print("   2. Touchscreen");
	System.out.print("   3. Back");
	System.out.println("   4. Main menu");
	//System.out.println("5. Search");
	try {
	System.out.print(" Enter Choice: ");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	switch(choice)
	{
	    case 1:
	    	featurephones ref1=new featurephones();
	        ref1.fp();
	    	//f.fp();-----> printing after downcasting
	        String un=sc.nextLine();
	        break;
	    case 2:
	        touchscreen ref2 =new touchscreen();
	        ref2.Touchscreen();
	        break;

	    case 3:
	       
	       b.brouchers();
	        break;

	    default:
	        System.out.println("Invalid choice! Please select again");
	       // b.brouchers();
	        Android();
	        break;
	} 
	}
	catch(InputMismatchException ie)
	{
		System.out.println("             ");
		System.out.println("Invalid entry! Please try again");
		 Android();
}





}
}
