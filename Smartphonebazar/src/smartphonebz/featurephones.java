package smartphonebz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class featurephones extends android{
	private String Physicalkeyboardtype;

    public String Physicalkeyboardtype()
    {
        return Physicalkeyboardtype;
    }

    public void Physicalkeyboardtype(String Physicalkeyboardtype)
    {
        this.Physicalkeyboardtype = Physicalkeyboardtype;
    }

    /*-----------------------------------------------------------------------------*/

    featurephones(String Brand, String Price, String Modelno, String Colour, String RAM, String Storage)
    {
        this.setBrand(Brand);
        this.setPrice(Price);
        this.setModelno(Modelno);
        this.setColour(Colour);
        this.setRAM(RAM);
        this.setStorage(Storage);
    }
    featurephones()
    {}
    
    
    public void N1()
    {
    	System.out.println("__________________________________________");
		System.out.println("              Nokia Devices               ");
		System.out.println("__________________________________________");
		System.out.println("             ");
			System.out.println("1.Nokia 110 DS");
			System.out.println("2.Nokia 105 KP");
			System.out.println("3.Nokia Flip 2660");
			System.out.println("4.Nokia 5130 DS");
			System.out.println("5.Nokia 150");
			System.out.println("6.Nokia 125 TA-1253 DS");
			System.out.println("7.Nokia 3310");
			System.out.println("8.Back");
			System.out.println("9.Main Menu");
			try
			{
			System.out.println("Enter Choice: ");

			Scanner sc1 = new Scanner(System.in);
			int choice1 = sc1.nextInt();
			switch(choice1) 
			{

					case 1:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
						System.out.println("--------------------------------");
				    	featurephones ref2 = new featurephones("Nokia", "Rs 1599.0/-", "110 DS", "Rose Gold", "0.04GB","2GB");
				        System.out.println("Brand: " +ref2.getBrand());
				        System.out.println("Price: "+ref2.getPrice());
				        System.out.println("Modelno: "+ref2.getModelno());
				        System.out.println("Colour: "+ref2.getColour());
				        System.out.println("RAM: "+ref2.getRAM());
				        System.out.println("Storage: "+ref2.getStorage());
				        break;
				        
				        
				        
					case 2:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
						System.out.println("--------------------------------");
				        featurephones ref3 = new featurephones("Nokia", "Rs 1299.0/-", "105 KP", "Black", "0.02GB","2GB");
				        System.out.println("                        ");
				        System.out.println("Brand: " +ref3.getBrand());
				        System.out.println("Price: "+ref3.getPrice());
				        System.out.println("Modelno: "+ref3.getModelno());
				        System.out.println("Colour: "+ref3.getColour());
				        System.out.println("RAM: "+ref3.getRAM());
				        System.out.println("Storage: "+ref3.getStorage());
				        break;
				
				
					case 3:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
						System.out.println("--------------------------------");
				        featurephones ref4 = new featurephones("Nokia Flip", "Rs 4449.0/-", "2660", "Red", "1.5GB","4GB");
				        System.out.println("                        ");
				        System.out.println("Brand: " +ref4.getBrand());
				        System.out.println("Price: "+ref4.getPrice());
				        System.out.println("Modelno: "+ref4.getModelno());
				        System.out.println("Colour: "+ref4.getColour());
				        System.out.println("RAM: "+ref4.getRAM());
				        System.out.println("Storage: "+ref4.getStorage());
				        break;
				        
				        
				
				
					case 4:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
						System.out.println("--------------------------------");
				        featurephones ref5 = new featurephones("Nokia", "Rs 3499.0/-", "5310 DS", "White/Red", "1GB","4GB");
				        System.out.println("                        ");
				        System.out.println("Brand: " +ref5.getBrand());
				        System.out.println("Price: "+ref5.getPrice());
				        System.out.println("Modelno: "+ref5.getModelno());
				        System.out.println("Colour: "+ref5.getColour());
				        System.out.println("RAM: "+ref5.getRAM());
				        System.out.println("Storage: "+ref5.getStorage());
				        break;
				
				
				
					case 5:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
						System.out.println("--------------------------------");
				        featurephones ref6 = new featurephones("Nokia", "Rs 2549.0/-", "150", "Black", "1GB","4GB");
				        System.out.println("                        ");
				        System.out.println("Brand: " +ref6.getBrand());
				        System.out.println("Price: "+ref6.getPrice());
				        System.out.println("Modelno: "+ref6.getModelno());
				        System.out.println("Colour: "+ref6.getColour());
				        System.out.println("RAM: "+ref6.getRAM());
				        System.out.println("Storage: "+ref6.getStorage());
				        break;
				
				
				
					case 6:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
						System.out.println("--------------------------------");
				        featurephones ref7 = new featurephones("Nokia", "Rs 2199.0/-", "125 TA-1253 DS", "Black", "0.04GB","2GB");
				        System.out.println("                        ");
				        System.out.println("Brand: " +ref7.getBrand());
				        System.out.println("Price: "+ref7.getPrice());
				        System.out.println("Modelno: "+ref7.getModelno());
				        System.out.println("Colour: "+ref7.getColour());
				        System.out.println("RAM: "+ref7.getRAM());
				        System.out.println("Storage: "+ref7.getStorage());
				        break;
				
				
				
					case 7:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
						System.out.println("--------------------------------");
				        featurephones ref8 = new featurephones("Nokia", "Rs 3799.0/-", "3310", "Blue", "0.04GB","2GB");
				        System.out.println("                        ");
				        System.out.println("Brand: " +ref8.getBrand());
				        System.out.println("Price: "+ref8.getPrice());
				        System.out.println("Modelno: "+ref8.getModelno());
				        System.out.println("Colour: "+ref8.getColour());
				        System.out.println("RAM: "+ref8.getRAM());
				        System.out.println("Storage: "+ref8.getStorage());
				        break;
				        
				        
					case 8:
					case 9:
					
						broucher b1=new broucher();
						b1.brouchers();
						break;
				       

				        

}
			   
		
			
			 while (true) {
		            System.out.println("                           ");
		            System.out.println("Thankyou for viewing the product!");
		            System.out.println("                           ");
		            System.out.println("Would you like to explore more products?");
		            System.out.println("                           ");
		            System.out.print("1. Back");
		            System.out.print("    2.Main Menu");
		            System.out.println("    3.Exit");
		            System.out.println("                           ");
		            
		            try {
		            Scanner sc96 = new Scanner(System.in);
		            System.out.println("Enter Choice: ");
		            
		            int choice96 = sc96.nextInt();
		            
		            if (choice96 == 1) 
		            {
		            	fp();
		                break; 
		            } 
		            else if (choice96 == 2) 
		            {
		               
		            	broucher b1=new broucher();
						b1.brouchers();
		              
		                break; 
		            } 
		            else if(choice96 == 3) 
		            {
		            	access a=new access();
		            	a.L1();
		            		broucher b = new broucher();
		            		b.brouchers(); 
		               break;
		            }
		            else {
		            	System.out.println("Invalid choice. Please enter between 1 to 3");
		            	N1();
		            	break;
		            }
		            }
		            catch(InputMismatchException ie)
		            {
		            	System.out.println("Invalid Entry. Please try again!");
		            	N1();
		            	
		            }
		        }
			}
			catch(InputMismatchException ie)
			{
				System.out.println("             ");
				System.out.println("Invalid entry! Please try again");
				N1();
			}
    }
    
    public void J1()
    {
    	System.out.println("__________________________________________");
		System.out.println("               Jio Devices                ");
		System.out.println("__________________________________________");
		System.out.println("             ");
		System.out.println("1.Jio 11 DS");
		System.out.println("2.Jio 12 KP");
		System.out.println("3.Jio 13 2660");
		System.out.println("4.Jio 14 DS");
		System.out.println("5.Jio 15");
		System.out.println("6.Jio 16");
		System.out.println("7.Jio 17");
		System.out.println("8.Back");
		System.out.println("9.Main Menu");
		try {
		System.out.println("Enter Choice: ");

		Scanner sc3 = new Scanner(System.in);
		int choice3 = sc3.nextInt();
		switch(choice3)
		
		
		{
		
					case 1:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
			        featurephones ref9 = new featurephones("Jio", "Rs 3249.0/-", "11", "Blue", "15MB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref9.getBrand());
			        System.out.println("Price: "+ref9.getPrice());
			        System.out.println("Modelno: "+ref9.getModelno());
			        System.out.println("Colour: "+ref9.getColour());
			        System.out.println("RAM: "+ref9.getRAM());
			        System.out.println("Storage: "+ref9.getStorage());
			        break;
			        
			        
					case 2:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
						
			        featurephones ref10 = new featurephones("Jio", "Rs 3799.0/-", "12", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref10.getBrand());
			        System.out.println("Price: "+ref10.getPrice());
			        System.out.println("Modelno: "+ref10.getModelno());
			        System.out.println("Colour: "+ref10.getColour());
			        System.out.println("RAM: "+ref10.getRAM());
			        System.out.println("Storage: "+ref10.getStorage());
			        break;
			        
			        
					case 3:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref11 = new featurephones("Jio", "Rs 3799.0/-", "13", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref11.getBrand());
			        System.out.println("Price: "+ref11.getPrice());
			        System.out.println("Modelno: "+ref11.getModelno());
			        System.out.println("Colour: "+ref11.getColour());
			        System.out.println("RAM: "+ref11.getRAM());
			        System.out.println("Storage: "+ref11.getStorage());
			        break;
			        
					case 4:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref12 = new featurephones("Jio", "Rs 3799.0/-", "14", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref12.getBrand());
			        System.out.println("Price: "+ref12.getPrice());
			        System.out.println("Modelno: "+ref12.getModelno());
			        System.out.println("Colour: "+ref12.getColour());
			        System.out.println("RAM: "+ref12.getRAM());
			        System.out.println("Storage: "+ref12.getStorage());
			        break;
			        
					case 5:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref13 = new featurephones("Jio", "Rs 3799.0/-", "15", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref13.getBrand());
			        System.out.println("Price: "+ref13.getPrice());
			        System.out.println("Modelno: "+ref13.getModelno());
			        System.out.println("Colour: "+ref13.getColour());
			        System.out.println("RAM: "+ref13.getRAM());
			        System.out.println("Storage: "+ref13.getStorage());
			        break;
			        
					case 6:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref14 = new featurephones("Jio", "Rs 3799.0/-", "16", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref14.getBrand());
			        System.out.println("Price: "+ref14.getPrice());
			        System.out.println("Modelno: "+ref14.getModelno());
			        System.out.println("Colour: "+ref14.getColour());
			        System.out.println("RAM: "+ref14.getRAM());
			        System.out.println("Storage: "+ref14.getStorage());
			        break;
			        
					case 7:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref15 = new featurephones("Jio", "Rs 3799.0/-", "17", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref15.getBrand());
			        System.out.println("Price: "+ref15.getPrice());
			        System.out.println("Modelno: "+ref15.getModelno());
			        System.out.println("Colour: "+ref15.getColour());
			        System.out.println("RAM: "+ref15.getRAM());
			        System.out.println("Storage: "+ref15.getStorage());
			        break;
					case 8:break;
					case 9:
					
						broucher b1=new broucher();
						b1.brouchers();
						break;
	}
		Scanner sc12 = new Scanner(System.in);
    
    while (true) {
        System.out.println("                           ");
        System.out.println("What would you like to do?");
        System.out.print("1. Go back to Main Menu");
        System.out.println("     2. Place the order "); 
        System.out.println("Enter Choice: ");
        
        int choice12= sc12.nextInt();
        
        if (choice12 == 1) {
            Android();
            break; 
        } else if (choice12 == 2) {
            System.out.println("Your order has been placed.");
           // System.out.println("Go back to main menu");
            
          
            break; 
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
		}
		catch(InputMismatchException ie)
		{
			System.out.println("             ");
			System.out.println("Invalid entry! Please try again");
			J1();
		}
		
    }
public void M1()
{
	System.out.println("__________________________________________");
	System.out.println("            Motorola Devices              ");
	System.out.println("__________________________________________");
	System.out.println("             ");
	System.out.println("1.Moto 11 DS");
	System.out.println("2.Moto 12 KP");
	System.out.println("3.Moto 13 2660");
	System.out.println("4.Moto 14 DS");
	System.out.println("5.Moto 15");
	System.out.println("6.Moto 16");
	System.out.println("7.Moto 17");
	System.out.println("8.Back");
	System.out.println("9.Main Menu");
	try {
	System.out.println("Enter Choice: ");

	Scanner sc4 = new Scanner(System.in);
	int choice4 = sc4.nextInt();
	switch(choice4)
	{
			case 1:
				
				System.out.println("____________________________________________________");
				System.out.println("                       ");
		        featurephones ref9 = new featurephones("Moto", "Rs 3249.0/-", "11", "Blue", "15MB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref9.getBrand());
		        System.out.println("Price: "+ref9.getPrice());
		        System.out.println("Modelno: "+ref9.getModelno());
		        System.out.println("Colour: "+ref9.getColour());
		        System.out.println("RAM: "+ref9.getRAM());
		        System.out.println("Storage: "+ref9.getStorage());
		        break;
		        
		        
				case 2:
		
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref10 = new featurephones("Moto", "Rs 3799.0/-", "12", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref10.getBrand());
		        System.out.println("Price: "+ref10.getPrice());
		        System.out.println("Modelno: "+ref10.getModelno());
		        System.out.println("Colour: "+ref10.getColour());
		        System.out.println("RAM: "+ref10.getRAM());
		        System.out.println("Storage: "+ref10.getStorage());
		        break;
		        
		        
				case 3:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref11 = new featurephones("Moto", "Rs 3799.0/-", "13", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref11.getBrand());
		        System.out.println("Price: "+ref11.getPrice());
		        System.out.println("Modelno: "+ref11.getModelno());
		        System.out.println("Colour: "+ref11.getColour());
		        System.out.println("RAM: "+ref11.getRAM());
		        System.out.println("Storage: "+ref11.getStorage());
		        break;
		        
				case 4:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref12 = new featurephones("Moto", "Rs 3799.0/-", "14", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref12.getBrand());
		        System.out.println("Price: "+ref12.getPrice());
		        System.out.println("Modelno: "+ref12.getModelno());
		        System.out.println("Colour: "+ref12.getColour());
		        System.out.println("RAM: "+ref12.getRAM());
		        System.out.println("Storage: "+ref12.getStorage());
		        break;
		        
				case 5:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref13 = new featurephones("Moto", "Rs 3799.0/-", "15", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref13.getBrand());
		        System.out.println("Price: "+ref13.getPrice());
		        System.out.println("Modelno: "+ref13.getModelno());
		        System.out.println("Colour: "+ref13.getColour());
		        System.out.println("RAM: "+ref13.getRAM());
		        System.out.println("Storage: "+ref13.getStorage());
		        break;
		        
				case 6:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref14 = new featurephones("Moto", "Rs 3799.0/-", "16", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref14.getBrand());
		        System.out.println("Price: "+ref14.getPrice());
		        System.out.println("Modelno: "+ref14.getModelno());
		        System.out.println("Colour: "+ref14.getColour());
		        System.out.println("RAM: "+ref14.getRAM());
		        System.out.println("Storage: "+ref14.getStorage());
		        break;
		        
				case 7:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref15 = new featurephones("Moto", "Rs 3799.0/-", "17", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref15.getBrand());
		        System.out.println("Price: "+ref15.getPrice());
		        System.out.println("Modelno: "+ref15.getModelno());
		        System.out.println("Colour: "+ref15.getColour());
		        System.out.println("RAM: "+ref15.getRAM());
		        System.out.println("Storage: "+ref15.getStorage());
		        break;
		        
				case 8:break;
				case 9:
				
					broucher b1=new broucher();
					b1.brouchers();
					break;
	}
	
	Scanner sc13 = new Scanner(System.in);
    
    while (true) {
        System.out.println("                           ");
        System.out.println("What would you like to do?");
        System.out.print("1. Go back to Main Menu");
        System.out.println("     2. Place the order "); 
        System.out.println("Enter Choice: ");
        
        int choice13 = sc13.nextInt();
        
        if (choice13 == 1) {
            Android();
            break; 
        } else if (choice13 == 2) {
            System.out.println("Your order has been placed.");
           // System.out.println("Go back to main menu");
            
          
            break; 
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
	}
	catch(InputMismatchException ie)
	{
		System.out.println("             ");
		System.out.println("Invalid entry! Please try again");
		M1();
	}
}

public void M2()
{
	System.out.println("__________________________________________");
	System.out.println("           Micromax Devices            ");
	System.out.println("__________________________________________");
	System.out.println("             ");
		System.out.println("1.Micromax 11 DS");
		System.out.println("2.Micromax 12 KP");
		System.out.println("3.Micromax 13 2660");
		System.out.println("4.Micromax 14 DS");
		System.out.println("5.Micromax 15");
		System.out.println("6.Micromax 16");
		System.out.println("7.Micromax 17");
		System.out.println("8.Back");
		System.out.println("9.Main Menu");
		try {
		System.out.println("Enter Choice: ");
		Scanner sc5 = new Scanner(System.in);
		int choice5 = sc5.nextInt();
		switch(choice5)
		{
				case 1:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
			        featurephones ref9 = new featurephones("Micromax", "Rs 3249.0/-", "11", "Blue", "15MB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref9.getBrand());
			        System.out.println("Price: "+ref9.getPrice());
			        System.out.println("Modelno: "+ref9.getModelno());
			        System.out.println("Colour: "+ref9.getColour());
			        System.out.println("RAM: "+ref9.getRAM());
			        System.out.println("Storage: "+ref9.getStorage());
			        break;
			        
			        
					case 2:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			
			        featurephones ref10 = new featurephones("Micromax", "Rs 3799.0/-", "12", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref10.getBrand());
			        System.out.println("Price: "+ref10.getPrice());
			        System.out.println("Modelno: "+ref10.getModelno());
			        System.out.println("Colour: "+ref10.getColour());
			        System.out.println("RAM: "+ref10.getRAM());
			        System.out.println("Storage: "+ref10.getStorage());
			        break;
			        
			        
					case 3:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref11 = new featurephones("Micromax", "Rs 3799.0/-", "13", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref11.getBrand());
			        System.out.println("Price: "+ref11.getPrice());
			        System.out.println("Modelno: "+ref11.getModelno());
			        System.out.println("Colour: "+ref11.getColour());
			        System.out.println("RAM: "+ref11.getRAM());
			        System.out.println("Storage: "+ref11.getStorage());
			        break;
			        
					case 4:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref12 = new featurephones("Micromax", "Rs 3799.0/-", "14", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref12.getBrand());
			        System.out.println("Price: "+ref12.getPrice());
			        System.out.println("Modelno: "+ref12.getModelno());
			        System.out.println("Colour: "+ref12.getColour());
			        System.out.println("RAM: "+ref12.getRAM());
			        System.out.println("Storage: "+ref12.getStorage());
			        break;
			        
					case 5:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref13 = new featurephones("Micromax", "Rs 3799.0/-", "15", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref13.getBrand());
			        System.out.println("Price: "+ref13.getPrice());
			        System.out.println("Modelno: "+ref13.getModelno());
			        System.out.println("Colour: "+ref13.getColour());
			        System.out.println("RAM: "+ref13.getRAM());
			        System.out.println("Storage: "+ref13.getStorage());
			        break;
			        
					case 6:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref14 = new featurephones("Micromax", "Rs 3799.0/-", "16", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref14.getBrand());
			        System.out.println("Price: "+ref14.getPrice());
			        System.out.println("Modelno: "+ref14.getModelno());
			        System.out.println("Colour: "+ref14.getColour());
			        System.out.println("RAM: "+ref14.getRAM());
			        System.out.println("Storage: "+ref14.getStorage());
			        break;
			        
					case 7:
						System.out.println("____________________________________________________");
						System.out.println("                       ");
			        featurephones ref15 = new featurephones("Micromax", "Rs 3799.0/-", "17", "Blue", "0.04GB","2GB");
			        System.out.println("                        ");
			        System.out.println("Brand: " +ref15.getBrand());
			        System.out.println("Price: "+ref15.getPrice());
			        System.out.println("Modelno: "+ref15.getModelno());
			        System.out.println("Colour: "+ref15.getColour());
			        System.out.println("RAM: "+ref15.getRAM());
			        System.out.println("Storage: "+ref15.getStorage());
			        break;
					case 8: break;
					case 9:
						broucher b1=new broucher();
						b1.brouchers();
						break;
		}
		
		Scanner sc14 = new Scanner(System.in);
        
        while (true) {
            System.out.println("                           ");
            System.out.println("What would you like to do?");
            System.out.print("1. Go back to Main Menu");
            System.out.println("     2. Place the order "); 
            System.out.println("Enter Choice: ");
            
            int choice14 = sc14.nextInt();
            
            if (choice14 == 1) {
                Android();
                break; 
            } else if (choice14 == 2) {
                System.out.println("Your order has been placed.");
               // System.out.println("Go back to main menu");
                
              
                break; 
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
		}
		catch(InputMismatchException ie)
		{
			System.out.println("             ");
			System.out.println("Invalid entry! Please try again");
			M2();
		}
}

public void Sm()
{
	System.out.println("__________________________________________");
	System.out.println("             Samsung Devices              ");
	System.out.println("__________________________________________");
	System.out.println("             ");
	System.out.println("1.Samsung 11 DS");
	System.out.println("2.Samsung 12 KP");
	System.out.println("3.Samsung 13 2660");
	System.out.println("4.Samsung 14 DS");
	System.out.println("5.Samsung 15");
	System.out.println("6.Samsung 16");
	System.out.println("7.Samsung 17");
	System.out.println("8.Back");
	System.out.println("9.Main Menu");
	try {
	System.out.println("Enter Choice: ");

	Scanner sc6 = new Scanner(System.in);
	int choice6 = sc6.nextInt();
	switch(choice6)
	{
			case 1:
				System.out.println("____________________________________________________");
				System.out.println("                       ");
				
		        featurephones ref9 = new featurephones("Samsung", "Rs 3249.0/-", "11", "Blue", "15MB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref9.getBrand());
		        System.out.println("Price: "+ref9.getPrice());
		        System.out.println("Modelno: "+ref9.getModelno());
		        System.out.println("Colour: "+ref9.getColour());
		        System.out.println("RAM: "+ref9.getRAM());
		        System.out.println("Storage: "+ref9.getStorage());
		        break;
		        
		        
				case 2:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		
		        featurephones ref10 = new featurephones("Samsung", "Rs 3799.0/-", "12", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref10.getBrand());
		        System.out.println("Price: "+ref10.getPrice());
		        System.out.println("Modelno: "+ref10.getModelno());
		        System.out.println("Colour: "+ref10.getColour());
		        System.out.println("RAM: "+ref10.getRAM());
		        System.out.println("Storage: "+ref10.getStorage());
		        break;
		        
		        
				case 3:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref11 = new featurephones("Samsung", "Rs 3799.0/-", "13", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref11.getBrand());
		        System.out.println("Price: "+ref11.getPrice());
		        System.out.println("Modelno: "+ref11.getModelno());
		        System.out.println("Colour: "+ref11.getColour());
		        System.out.println("RAM: "+ref11.getRAM());
		        System.out.println("Storage: "+ref11.getStorage());
		        break;
		        
				case 4:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref12 = new featurephones("Samsung", "Rs 3799.0/-", "14", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref12.getBrand());
		        System.out.println("Price: "+ref12.getPrice());
		        System.out.println("Modelno: "+ref12.getModelno());
		        System.out.println("Colour: "+ref12.getColour());
		        System.out.println("RAM: "+ref12.getRAM());
		        System.out.println("Storage: "+ref12.getStorage());
		        break;
		        
				case 5:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref13 = new featurephones("Samsung", "Rs 3799.0/-", "15", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref13.getBrand());
		        System.out.println("Price: "+ref13.getPrice());
		        System.out.println("Modelno: "+ref13.getModelno());
		        System.out.println("Colour: "+ref13.getColour());
		        System.out.println("RAM: "+ref13.getRAM());
		        System.out.println("Storage: "+ref13.getStorage());
		        break;
		        
				case 6:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref14 = new featurephones("Samsung", "Rs 3799.0/-", "16", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref14.getBrand());
		        System.out.println("Price: "+ref14.getPrice());
		        System.out.println("Modelno: "+ref14.getModelno());
		        System.out.println("Colour: "+ref14.getColour());
		        System.out.println("RAM: "+ref14.getRAM());
		        System.out.println("Storage: "+ref14.getStorage());
		        break;
		        
				case 7:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref15 = new featurephones("Samsung", "Rs 3799.0/-", "17", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref15.getBrand());
		        System.out.println("Price: "+ref15.getPrice());
		        System.out.println("Modelno: "+ref15.getModelno());
		        System.out.println("Colour: "+ref15.getColour());
		        System.out.println("RAM: "+ref15.getRAM());
		        System.out.println("Storage: "+ref15.getStorage());
		        break;
				case 8: break;
				case 9:
					broucher b1=new broucher();
					b1.brouchers();
					break;
	}
	
	Scanner sc16 = new Scanner(System.in);
    
    while (true) {
        System.out.println("                           ");
        System.out.println("What would you like to do?");
        System.out.print("1. Go back to Main Menu");
        System.out.println("     2. Place the order "); 
        System.out.println("Enter Choice: ");
        
        int choice16 = sc16.nextInt();
        
        if (choice16 == 1) {
            Android();
            break; 
        } else if (choice16 == 2) {
            System.out.println("Your order has been placed.");
           // System.out.println("Go back to main menu");
            
          
            break; 
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
	}
	catch(InputMismatchException ie)
	{
		System.out.println("             ");
		System.out.println("Invalid entry! Please try again");
		Sm();
	}
}

public void L1()
{
	System.out.println("__________________________________________");
	System.out.println("              Lava Devices               ");
	System.out.println("__________________________________________");
	System.out.println("             ");
	System.out.println("1.Lava 11 DS");
	System.out.println("2.Lava 12 KP");
	System.out.println("3.Lava 13 2660");
	System.out.println("4.Lava 14 DS");
	System.out.println("5.Lava 15");
	System.out.println("6.Lava 16");
	System.out.println("7.Lava 17");
	System.out.println("8.Back");
	System.out.println("9.Main Menu");
	try {
	System.out.println("Enter Choice: ");

	Scanner sc7 = new Scanner(System.in);
	int choice7 = sc7.nextInt();
	switch(choice7)
	{
			case 1:
				System.out.println("____________________________________________________");
				System.out.println("                       ");
		        featurephones ref9 = new featurephones("Lava", "Rs 3249.0/-", "11", "Blue", "15MB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref9.getBrand());
		        System.out.println("Price: "+ref9.getPrice());
		        System.out.println("Modelno: "+ref9.getModelno());
		        System.out.println("Colour: "+ref9.getColour());
		        System.out.println("RAM: "+ref9.getRAM());
		        System.out.println("Storage: "+ref9.getStorage());
		        break;
		        
		        
				case 2:
		
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref10 = new featurephones("Lava", "Rs 3799.0/-", "12", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref10.getBrand());
		        System.out.println("Price: "+ref10.getPrice());
		        System.out.println("Modelno: "+ref10.getModelno());
		        System.out.println("Colour: "+ref10.getColour());
		        System.out.println("RAM: "+ref10.getRAM());
		        System.out.println("Storage: "+ref10.getStorage());
		        break;
		        
		        
				case 3:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref11 = new featurephones("Lava", "Rs 3799.0/-", "13", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref11.getBrand());
		        System.out.println("Price: "+ref11.getPrice());
		        System.out.println("Modelno: "+ref11.getModelno());
		        System.out.println("Colour: "+ref11.getColour());
		        System.out.println("RAM: "+ref11.getRAM());
		        System.out.println("Storage: "+ref11.getStorage());
		        break;
		        
				case 4:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref12 = new featurephones("Lava", "Rs 3799.0/-", "14", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref12.getBrand());
		        System.out.println("Price: "+ref12.getPrice());
		        System.out.println("Modelno: "+ref12.getModelno());
		        System.out.println("Colour: "+ref12.getColour());
		        System.out.println("RAM: "+ref12.getRAM());
		        System.out.println("Storage: "+ref12.getStorage());
		        break;
		        
				case 5:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref13 = new featurephones("Lava", "Rs 3799.0/-", "15", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref13.getBrand());
		        System.out.println("Price: "+ref13.getPrice());
		        System.out.println("Modelno: "+ref13.getModelno());
		        System.out.println("Colour: "+ref13.getColour());
		        System.out.println("RAM: "+ref13.getRAM());
		        System.out.println("Storage: "+ref13.getStorage());
		        break;
		        
				case 6:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref14 = new featurephones("Lava", "Rs 3799.0/-", "16", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref14.getBrand());
		        System.out.println("Price: "+ref14.getPrice());
		        System.out.println("Modelno: "+ref14.getModelno());
		        System.out.println("Colour: "+ref14.getColour());
		        System.out.println("RAM: "+ref14.getRAM());
		        System.out.println("Storage: "+ref14.getStorage());
		        break;
		        
				case 7:
					System.out.println("____________________________________________________");
					System.out.println("                       ");
		        featurephones ref15 = new featurephones("Lava", "Rs 3799.0/-", "17", "Blue", "0.04GB","2GB");
		        System.out.println("                        ");
		        System.out.println("Brand: " +ref15.getBrand());
		        System.out.println("Price: "+ref15.getPrice());
		        System.out.println("Modelno: "+ref15.getModelno());
		        System.out.println("Colour: "+ref15.getColour());
		        System.out.println("RAM: "+ref15.getRAM());
		        System.out.println("Storage: "+ref15.getStorage());
		        break;
				case 8: break;
				case 9:
					broucher b1=new broucher();
					b1.brouchers();
					break;
					
					default: 
						System.out.println("Invalid choice! Please try again");
						fp();
	}
	Scanner sc17 = new Scanner(System.in);
    
    while (true) {
        System.out.println("                           ");
        System.out.println("What would you like to do?");
        System.out.print("1. Go back to Main Menu");
        System.out.println("     2. Place the order "); 
        System.out.println("Enter Choice: ");
        
        int choice17 = sc17.nextInt();
        
        if (choice17 == 1) {
            Android();
            break; 
        } else if (choice17 == 2) {
            System.out.println("Your order has been placed.");
           // System.out.println("Go back to main menu");
            
          
            break; 
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
	}
	catch(InputMismatchException ie)
	{
		System.out.println("             ");
		System.out.println("Invalid entry! Please try again");
		L1();
	}
}
    
    
    public void fp()
    {
    	System.out.println("__________________________________________");
		System.out.println("              FeaturePhones               ");
		System.out.println("__________________________________________");
		System.out.println("             ");
	System.out.println("1.Nokia");
	System.out.println("2.Jio");
	System.out.println("3.Motorola");
	System.out.println("4.Micromax");
	System.out.println("5.Samsung");
	System.out.println("6.Lava");
	System.out.println("7.Back");
	System.out.println("8.Main menu");
	
	//System.out.println("   9. Search");
	try {
	System.out.print(" Enter Choice: ");
	Scanner sc = new Scanner(System.in); 
	int choice = sc.nextInt();
	switch(choice) 
	{
	
		case 1:N1();
		break;
	
	
		case 2: 
		J1();
		break;
		
		case 3:
		
		M1();
		
		break;
		
		case 4:
		
		M2();
		break;
		
		case 5:
	
		Sm();
		break;
	
	
		case 6:
	
		L1();
		break;
		
	
	
	
	}

    }
	catch(InputMismatchException ie)
	{
		System.out.println("             ");
		System.out.println("Invalid entry! Please try again");
		fp();
}
    }
}
