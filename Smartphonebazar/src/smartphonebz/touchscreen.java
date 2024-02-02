package smartphonebz;

import java.util.*;

public class touchscreen extends android{
	   private String displaytype;
	   private String resolution;
	   private String displaysize;
	   private String refreshrate;
	   private String peakbrightness;
	   private String Chargingpoint;
	   private String speakertype;
	   
	   
	  
	   public String displaytype()
	    {
	        return displaytype;
	    }

	    public void displaytype(String displaytype)
	    {
	        this.displaytype = displaytype;
	    }

	    /*-----------------------------------------------------------------------------*/

	    public String resolution()
	    {
	        return resolution;
	    }

	    public void resolution(String resolution)
	    {
	        this.resolution = resolution;
	    }

	    /*-----------------------------------------------------------------------------*/

	    public String displaysize()
	    {
	        return displaysize;
	    }

	    public void displaysize(String displaysize)
	    {
	        this.displaysize = displaysize;
	    }

	    /*-----------------------------------------------------------------------------*/

	    public String refreshrate()
	    {
	        return refreshrate;
	    }

	    public void refreshrate(String refreshrate)
	    {
	        this.refreshrate = refreshrate;
	    }

	    /*-----------------------------------------------------------------------------*/

	    public String peakbrightness()
	    {
	        return peakbrightness;
	    }

	    public void peakbrightness(String peakbrightness)
	    {
	        this.peakbrightness = peakbrightness;
	    }

	    /*-----------------------------------------------------------------------------*/

	    public String Chargingpoint()
	    {
	        return Chargingpoint;
	    }

	    public void Chargingpoint(String Chargingpoint)
	    {
	        this.Chargingpoint = Chargingpoint;
	    }

	    /*-----------------------------------------------------------------------------*/

	    public String speakertype()
	    {
	        return speakertype;
	    }

	    public void speakertype(String speakertype)
	    {
	        this.speakertype = speakertype;
	    }

	    /*-----------------------------------------------------------------------------*/
	    

	   
	    
	    touchscreen(String Brand,String Modelno,String Price,String Colour,String RAM,
	    		String Storage,String Battery,String Frontcamera,String Rarecamera,String Androidversion,String displaytype,
	    		String resolution,String displaysize,String refreshrate,String peakbrightness,String Chargingpoint,String speakertype)
		   {
	    	   this.setBrand(Brand);
	    	   this.setModelno(Modelno);
	           this.setPrice(Price);
	           this.setColour(Colour);
	           this.setRAM(RAM);
	           this.setStorage(Storage);
	           this.setBattery(Battery);
	           this.setFrontcamera(Frontcamera);
	           this.setRarecamera(Rarecamera);
	           this.setAndroidversion(Androidversion);
			   this.displaytype = displaytype;
			   this.resolution = resolution;
			   this.displaysize = displaysize;
			   this.refreshrate = refreshrate;
			   this.peakbrightness = peakbrightness;
			   this.Chargingpoint = Chargingpoint;
			   this.speakertype = speakertype;
			  
			   
		   }
	    
	    public String toString()
	    {System.out.println("____________________________________________________");
		
	    	System.out.println("                                         ");
	    	System.out.println("Brand: " +getBrand());
	    	System.out.println("Modelno: " +getModelno());
	    	System.out.println("Price: " +getPrice());
	    	System.out.println("Colour: " +getColour());
	    	System.out.println("RAM: " +getRAM());
	    	System.out.println("Storage: " +getStorage());
	    	System.out.println("Battery: " +getBattery());
	    	System.out.println("Frontcamera: " +getFrontcamera());
	    	System.out.println("Rarecamera: " +getRarecamera());
	    	System.out.println("Androidversion: " +getAndroidversion());
	    	System.out.println("Displaytype: " +displaytype);
	    	System.out.println("Resolution: " +resolution);
	    	System.out.println("Displaysize: " +displaysize);
	    	System.out.println("Refreshrate: " +refreshrate);
	    	System.out.println("Peakbrightness: " +peakbrightness);
	    	System.out.println("Chargingpoint: " +Chargingpoint);
	    	System.out.println("Speakertype: " +speakertype);
	    	return "";
	    }
	    
	    touchscreen()
	    {
	    	
	    }
	    
	    public void sam()
		{
	    	System.out.println("__________________________________________");
			System.out.println("             Samsung Tablets              ");
			System.out.println("__________________________________________");
		System.out.println("             ");
		System.out.println("1.Samsung Tab A7");
		System.out.println("2.Samsung Tab A7 Lite");
		System.out.println("3.Samsung Tab A8");
		System.out.println("4.Samsung Tab A8.0");
		System.out.println("5.Samsung Tab S6 Lite");
		System.out.println("6.Samsung Tab S7 FE");
		System.out.println("7.Samsung Tab S8");
		System.out.println("8.Samsung Tab S8+");
		System.out.println("9.Samsung Tab S9");
		System.out.println("10.Samsung Tab S9 Ultra");
		
		System.out.println("11. Back");
		System.out.println("12. Main Menu");
		
	try {
		
	
		System.out.print(" Enter Choice: ");

		Scanner sc11 = new Scanner(System.in);
		int choice11 = sc11.nextInt();
		switch(choice11) 
		{
		case 1:
			touchscreen touch1 = new touchscreen("Samsung","A7", "16000","Gray","3GB","32GB","7040mAh",
					"5 MP","8 MP", "Android 11", "LCD", "2000 x 1200","26.31cm","60Hz","800 nits","Type C", "Quad speaker with dolby atmos");
			System.out.println(touch1);
			break;
			
		case 2:
			touchscreen touch2 = new touchscreen("Samsung","A7 Lite", "16450","Gray","3GB","32GB","7040mAh",
					"5 MP","8 MP", "Android 10", "TFT LCD", "1920 x 1200","26.42cm","60Hz","800 nits","Micro USB", "Single speaker");
			System.out.println(touch2);
			break;
			
			
		case 3:
			touchscreen touch3 = new touchscreen("Samsung","A8", "17900","Gray","4GB","64GB","7040mAh",
					"2 MP","8 MP", "Android 11", "TFT Capacitive", "1280 x 800","26.69cm","60Hz","800 nits","Type C", "Single speaker");
			System.out.println(touch3);
			break;
		case 4:
			touchscreen touch4 = new touchscreen("Samsung","A8.0 4G", "9999","Black","2GB","32GB","7040mAh",
					"2 MP","5 MP", "Android Pie", "TFT LCD", "1920 x 1200","26.69cm","60Hz","600 nits","Micro USB", "Single speaker");
			System.out.println(touch4);
			break;
		case 5:
			touchscreen touch5 = new touchscreen("Samsung","S6 Lite", "33999","Gray, Black","4GB","128GB","7040mAh",
					"5 MP","8 MP", "Android 11", "TFT LCD", "1920 x 1200","26.69cm","60Hz","800 nits","Type C", "Stereo speaker with Dolby Atmos");
			System.out.println(touch5);
			break;
		case 6:
			touchscreen touch6 = new touchscreen("Samsung","S7 FE", "45998","Mystic Black, Mystic Green, Mystic Silver","4GB","64GB","10090mAh",
					"5 MP","8 MP", "Android 11", "TFT LCD", "2560 x 1600","31.5cm","60Hz","500 nits","Type C", "Quad speakers");
			System.out.println(touch6);
			break;
			
			
		case 7:
			touchscreen touch7 = new touchscreen("Samsung","S8", "17900","Graphite, Pink Gold, Silver","12GB","256GB","8000mAh",
					"5 MP","8 MP", "Android 12", "TFT LCD", "1920 x 1200","27.81cm","120Hz","800 nits","Type C", "Quad speakers with dolby atmos");
			System.out.println(touch7);
			break;
			
		case 8:
			touchscreen touch8 = new touchscreen("Samsung","S8 +", "88890","Graphite, Pink Gold, Silver","12GB","256GB","7040mAh",
					"12 MP Ultrawide","13/6 (Dual) MP, ", "Android 12", "sAmoled Display", "2800 x 1752","31.49cm","120Hz","800 nits","Type C", "Quad speakers with dolby atmos");
			System.out.println(touch8);
			break;
		case 9:
			touchscreen touch9 = new touchscreen("Samsung","S9", "72999","Gray,Biege","8GB","128GB","7040mAh",
					"12 MP Ultrawide","13 MP", "Android 13", "Dynamic sAmoled 2X Display", "2560 x 1600","27.81cm","120Hz","____","Type C", "Quad speakers by AKG");
			System.out.println(touch9);
			break;
		case 10:
			touchscreen touch10 = new touchscreen("Samsung","S9", "119999","Gray, Biege","12GB","512GB","7040mAh",
					"12 MP + 12 MP","13 MP + 8 MP UW", "Android 13", "Dynamic sAmoled 2X Display", "2960 x 1848","36.69cm","120Hz","800 nits","Type C", "Quad speakers by AKG");
			System.out.println(touch10);
			break;
		default: 
			System.out.println("Invalid choice. Please enter from 1 to 10");
			sam();
			break;
		
			
		case 11: Tab(); 

			
			break;
			
		case 12:
			broucher b1=new broucher();
			b1.brouchers();
		case 13:
			
			
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
            	sam();
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
            	smart101();
            	break;
            }
            }
            catch(InputMismatchException ie)
            {
            	System.out.println("Invalid Entry. Please try again!");
            	smart101();
            	
            }
        }
	}
	catch(InputMismatchException ie)
	{
		System.out.println("Invalid input");
		System.out.println("Please try again");
		sam();
	}
		}
	    
	    public void Onep()
		{
	    	System.out.println("__________________________________________");
			System.out.println("             OnePlus Tablets              ");
			System.out.println("__________________________________________");
			System.out.println("             ");
			System.out.println("1.OnePlus Pad 8GB,128GB");
			System.out.println("2.OnePlus Pad 12GB,256GB");
			
			System.out.println("3. Back");
			System.out.println("4. Main Menu");
			try {
			System.out.print(" Enter Choice: ");

			Scanner sc12 = new Scanner(System.in);
			int choice12 = sc12.nextInt();
			switch(choice12) 
			{
			
			case 1:
				touchscreen touch11 = new touchscreen("OnePlus Pad","___", "36066","Green","8GB","128GB","9510mAh",
						"8 MP","13 MP", "Android 13", "IPS LCD", "2800 x 2000","26.31cm","144Hz","500 nits","Type C", "Quad speaker with dolby atmos");
				System.out.println(touch11);
				break;
				
				
			case 2:
				touchscreen touch12 = new touchscreen("OnePlus Pad","___", "36066","Green","12GB","256GB","9510mAh",
						"8 MP","13 MP", "Android 13", "IPS LCD", "2800 x 2000","26.31cm","144Hz","500 nits","Type C", "Quad speaker with dolby atmos");
				System.out.println(touch12);
				break;
				
			case 3:
				Tab();
				break;
			case 4:
				broucher b1=new broucher();
				b1.brouchers();
				break;
				
			
			}
			 Scanner sc22 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice22 = sc22.nextInt();
		            
		            if (choice22 == 1) {
		                Android();
		                break; 
		            } else if (choice22 == 2) {
		                System.out.println("Your order has been placed.");
		               // System.out.println("Go back to main menu");
		                
		              
		                break; 
		            } else {
		                System.out.println("Invalid choice. Please enter 1 or 2.");
		            }
		        
		            }
			}catch(InputMismatchException ie)
	    	{
	    		System.out.println("Invalid input");
	    		System.out.println("Please try again");
	    		Onep();
	    	}
			
		}
	    
	    
	    public void Opp()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("              Oppo Tablets                ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Oppo Pad");
				System.out.println("2.Oppo Pad Air");
				
				
				System.out.println("3. Back");
				System.out.println("4. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc13 = new Scanner(System.in);
				int choice13 = sc13.nextInt();
				switch(choice13) 
				{
				case 1:
					touchscreen touch13 = new touchscreen("Oppo Pad","___", "14999","Gray, Purple","4GB","64GB","7100mAh",
							"2 MP","5 MP", "Android ColorOS 12.1", "IPS LCD", "1920 x 1200","26.31cm","60Hz","_____","Type C", "Stereo speakers");
   				System.out.println(touch13);
					break;
					
				case 2:
					touchscreen touch14 = new touchscreen("Oppo Pad","___", "15999","Gray, Purple","4GB","128GB","7100mAh",
							"2 MP","5 MP", "Android ColorOS 12.1", "IPS LCD", "1920 x 1200","26.31cm","60Hz","_____","Type C", "Stereo speakers");
   				System.out.println(touch14);
					break;
					
				case 3:
					Tab();
					break;
					
				case 4:
					broucher b1=new broucher();
					b1.brouchers();
					break;
					
				}
				Scanner sc23 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice23 = sc23.nextInt();
		            
		            if (choice23 == 1) {
		                Android();
		                break; 
		            } else if (choice23 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Opp();
		    	}

	    }
	    
	    public void Len()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("             Lenovo Tablets               ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Lenovo Tab P11 Plus");
				System.out.println("2.Lenovo Tab M10 5G");
				System.out.println("3.Lenovo Tab M10 FHD 3rd Gen");
				System.out.println("4.Lenovo Tab M10 FHD Plus");
				System.out.println("5.Lenovo Tab M7 3rd Gen");
				System.out.println("6.Lenovo Tab M8 HD");
				System.out.println("7.Lenovo Tab M9");
				System.out.println("8.Lenovo Tab M10 HD LED");
				System.out.println("9.Lenovo Tab K10 FHD");
				System.out.println("10.Lenovo Tab Yoga 11");
				
				System.out.println("11. Back");
				System.out.println("12. Main Menu");
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc14 = new Scanner(System.in);
				int choice14 = sc14.nextInt();
				switch(choice14) 
				{
				case 1:
					touchscreen touch13 = new touchscreen("Lenovo Tab","P11 Plus", "19999","Slate Gray","6 GB","128GB","7700mAh",
							"8 MP","13 MP", "Android 11 OS", "FHD, IPS", "2000 x 1200","27.94 cm","60Hz","____","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch13);
		
					break;
				case 2:
					touchscreen touch14 = new touchscreen("Lenovo Tab","M10 5G", "26299","Black","6GB","128GB","7700mAh",
							"8 MP","13 MP", "Android 13", "IPS LCD", "2000x1200","26.9cm","90Hz","500 Nits","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch14);
					break;
				case 3:
					touchscreen touch15 = new touchscreen("Lenovo Tab","M10 FHD 3rd Gen", "13499","Storm Gray","4GB","64GB","5100mAh",
							"5 MP","8 MP", "Android 11", "IPS LCD", "1920 x 1200","25.65cm","60Hz","320 nits","Type C", "Dual Speakers with Dolby Atmos");
   				System.out.println(touch15);
					break;
				case 4:
					touchscreen touch16 = new touchscreen("Lenovo Tab","M10 FHD Plus", "19999","Storm Gray","6GB","128GB","7700mAh",
							"8 MP","8 MP", "Android 11", "IPS LCD", "1920 x 1200","26.31cm","60Hz","320 nits","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch16);
					break;
				case 5:
					touchscreen touch17 = new touchscreen("Lenovo Tab","M7 3rd Gen", "7999","Iron Gray","2GB","32GB","3750mAh",
							"2 MP","5 MP", "Android 11", "IPS LCD", "1920 x 1200","26.31cm","60Hz","_____","Type C", "Single speakers");
   				System.out.println(touch17);
					break;
				case 6:
					touchscreen touch18 = new touchscreen("Lenovo Tab","M8 HD", "8348","Gray","2GB","32GB","5000mAH",
							"2 MP","5 MP", "Android 9", "IPS LCD", "1280 X 800","20cm","60Hz","350 nits","Type C", "Single speakers");
   				System.out.println(touch18);
					break;
				case 7:
					touchscreen touch19 = new touchscreen("Lenovo Tab","M9", "9999","Arctic Gray","3GB","32GB","5100mAh",
							"2 MP","8 MP", "Android 12", "IPS LCD", "1340x800","22.86cm","60Hz","400nits","Type C", "Single speakers");
   				System.out.println(touch19);
					break;
				case 8:
					touchscreen touch20 = new touchscreen("Lenovo Tab","M10 HD LED", "6940","Black","2GB","16GB","3500mAh",
							"2 MP","5 MP", "Android 11", "IPS LCD", "1280 X 800","26.31cm","60Hz","_____","Type C", "Single speakers");
   				System.out.println(touch20);
					break;
				case 9:
					touchscreen touch221 = new touchscreen("Lenovo Tab","K10 FHD", "16999","Abyss Blue","4GB","64GB","7500mAh",
							"2 MP","5 MP", "Android 11", "IPS LCD", "1920 x 1200","26.16cm","60Hz","400 nits","Type C", "Dual speakers");
   				System.out.println(touch221);
					break;
				case 10:
					touchscreen touch222 = new touchscreen("Lenovo Tab","Yoga 11", "21999","Storm Grey","4GB","128GB","7100mAh",
							"2 MP","5 MP", "Android 11", "IPS LCD", "2000 x 1200","27.94cm","60Hz","400 nits","Type C", "Stereo speakers");
   				System.out.println(touch222);
					break;
				case 11:
					Tab();
					break;
					
				case 12:
					broucher b1=new broucher();
					b1.brouchers();
					break;
					
				}
				Scanner sc24 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice24 = sc24.nextInt();
		            
		            if (choice24 == 1) {
		                Android();
		                break; 
		            } else if (choice24 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Len();
		    	}
	    }
	    
	    public void Redm()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("             Redmi Tablets                ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Redmi Pad");
			
				System.out.println("2. Back");
				System.out.println("3. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc15 = new Scanner(System.in);
				int choice15 = sc15.nextInt();
				switch(choice15) 
				{
				case 1:
					touchscreen touch223 = new touchscreen("Redmi Pad","___", "17999","Graphite Grey","6GB","128GB","7100mAh",
							"2 MP","8 MP", "Android 12", "IPS LCD", "2000 x 1200","27.94cm","90Hz","400 nits","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch223);
					break;
					
				case 2:
					Tab();
					break;
					
				case 3:
					broucher b1=new broucher();
					b1.brouchers();
					break;
				}
				
				Scanner sc25 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice25 = sc25.nextInt();
		            
		            if (choice25 == 1) {
		                Android();
		                break; 
		            } else if (choice25 == 2) {
		                System.out.println("Your order has been placed.");
		               // System.out.println("Go back to main menu");
		                
		              
		                break; 
		            } else {
		                System.out.println("Invalid choice. Please enter 1 or 2.");
		            }
		        }
		        
				}catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Redm();
		    	}
	    }
	    
	    public void Realm()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("             Realme Tablets               ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Realme Pad Wifi + 4G");
				System.out.println("2.Realme Pad X WiFi+5G");
				System.out.println("3.Realme Pad Mini WiFi+4G");
				System.out.println("4.Realme Pad Mini WiFi");
				
				
				System.out.println("5. Back");
				System.out.println("6. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc16 = new Scanner(System.in);
				int choice16 = sc16.nextInt();
				switch(choice16) 
				{
				case 1:
					touchscreen touch224 = new touchscreen("Realme Pad Wifi + 4G","___", "17527","Golden Colour","4GB","64GB","7100mAh",
							"2 MP","8 MP", "Android 11", "IPS LCD", "2000 x 1200","27.94cm","60Hz","400 nits","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch224);
					break;
					
				case 2:
					touchscreen touch225 = new touchscreen("Realme Pad X WiFi+5G","___", "27999","Graphite Grey","6GB","128GB","8100mAh",
							"2 MP","8 MP", "Android 12", "IPS LCD", "2000 x 1200","27.9cm","90Hz","400 nits","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch225);
					break;
					
				case 3:
					touchscreen touch226 = new touchscreen("Realme Pad Mini WiFi+4G","___", "13999","Black","4GB","64GB","7100mAh",
							"2 MP","8 MP", "Android 11", "IPS LCD", "1920 x 1200","22.1cm","60Hz","400 nits","Type C", "Single Speaker");
   				System.out.println(touch226);
					break;
					
				case 4:
					touchscreen touch227 = new touchscreen("Realme Pad Mini WiFi","___", "12999","Graphite Grey","6GB","128GB","7100mAh",
							"2 MP","8 MP", "Android 12", "IPS LCD", "2000 x 1200","22.1cm","60Hz","____","Type C", "Single Speaker");
   				System.out.println(touch227);
					break;
					
				case 5:
					Tab();
				break;
					
				case 6:broucher b1=new broucher();
				b1.brouchers();
				break;
					
				}
				Scanner sc26 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice26 = sc26.nextInt();
		            
		            if (choice26 == 1) {
		                Android();
		                break; 
		            } else if (choice26 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Realm();
		    	}
	    }
	    
	    public void Xiaom()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("             Xiaomi Tablets               ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Samsung Tab A7");
				System.out.println("2.Samsung Tab A7 Lite");
				System.out.println("3.Samsung Tab A8");
				System.out.println("4.Samsung Tab A8.0");
				System.out.println("5.Samsung Tab S6 Lite");
				System.out.println("6.Samsung Tab S7 FE");
				System.out.println("7.Samsung Tab S8");
				System.out.println("8.Samsung Tab S8+");
				System.out.println("9.Samsung Tab S9");
				System.out.println("10.Samsung Tab S9 Ultra");
				
				System.out.println("11. Back");
				System.out.println("12. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc17 = new Scanner(System.in);
				int choice17 = sc17.nextInt();
				switch(choice17) 
				{
				case 11:
					Tab();
					break;
				}
				Scanner sc27 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            
		            
		            System.out.println("Enter Choice: ");
		            
		            int choice27 = sc27.nextInt();
		            
		            if (choice27 == 1) {
		                Android();
		                break; 
		            } else if (choice27 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Xiaom();
		    	}
	    }
	    
	    public void Moto()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("            Motorola Tablets              ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Samsung Tab A7");
				System.out.println("2.Samsung Tab A7 Lite");
				System.out.println("3.Samsung Tab A8");
				System.out.println("4.Samsung Tab A8.0");
				System.out.println("5.Samsung Tab S6 Lite");
				System.out.println("6.Samsung Tab S7 FE");
				System.out.println("7.Samsung Tab S8");
				System.out.println("8.Samsung Tab S8+");
				System.out.println("9.Samsung Tab S9");
				System.out.println("10.Samsung Tab S9 Ultra");
				
				System.out.println("11. Back");
				System.out.println("12. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc18 = new Scanner(System.in);
				int choice18 = sc18.nextInt();
				switch(choice18) 
				{
				case 11:
					Tab();
					break;
				case 12:
					broucher b1=new broucher();
					b1.brouchers();
					break;
				}
				Scanner sc28 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice28 = sc28.nextInt();
		            
		            if (choice28 == 1) {
		                Android();
		                break; 
		            } else if (choice28 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Moto();
		    	}
	    }
	    
	    public void Pixel()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("          Google Pixel Tablets            ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Samsung Tab A7");
				System.out.println("2.Samsung Tab A7 Lite");
				System.out.println("3.Samsung Tab A8");
				System.out.println("4.Samsung Tab A8.0");
				System.out.println("5.Samsung Tab S6 Lite");
				System.out.println("6.Samsung Tab S7 FE");
				System.out.println("7.Samsung Tab S8");
				System.out.println("8.Samsung Tab S8+");
				System.out.println("9.Samsung Tab S9");
				System.out.println("10.Samsung Tab S9 Ultra");
				
				System.out.println("11. Back");
				System.out.println("12. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc19 = new Scanner(System.in);
				int choice19 = sc19.nextInt();
				switch(choice19) 
				{
				case 11:
					Tab();
					break;
					
				case 12:
					broucher b1=new broucher();
					b1.brouchers();
					break;
				}
				Scanner sc29 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice29 = sc29.nextInt();
		            
		            if (choice29 == 1) {
		                Android();
		                break; 
		            } else if (choice29 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Pixel();
		    	}
	    }
	    
	    public void Ikall()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("              Ikall Tablets               ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Samsung Tab A7");
				System.out.println("2.Samsung Tab A7 Lite");
				System.out.println("3.Samsung Tab A8");
				System.out.println("4.Samsung Tab A8.0");
				System.out.println("5.Samsung Tab S6 Lite");
				System.out.println("6.Samsung Tab S7 FE");
				System.out.println("7.Samsung Tab S8");
				System.out.println("8.Samsung Tab S8+");
				System.out.println("9.Samsung Tab S9");
				System.out.println("10.Samsung Tab S9 Ultra");
				
				System.out.println("11. Back");
				System.out.println("12. Main Menu");
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc20 = new Scanner(System.in);
				int choice20 = sc20.nextInt();
				switch(choice20) 
				{
				case 11:
					Tab();
					break;
				case 12:
					broucher b1=new broucher();
					b1.brouchers();
					break;
				}
				Scanner sc30 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice30 = sc30.nextInt();
		            
		            if (choice30 == 1) {
		                Android();
		                break; 
		            } else if (choice30 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Ikall();
		    	}
				
	    }
	    
	    public void Honor()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("              Honor Tablets               ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Samsung Tab A7");
				System.out.println("2.Samsung Tab A7 Lite");
				System.out.println("3.Samsung Tab A8");
				System.out.println("4.Samsung Tab A8.0");
				System.out.println("5.Samsung Tab S6 Lite");
				System.out.println("6.Samsung Tab S7 FE");
				System.out.println("7.Samsung Tab S8");
				System.out.println("8.Samsung Tab S8+");
				System.out.println("9.Samsung Tab S9");
				System.out.println("10.Samsung Tab S9 Ultra");
				
				System.out.println("11. Back");
				System.out.println("12. Main Menu");
				try {
					
				
				System.out.print(" Enter Choice: ");

				Scanner sc201 = new Scanner(System.in);
				int choice201= sc201.nextInt();
				switch(choice201) 
				{
				case 11:
					Tab();
					break;
				case 12:
					broucher b1=new broucher();
					b1.brouchers();
					break;
				}
				}
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Honor();
		    	}
	    }
	    
	    public void Tab()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("                 Tablets                  ");
			System.out.println("__________________________________________");
		System.out.println("             ");
    			System.out.println("1.Samsung");
    			System.out.println("2.Oneplus");
    			System.out.println("3.Oppo");
    			System.out.println("4.Lenovo");
    			System.out.println("5.Redmi");
    			System.out.println("6.Realme");
    			System.out.println("7.Xiaomi");
    			System.out.println("8.Motorola");
    			System.out.println("9.Google Pixel");
    			System.out.println("10.Ikall");
    			System.out.println("11.Honor");
    			System.out.println("12.Back");
				System.out.println("13.Main Menu");
				
				try {
    			System.out.print(" Enter Choice: ");
    			Scanner sc1 = new Scanner(System.in); 
    			int choice1 = sc1.nextInt();
    			switch(choice1) 
    			{
    			case 1: 
    				
    				sam();
    			
					break;
					
					
					
    			case 2:
    				
    				Onep();
    				
    				break;
    				
    			case 3:
    				
    				Opp();
    				break;
    											
    			case 4:
    				
    				Len();
    				break;
						
    			case 5:
    				
    				Redm();
    				break;
						
    			case 6:
    				
    				Realm();
    				break;
						
						
    			case 7:
    				Xiaom();
    				break;
						
    			case 8:
    				Moto();
    				break;
						
						
    			case 9:
    				Pixel();
    				break;
						
						
    			case 10:
    				Ikall();
    				break;
						
    			case 11:
    				Honor();
    				break;
						
						
    			case 12: Touchscreen();
    			break;
    				
    			case 13:
					broucher b1=new broucher();
					b1.brouchers();
					break;
    				
    			default:
    				System.out.println("Invalid choice. Please enter from 1 to 10");
    				
    				break;
    			}
				}
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Tab();
		    	}
	    }
	    
	    
	    public void sam2()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("            Samsung Folds              ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Samsung Galaxy Z Fold 4 5G");
				System.out.println("2.Samsung Galaxy Z Fold 5 5G");
			
				
				System.out.println("3. Back");
				System.out.println("4. Main Menu");
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc90 = new Scanner(System.in);
				int choice90 = sc90.nextInt();
				switch(choice90) 
				{
				case 1:
					touchscreen touch90 = new touchscreen("Samsung Galaxy","Fold 4 5G", "1,54,998","Beige/Graygreen/Phantom Black","12GB","256GB","4400mAh",
							"10 MP, 4 MP Under Display","12 MP Ultrawide, 50 MP Wide angle, 10MP Telephoto", "Android 12", "sAmoled", "2000 x 1200","15.73cm/19.21cm","120Hz","1000 nits","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch90);
   				break;
				case 2:
					touchscreen touch91 = new touchscreen("Samsung Galaxy","Fold 5 5G", "1,64,999","Cream/Icy Blue/Phantom Black/","12GB","512GB","4400mAh",
							"10 MP, 4 MP Under Display","12 MP Ultrawide, 50 MP Wide angle, 10MP Telephoto", "Android 13", "sAmoled", "2000 x 1200","15.73cm/19.21cm","120Hz","1000 nits","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch91);
   				break;
				case 3:
					Tab();
					break;
				case 4:
					broucher b1=new broucher();
					b1.brouchers();
					break;
					
				}
				
				Scanner sc91 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice91 = sc91.nextInt();
		            
		            if (choice91 == 1) {
		                Android();
		                break; 
		            } else if (choice91 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		sam2();
		    	}
	    }
	    
	    public void Techno()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("              Techno Folds                ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Techno Phantom V Fold 5G");
				
			
				
				System.out.println("2. Back");
				System.out.println("3. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc92 = new Scanner(System.in);
				int choice92 = sc92.nextInt();
				switch(choice92) 
				{
				case 1:
					touchscreen touch92 = new touchscreen("Techno","Phantom V Fold 5G", "88,888","Black","12GB","256GB","4400mAh",
							"32 MP + 16 MP ","50 MP Telephoto + 50 MP Main + 13 MP Ultrawide ", "Android 13", "LTPO Amoled", "2000 x 1200","15.73cm/19.21cm","2K + 120Hz","1000 nits","Type C", "Quad Speakers with Dolby Atmos");
   				System.out.println(touch92);
   				break;
				
				case 2:
					Tab();
					break;
				case 3:
					broucher b1=new broucher();
					b1.brouchers();
					break;
					
				}
				
				Scanner sc93 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice93 = sc93.nextInt();
		            
		            if (choice93 == 1) {
		                Android();
		                break; 
		            } else if (choice93 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Techno();
		    	}
	    }
	    public void sam3()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("              Samsung Flips                ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Samsung Galaxy Z Flip 4 5G");
				System.out.println("2.Samsung Galaxy Z Flip 5 5G");
				
			
				
				System.out.println("3. Back");
				System.out.println("4. Main Menu");
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc94 = new Scanner(System.in);
				int choice94 = sc94.nextInt();
				switch(choice94) 
				{
				case 1:
					touchscreen touch95 = new touchscreen("Samsung Galaxy","Z Flip 4 5G", "89,999","Bora Purple/Graphite/Pink Gold","8GB","128GB/256GB","3700mAh",
							"32 MP ","50 MP Telephoto + 50 MP Main + 13 MP Ultrawide ", "Android 12", "LTPO Amoled", "2000 x 1200","15.73cm/19.21cm","2K + 120Hz","1000 nits","Type C", "Stereo Speakers with Dolby Atmos");
   				System.out.println(touch95);
   				break;
				
				case 2:
					touchscreen touch96 = new touchscreen("Samsung Galaxy","Z Flip 5 5G", "99,999","Bora Purple/Graphite/Pink Gold","8GB","128GB/256GB","3700mAh",
							"32 MP ","50 MP Telephoto + 50 MP Main + 13 MP Ultrawide ", "Android 13", "LTPO Amoled", "2000 x 1200","15.73cm/19.21cm","2K + 120Hz","1000 nits","Type C", "Stereo Speakers with Dolby Atmos");
   				System.out.println(touch96);
   				break;
					
				case 3:
					Tab();
					break;
					
				case 4:
					broucher b1=new broucher();
					b1.brouchers();
					
					break;
				}
				
				Scanner sc96 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice96 = sc96.nextInt();
		            
		            if (choice96 == 1) {
		                Android();
		                break; 
		            } else if (choice96 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		sam3();
		    	}
	    	
	    }
	    
	    public void moto1()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("            Motorola Flips               ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("1.Motorola razr 40");
				System.out.println("2.Motorola razr 40 Ultra ");
				
			
				
				System.out.println("3. Back");
				System.out.println("4. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc97 = new Scanner(System.in);
				int choice97 = sc97.nextInt();
				switch(choice97) 
				{
				case 1:
					touchscreen touch98 = new touchscreen("Motorola","Razr 40", "59,999","Sage Green/Vanilla Cream/ Summer Lilac","8GB","256GB","4200mAh",
							"32 MP ","64 MP Main + 13 MP Ultrawide ", "Android 13", "Amoled", "2640 x 1080","15.73cm","2K + 144Hz","1000 nits","Type C", "Stereo Speakers with Dolby Atmos");
   				System.out.println(touch98);
   				break;
				
				case 2:
					touchscreen touch96 = new touchscreen("Motorola ","razr 40 Ultra", "89,999","Viva Magenta/Infinite Black","8GB","256GB","4200mAh",
							"32 MP ","50 MP Main + 13 MP Ultrawide ", "Android 13", "Amoled", "2640 x 1080","15.73cm/19.21cm","2K + 120Hz","1000 nits","Type C", "Stereo Speakers with Dolby Atmos");
   				System.out.println(touch96);
   				break;
					
				case 3:
					Tab();
					break;
					
				case 4:
					broucher b1=new broucher();
					b1.brouchers();
					break;
					
				}
				
				Scanner sc96 = new Scanner(System.in);
		        
		        while (true) {
		            System.out.println("                           ");
		            System.out.println("What would you like to do?");
		            System.out.print("1. Go back to Main Menu");
		            System.out.println("     2. Place the order "); 
		            System.out.println("Enter Choice: ");
		            
		            int choice96 = sc96.nextInt();
		            
		            if (choice96 == 1) {
		                Android();
		                break; 
		            } else if (choice96 == 2) {
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
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		moto1();
		    	}
	    }
	    
	    public void Opp1()
	    {
	    	
	    }
	    public void Fold()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("             Fold and Flips               ");
			System.out.println("__________________________________________");
			System.out.println("             ");
				System.out.println("Folds:");
				System.out.println("             ");
				System.out.println("1.Samsung");
				System.out.println("2.Techno");
				System.out.println("             ");
				System.out.println("Flips:");
				System.out.println("             ");
				System.out.println("3.Samsung");
				System.out.println("4.Motorola");
				System.out.println("5.Oppo");
				System.out.println("             ");
				System.out.println("6. Back");
				System.out.println("7. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sc101 = new Scanner(System.in);
				int choice101 = sc101.nextInt();
				switch(choice101) 
				{
				
				case 1:
					sam2();
				break;
				
				case 2:
					Techno();
					break;
					
				case 3:
					sam3();
					break;
					
				case 4:
					moto1();
					break;
					
				case 5:
					Opp1();
					break;
					
				case 6:
				
					Tab();
					break;
				case 7:
					broucher b1=new broucher();
					b1.brouchers();
					break;
				}
//				  while (true) {
//			            System.out.println("                           ");
//			            System.out.println("Thankyou for viewing the product!");
//			            System.out.println("                           ");
//			            System.out.println("Would you like to explore more products?");
//			            System.out.println("                           ");
//			            System.out.print("1. Back");
//			            System.out.print("    2.Main Menu");
//			            System.out.println("    3.Exit");
//			            System.out.println("                           ");
//			            
//			            try {
//			            Scanner sc96 = new Scanner(System.in);
//			            System.out.println("Enter Choice: ");
//			            
//			            int choice96 = sc96.nextInt();
//			            
//			            if (choice96 == 1) 
//			            {
//			            	Fold();
//			                break; 
//			            } 
//			            else if (choice96 == 2) 
//			            {
//			               
//			            	broucher b1=new broucher();
//							b1.brouchers();
//			              
//			                break; 
//			            } 
//			            else if(choice96 == 3) 
//			            {
//			            	access a=new access();
//			            	a.L1();
//			            		broucher b = new broucher();
//			            		b.brouchers(); 
//			               break;
//			            }
//			            else {
//			            	System.out.println("Invalid choice. Please enter between 1 to 3");
//			            	smart11();
//			            	break;
//			            }
//			            }
//			            catch(InputMismatchException ie)
//			            {
//			            	System.out.println("Invalid Entry. Please try again!");
//			            	smart11();
//			            	
//			            }
//			        }
				}
				
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		Fold();
		    	}
	    }
	 
	    public void smart1()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Samsung M04");
			smart89.add("2.Samsung M13");
			smart89.add("3.Samsung M32");
			smart89.add("4.Samsung M33");
			smart89.add("5.Samsung M34");
			smart89.add("6.Samsung M53");
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			 LinkedList<String> smart90= new LinkedList<String>();
			 
			 	System.out.println("             ");
				System.out.println("Midrange Series under 50k");
				System.out.println("             ");
			 
				smart90.add("7.Samsung A34");
				smart90.add("8.Samsung A54");
				smart90.add("9.Samsung A73");
				
				for(Object obj: smart90)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				
				LinkedList<String> smart91= new LinkedList<String>();
				System.out.println("             ");
				System.out.println("Premium Category series");
				System.out.println("             ");
				
				smart91.add("10.Samsung S23");
				smart91.add("11.Samsung S23 Plus");
				smart91.add("12.Samsung S23 Ultra");
				for(Object obj: smart91)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				System.out.println("             ");
				System.out.println("13. Back");
				System.out.println("14. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart11();
//					HashMap<String,String> hm=new HashMap<String,String>();    
//			      hm.put("Brand","Samsung");
//			         
//			      
//			     for(Map.Entry m:hm.entrySet())  
//			     {  
//			        System.out.println(m.getKey()+" "+m.getValue());   
//			     }  
					
//					List<smartphone> smartphoneDetails = new ArrayList<>();
//			        smartphoneDetails.add(new smartphone("Brand", "Samsung"));
//			        smartphoneDetails.add(new smartphone("Modelno", "S9"));
//			        smartphoneDetails.add(new smartphone("Price", "119999"));
//			        smartphoneDetails.add(new smartphone("Colour", "Gray"));
//			        smartphoneDetails.add(new smartphone("RAM", "12GB"));
//
//			        for (smartphone smartphone : smartphoneDetails) {
//			            System.out.println(smartphone.getBrand() + ": " + smartphone.getValue());
//			        }
					
				 break;
				case 2:smart12();
				break;
				
				case 3:smart13();
				break;
				
				case 4:smart14();
				break;
				
				case 5:smart15();
				break;
				
				case 6:smart16();
				break;
				
				case 7:smart17();
				break;
				
				case 8:smart18();
				break;
				
				case 9:smart19();
				break;
				
				case 10:smart190();
				break;
				
				case 11:smart191();
				break;
				
				case 12:smart192();
				
				break;
				case 13:Smarts();
					break;
				case 14: broucher b1=new broucher();
				b1.brouchers();
				break;
			    }
				}
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart1();
		    	}
				
	    }
	    
	    public void smart11()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M04");
	        p.setPrice("8,499");
	        p.setColour("Dark Blue");
	        p.setRAM("8GB");
	        p.setStorage("64GB");
	        p.setProcessor("MediaTek Helio p35");
	        p.setRarecamera("13MP + 12MP");
	        p.setFrontcamera("5MP");
	        p.setBattery("5000mAH");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("LCD");
	        t.resolution("720x1600");
	        t.displaysize("16.55cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart11();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart11();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart12()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M65");
	        p.setPrice("18,999");
	        p.setColour("Black");
	        p.setRAM("6GB");
	        p.setStorage("128GB");
	        p.setProcessor("Snapdragon 665");
	        p.setRarecamera("16MP + 8MP");
	        p.setFrontcamera("8MP");
	        p.setBattery("4500mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("LCD");
	        t.resolution("720x1600");
	        t.displaysize("16.55cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart12();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart12();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart13()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M21");
	        p.setPrice("12,499");
	        p.setColour("Blue");
	        p.setRAM("4GB");
	        p.setStorage("64GB");
	        p.setProcessor("Exynos 850");
	        p.setRarecamera("13MP + 5MP");
	        p.setFrontcamera("5MP");
	        p.setBattery("6000mAH");
	        

	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("LCD");
	        t.resolution("720x1600");
	        t.displaysize("16.55cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	        
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart13();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart13();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart14()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M49");
	        p.setPrice("28,499");
	        p.setColour("White");
	        p.setRAM("8GB");
	        p.setStorage("128GB");
	        p.setProcessor("Kirin 710");
	        p.setRarecamera("16MP + 20MP");
	        p.setFrontcamera("8MP");
	        p.setBattery("4000mAH");
	       
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("LCD");
	        t.resolution("720x1600");
	        t.displaysize("16.55cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	        
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart14();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart14();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart15()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M92");
	        p.setPrice("24,999");
	        p.setColour("Silver");
	        p.setRAM("10GB");
	        p.setStorage("256GB");
	        p.setProcessor("Snapdragon 750G");
	        p.setRarecamera("64MP + 16MP");
	        p.setFrontcamera("32MP");
	        p.setBattery("4700mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.95cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");

	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart15();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart15();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart16()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M81");
	        p.setPrice("22,799");
	        p.setColour("Purple");
	        p.setRAM("6GB");
	        p.setStorage("128GB");
	        p.setProcessor("Exynos 990");
	        p.setRarecamera("48MP + 12MP");
	        p.setFrontcamera("20MP");
	        p.setBattery("4200mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Super AMOLED");
	        t.resolution("1080x2340");
	        t.displaysize("16.35cm");
	        t.refreshrate("120Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dolby Atmos Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart16();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart16();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart17()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M59");
	        p.setPrice("32,999");
	        p.setColour("Green");
	        p.setRAM("8GB");
	        p.setStorage("256GB");
	        p.setProcessor("Snapdragon 765G");
	        p.setRarecamera("48MP + 8MP");
	        p.setFrontcamera("32MP");
	        p.setBattery("4400mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Super AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("17.02cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart17();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart17();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart18()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M38");
	        p.setPrice("14,999");
	        p.setColour("Gold");
	        p.setRAM("4GB");
	        p.setStorage("64GB");
	        p.setProcessor("Helio G95");
	        p.setRarecamera("64MP + 8MP");
	        p.setFrontcamera("20MP");
	        p.setBattery("5000mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("LCD");
	        t.resolution("1080x2340");
	        t.displaysize("16.55cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart18();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart18();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart19()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M27");
	        p.setPrice("11,499");
	        p.setColour("Blue");
	        p.setRAM("3GB");
	        p.setStorage("32GB");
	        p.setProcessor("Snapdragon 450");
	        p.setRarecamera("13MP + 5MP");
	        p.setFrontcamera("8MP");
	        p.setBattery("4000mAH");
	       
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("LCD");
	        t.resolution("720x1600");
	        t.displaysize("15.80cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart19();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart19();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart190()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M66");
	        p.setPrice("27,999");
	        p.setColour("Black");
	        p.setRAM("8GB");
	        p.setStorage("128GB");
	        p.setProcessor("Snapdragon 732G");
	        p.setRarecamera("64MP + 12MP");
	        p.setFrontcamera("32MP");
	        p.setBattery("4700mAH");
	        

	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Super AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.95cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart190();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart190();
	            	
	            }
	        }
	        
	    }
	    public void smart191()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M88");
	        p.setPrice("34,999");
	        p.setColour("Gray");
	        p.setRAM("12GB");
	        p.setStorage("256GB");
	        p.setProcessor("Exynos 980");
	        p.setRarecamera("48MP + 20MP");
	        p.setFrontcamera("25MP");
	        p.setBattery("4300mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Super AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.95cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart191();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart191();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart192()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Samsung Galaxy");
	        p.setModelno("M88");
	        p.setPrice("34,999");
	        p.setColour("Gray");
	        p.setRAM("12GB");
	        p.setStorage("256GB");
	        p.setProcessor("Exynos 980");
	        p.setRarecamera("48MP + 20MP");
	        p.setFrontcamera("25MP");
	        p.setBattery("4300mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Super AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.95cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart1();
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
	            	smart192();     
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart192();           	
	            }
	        }
	        
	    }
	    
	    public void smart2()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Oneplus Nord CE2 Lite");
			smart89.add("2.Oneplus Nord CE3");
			smart89.add("3.Oneplus NOrd CE3 Lite");
			
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
				
				LinkedList<String> smart91= new LinkedList<String>();
				System.out.println("             ");
				System.out.println("Premium Category series");
				System.out.println("             ");
				
				smart91.add("4.OnePlus Nord 3 5G");
				smart91.add("5.OnePlus 10R 5G");
				smart91.add("6.OnePlus 11 5G");
				smart91.add("7.OnePlus 11R 5G");
				for(Object obj: smart91)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				System.out.println("             ");
				System.out.println("8. Back");
				System.out.println("9. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart21();

					
				 break;
				case 2:smart22();
				break;
				
				case 3:smart23();
				break;
				
				case 4:smart24();
				break;
				
				case 5:smart25();
				break;
				
				case 6:smart26();
				break;
				
				case 7:smart27();
				break;
				
				case 8:Smarts();
				break;
				
				case 9:broucher b1=new broucher();
				b1.brouchers();
				break;
				}
				
			
			    }
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart2();
		    	}
				
	    }
	    public void smart21()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Oneplus");
	        p.setModelno("8T");
	        p.setPrice("28,999");
	        p.setColour("Glacial Green");
	        p.setRAM("8GB");
	        p.setStorage("128GB");
	        p.setProcessor("Snapdragon 865");
	        p.setRarecamera("48MP + 16MP");
	        p.setFrontcamera("16MP");
	        p.setBattery("4500mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.65cm");
	        t.refreshrate("120Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart2();
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
	            	smart21();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart21();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smart22()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Oneplus");
	        p.setModelno("9R");
	        p.setPrice("27,999");
	        p.setColour("Lake Blue");
	        p.setRAM("8GB");
	        p.setStorage("256GB");
	        p.setProcessor("Snapdragon 870");
	        p.setRarecamera("48MP + 16MP");
	        p.setFrontcamera("16MP");
	        p.setBattery("4500mAH");
	       
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.65cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart2();
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
	            	smart22();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart22();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart23()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Oneplus");
	        p.setModelno("7T");
	        p.setPrice("29,999");
	        p.setColour("Frosted Silver");
	        p.setRAM("8GB");
	        p.setStorage("128GB");
	        p.setProcessor("Snapdragon 855+");
	        p.setRarecamera("48MP + 12MP");
	        p.setFrontcamera("16MP");
	        p.setBattery("3800mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Fluid AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.64cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart2();
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
	            	smart23();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart23();
	            	
	            }
	        }
	        
	    }
	    public void smart24()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Oneplus");
	        p.setModelno("9");
	        p.setPrice("32,999");
	        p.setColour("Stellar Black");
	        p.setRAM("12GB");
	        p.setStorage("256GB");
	        p.setProcessor("Snapdragon 888");
	        p.setRarecamera("48MP + 50MP");
	        p.setFrontcamera("16MP");
	        p.setBattery("4500mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Fluid AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.65cm");
	        t.refreshrate("120Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart2();
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
	            	smart24();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart24();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart25()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Oneplus");
	        p.setModelno("8");
	        p.setPrice("34,999");
	        p.setColour("Onyx Black");
	        p.setRAM("8GB");
	        p.setStorage("128GB");
	        p.setProcessor("Snapdragon 865");
	        p.setRarecamera("48MP + 16MP");
	        p.setFrontcamera("16MP");
	        p.setBattery("4300mAH");
	       
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Fluid AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.64cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart2();
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
	            	smart25();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart25();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart26()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Oneplus");
	        p.setModelno("Nord 2");
	        p.setPrice("31,499");
	        p.setColour("Gray Onyx");
	        p.setRAM("12GB");
	        p.setStorage("256GB");
	        p.setProcessor("MediaTek Dimensity 1200");
	        p.setRarecamera("50MP + 8MP");
	        p.setFrontcamera("32MP");
	        p.setBattery("4500mAH");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Fluid AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.44cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	        
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart2();
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
	            	smart26();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart26();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart27()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Oneplus");
	        p.setModelno("8 Pro");
	        p.setPrice("45,999");
	        p.setColour("Ultramarine Blue");
	        p.setRAM("12GB");
	        p.setStorage("256GB");
	        p.setProcessor("Snapdragon 865");
	        p.setRarecamera("48MP + 8MP");
	        p.setFrontcamera("16MP");
	        p.setBattery("4510mAH");
	       
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("Fluid AMOLED");
	        t.resolution("1440x3168");
	        t.displaysize("17.2cm");
	        t.refreshrate("120Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dolby Atmos Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart2();
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
	            	smart27();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart27();
	            	
	            }
	        }
	        
	        
	    }
	    
	    
	   
	    
	    
	    public void smart3()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Vivo Y16");
			smart89.add("2.Vivo Y20t");
			smart89.add("3.Vivo Y27");
			
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			 LinkedList<String> smart90= new LinkedList<String>();
			 
			 	System.out.println("             ");
				System.out.println("Midrange Series under 50k");
				System.out.println("             ");
			 
				smart90.add("4.Vivo V27 5G");
				smart90.add("5.Vivo Y100A 5G");
				smart90.add("6.Vivo V23 Pro 5G");
				smart90.add("7.Vivo V27 5G");
				smart90.add("8.Vivo x80 5G");
				
				for(Object obj: smart90)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				
				
				System.out.println("             ");
				System.out.println("9. Back");
				System.out.println("10. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart31();

					
				 break;
				case 2:smart32();
				break;
				
				case 3:smart33();
				break;
				
				case 4:smart34();
				break;
				
				case 5:smart35();
				break;
				
				case 6:smart36();
				break;
				
				case 7:smart37();
				break;
				
				case 8:smart38();
				break;
				
				case 9:Smarts();
				break;
				
				case 10:broucher b1=new broucher();
				b1.brouchers();
				break;
				
				
				
			    }
				}
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart3();
		    	}
				
	    }
	    public void smart31()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Vivo");
	        p.setModelno("Y20");
	        p.setPrice("12,990");
	        p.setColour("Dawn White");
	        p.setRAM("4GB");
	        p.setStorage("64GB");
	        p.setProcessor("Snapdragon 460");
	        p.setRarecamera("13MP + 2MP + 2MP");
	        p.setFrontcamera("8MP");
	        p.setBattery("5000mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("IPS LCD");
	        t.resolution("720x1600");
	        t.displaysize("16.55cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart3();
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
	            	smart31();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart31();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smart32()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Vivo");
	        p.setModelno("V21e");
	        p.setPrice("22,990");
	        p.setColour("Sunset Jazz");
	        p.setRAM("8GB");
	        p.setStorage("128GB");
	        p.setProcessor("MediaTek Dimensity 700");
	        p.setRarecamera("64MP + 2MP");
	        p.setFrontcamera("44MP");
	        p.setBattery("4000mAH");
	        
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.37cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart3();
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
	            	smart32();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart32();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart33()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Vivo");
	        p.setModelno("Y73");
	        p.setPrice("28,990");
	        p.setColour("Diamond Flare");
	        p.setRAM("8GB");
	        p.setStorage("128GB");
	        p.setProcessor("Mediatek Helio G95");
	        p.setRarecamera("64MP + 2MP + 2MP");
	        p.setFrontcamera("16MP");
	        p.setBattery("4000mAH");
	        
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.37cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart3();
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
	            	smart33();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart33();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart34()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Vivo");
	        p.setModelno("V21");
	        p.setPrice("35,990");
	        p.setColour("Arctic White");
	        p.setRAM("8GB");
	        p.setStorage("256GB");
	        p.setProcessor("MediaTek Dimensity 800U");
	        p.setRarecamera("64MP + 8MP + 2MP");
	        p.setFrontcamera("44MP");
	        p.setBattery("4000mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("AMOLED");
	        t.resolution("1080x2400");
	        t.displaysize("16.37cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart3();
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
	            	smart34();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart34();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart35()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Vivo");
	        p.setModelno("X60 Pro");
	        p.setPrice("48,990");
	        p.setColour("Midnight Black");
	        p.setRAM("12GB");
	        p.setStorage("256GB");
	        p.setProcessor("Snapdragon 870");
	        p.setRarecamera("48MP + 13MP + 13MP + 8MP");
	        p.setFrontcamera("32MP");
	        p.setBattery("4200mAH");
	      
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("AMOLED");
	        t.resolution("1080x2376");
	        t.displaysize("16.66cm");
	        t.refreshrate("120Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dolby Atmos Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart3();
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
	            	smart35();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart35();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart36()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Vivo");
	        p.setModelno("X50");
	        p.setPrice("29,990");
	        p.setColour("Frost Blue");
	        p.setRAM("8GB");
	        p.setStorage("128GB");
	        p.setProcessor("Snapdragon 765G");
	        p.setRarecamera("48MP + 13MP + 8MP + 5MP");
	        p.setFrontcamera("32MP");
	        p.setBattery("4200mAH");
	       
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("AMOLED");
	        t.resolution("1080x2376");
	        t.displaysize("16.66cm");
	        t.refreshrate("90Hz");
	        t.Chargingpoint("USB Type-C");
	        t.speakertype("Dual Stereo Speakers");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart3();
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
	            	smart36();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart36();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart37()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Vivo");
	        p.setModelno("Y95");
	        p.setPrice("13,490");
	        p.setColour("Starry Night");
	        p.setRAM("4GB");
	        p.setStorage("64GB");
	        p.setProcessor("Snapdragon 439");
	        p.setRarecamera("13MP + 2MP");
	        p.setFrontcamera("20MP");
	        p.setBattery("4030mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("IPS LCD");
	        t.resolution("720x1520");
	        t.displaysize("15.80cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart3();
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
	            	smart37();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart37();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart38()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("Vivo");
	        p.setModelno("Z1 Pro");
	        p.setPrice("18,990");
	        p.setColour("Sonic Black");
	        p.setRAM("6GB");
	        p.setStorage("128GB");
	        p.setProcessor("Snapdragon 712");
	        p.setRarecamera("16MP + 8MP + 2MP");
	        p.setFrontcamera("32MP");
	        p.setBattery("5000mAH");
	       
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("IPS LCD");
	        t.resolution("720x1520");
	        t.displaysize("15.80cm");
	        t.refreshrate("60Hz");
	        t.Chargingpoint("Micro USB");
	        t.speakertype("Single Speaker");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart3();
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
	            	smart38();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart38();
	            	
	            }
	        }
	        
	        
	    }
	    
	    
	    public void smart4()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Oppo A17");
			smart89.add("2.Oppo A58");
			smart89.add("3.Oppo A78");
			smart89.add("4.Oppo F23");
			smart89.add("5.Oppo Reno8 5G");
			
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			 LinkedList<String> smart90= new LinkedList<String>();
			 
			 	System.out.println("             ");
				System.out.println("Midrange Series under 50k");
				System.out.println("             ");
				smart90.add("6.Oppo Reno7 Pro 5G");
				smart90.add("7.Oppo Reno8 Pro 5G");
				smart90.add("8.Oppo Reno10 5G");
				smart90.add("9.Oppo Reno10 Pro 5g");
			
				
				for(Object obj: smart90)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				
				
				System.out.println("             ");
				System.out.println("10. Back");
				System.out.println("11. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart41();

					
				 break;
				case 2:smart42();
				break;
				
				case 3:smart43();
				break;
				
				case 4:smart44();
				break;
				
				case 5:smart45();
				break;
				
				case 6:smart46();
				break;
				
				case 7:smart47();
				break;
				
				case 8:smart48();
				break;
				
				case 9:smart49();
				break;
				
				case 10:Smarts();
				break;
				
				case 11:broucher b1=new broucher();
				b1.brouchers();
				break;
				
				
				
			    }
				
				}
				
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart4();
		    	}
				
	    }
	    public void smart41()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart41();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart41();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smart42()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart42();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart42();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart43()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart43();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart43();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart44()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart44();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart44();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart45()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart45();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart45();
	            	
	            }
	        }
	        
	    }
	    public void smart46()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart46();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart46();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart47()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart47();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart47();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart48()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart48();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart48();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart49()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart4();
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
	            	smart49();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart49();
	            	
	            }
	        }
	        
	        
	    }
	   
	    
	    public void smart5()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Redmi A2");
			smart89.add("2.Redmi 12C");
			smart89.add("3.Redmi 11 Prime");
			smart89.add("4.Redmi Note 12");
			smart89.add("5.Redmi Note 11T");
			
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			 
				
				LinkedList<String> smart91= new LinkedList<String>();
				System.out.println("             ");
				System.out.println("Premium Category series");
				System.out.println("             ");
				
				smart91.add("6.Xiaomi 13 Pro");
				smart91.add("7.MI 11X Pro");
				
				for(Object obj: smart91)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				System.out.println("             ");
				System.out.println("8. Back");
				System.out.println("9. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart51();

					
				 break;
				case 2:smart52();
				break;
				
				case 3:smart53();
				break;
				
				case 4:smart54();
				break;
				
				case 5:smart55();
				break;
				
				case 6:smart56();
				break;
				
				case 7:smart57();
				break;
				
				case 8:Smarts();
				break;
				
				case 9:broucher b1=new broucher();
				b1.brouchers();
				break;
				
				
				
			    }
				}
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart5();
		    	}
				
	    }
	    public void smart51()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart5();
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
	            	smart51();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart51();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smart52()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart5();
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
	            	smart52();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart52();
	            	
	            }
	        }
	        
	    }
	    public void smart53()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart5();
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
	            	smart53();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart53();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart54()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart5();
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
	            	smart54();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart54();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart55()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart5();
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
	            	smart55();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart55();
	            	
	            }
	        }
	        
	    }
	    public void smart56()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart5();
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
	            	smart56();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart56();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart57()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart5();
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
	            	smart57();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart57();
	            	
	            }
	        }
	        
	        
	    }
	    
	    
	    
	    public void smart6()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Realme Narzo N55");
			smart89.add("2.Realme Narzo N53");
			smart89.add("3.Realme Narzo N50i Prime");
			smart89.add("4.Realme Narzo N50A Prime");
			smart89.add("5.Realme Narzo N50");
			smart89.add("6.Realme Narzo N60");
			smart89.add("7.Realme Narzo N60 Pro");
			smart89.add("8.Realme 10 Pro");
			smart89.add("9.Realme GT Neo 3");
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			
				LinkedList<String> smart91= new LinkedList<String>();
				System.out.println("             ");
				System.out.println("Premium Category series");
				System.out.println("             ");
				
				smart91.add("10.Realme GT 2 Pro");
				
				smart91.add("11.Realme X50 Pro");
				smart91.add("12.Samsung S23 Ultra");
				for(Object obj: smart91)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				System.out.println("             ");
				System.out.println("13. Back");
				System.out.println("14. Main Menu");
				
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart61();

					
				 break;
				case 2:smart62();
				break;
				
				case 3:smart63();
				break;
				
				case 4:smart64();
				break;
				
				case 5:smart65();
				break;
				
				case 6:smart66();
				break;
				
				case 7:smart67();
				break;
				
				case 8:smart68();
				break;
				
				case 9:smart69();
				break;
				
				case 10:smart690();
				break;
				
				case 11:smart691();
				break;
				
				case 12:smart692();
				
				break;
				case 13:Smarts();
					break;
					
				case 14:broucher b1=new broucher();
				b1.brouchers();
					break;
				
			    }
				}
				
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart6();
		    	}
				
	    }
	    public void smart61()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart61();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart61();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smart62()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart62();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart62();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart63()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart63();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart63();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart64()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart64();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart64();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart65()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart65();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart65();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart66()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart66();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart66();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart67()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart67();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart67();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart68()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart68();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart68();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart69()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart69();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart69();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart690()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart690();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart690();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart691()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart691();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart691();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart692()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart6();
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
	            	smart692();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart692();
	            	
	            }
	        }
	        
	        
	    }
	    
	    
	    public void smart7()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Motorola G32");
			smart89.add("2.Motorola G82");
			smart89.add("3.Motorola E7 Power");
			smart89.add("4.Motorola E40");
			smart89.add("5.Motorola G31");
			smart89.add("6.Motorola E22");
			smart89.add("7.Motorola G60");
			smart89.add("8.Motorola Edge20");
			
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			 
				
				LinkedList<String> smart91= new LinkedList<String>();
				System.out.println("             ");
				System.out.println("Premium Category series");
				System.out.println("             ");
				
				smart91.add("9.Motorola Edge+");
				smart91.add("10.Motorla Edge 30 Fusion");
				smart91.add("11.Motorla Edge 40 Fusion");
				for(Object obj: smart91)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				System.out.println("             ");
				System.out.println("12. Back");
				System.out.println("13. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart71();

					
				 break;
				case 2:smart72();
				break;
				
				case 3:smart73();
				break;
				
				case 4:smart74();
				break;
				
				case 5:smart75();
				break;
				
				case 6:smart76();
				break;
				
				case 7:smart77();
				break;
				
				case 8:smart78();
				break;
				
				case 9:smart79();
				break;
				
				case 10:smart790();
				break;
				
				case 11:smart791();
				break;
				
				case 12:Smarts();
				break;
				case 13:broucher b1=new broucher();
				b1.brouchers();
					break;
					
				
			    }
				
				}
				
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart7();
		    	}
				
	    }
	    public void smart71()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart71();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart71();
	            	
	            }
	        }
	        
	    }
	    
	    public void smart72()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart72();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart72();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart73()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart73();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart73();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart74()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart74();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart74();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart75()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart75();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart75();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart76()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart76();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart76();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart77()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart77();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart77();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart78()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart78();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart78();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart79()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart79();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart79();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart790()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart790();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart790();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart791()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart7();
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
	            	smart791();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart791();
	            	
	            }
	        }
	        
	        
	    }
	    
	    
	    
	    public void smart8()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Nokia C12");
			smart89.add("2.Nokia G11");
			smart89.add("3.Nokia C32");
			smart89.add("4.Nokia C22");
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			 LinkedList<String> smart90= new LinkedList<String>();
			 
			 	System.out.println("             ");
				System.out.println("Midrange Series under 50k");
				System.out.println("             ");
			 
				smart90.add("5.Nokia X30 5G");
				
				for(Object obj: smart90)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				
				
				System.out.println("             ");
				System.out.println("6. Back");
				System.out.println("7. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart81();

					
				 break;
				case 2:smart82();
				break;
				
				case 3:smart83();
				break;
				
				case 4:smart84();
				break;
				
				case 5:smart85();
				break;
				
				case 6:Smarts();
				break;
				
				case 7:broucher b1=new broucher();
				b1.brouchers();
				break;
				
				
				
			    }
				
				}
				
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart8();
		    	}
				
	    }
	    public void smart81()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart8();
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
	            	smart81();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart81();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smart82()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart8();
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
	            	smart82();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart82();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart83()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart8();
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
	            	smart83();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart83();
	            	
	            }
	        }
	        
	    }
	    public void smart84()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart8();
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
	            	smart84();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart84();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart85()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart8();
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
	            	smart85();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart85();
	            	
	            }
	        }
	        
	        
	    }
	   
	    
	    public void smart9()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			
			
			smart89.add("1.Nothing Phone 1");
			smart89.add("2.Nothing Phone 2");
			
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			
				
				
				System.out.println("             ");
				System.out.println("3. Back");
				System.out.println("4. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart91();

					
				 break;
				case 2:smart92();
				break;
				
				case 3:Smarts();
				break;
				
				case 4:broucher b1=new broucher();
				b1.brouchers();
				break;
				
				
			    }
				
				}
				
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart9();
		    	}
				
	    }
	    public void smart91()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart9();
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
	            	smart91();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart91();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smart92()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart9();
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
	            	smart91();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart91();
	            	
	            }
	        }
	        
	        
	    }
	    
	    
	    
	    public void smart10()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			
			
			smart89.add("1.Poco M4");
			smart89.add("2.Poco M4 Pro");
			smart89.add("3.Poco M6");
			smart89.add("4.Poco M6 Pro");
			smart89.add("5.Poco F1");
			smart89.add("6.Poco M5");
			smart89.add("7.Poco X4 Pro");
			smart89.add("8.Poco F5");
			smart89.add("9.Poco C55");
			smart89.add("10.Poco C51");
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			
			
				System.out.println("             ");
				System.out.println("11. Back");
				System.out.println("12. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smart101();

					
				 break;
				case 2:smart102();
				break;
				
				case 3:smart103();
				break;
				
				case 4:smart104();
				break;
				
				case 5:smart105();
				break;
				
				case 6:smart106();
				break;
				
				case 7:smart107();
				break;
				
				case 8:smart108();
				break;
				
				case 9:smart109();
				break;
				
				case 10:smart1090();
				break;
				
				case 11:Smarts();
				break;
				
				case 12:broucher b1=new broucher();
				b1.brouchers();
				break;
				
			    }
				}
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smart10();
		    	}
				
	    }
	    public void smart101()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart101();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart101();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smart102()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart102();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart102();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart103()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart103();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart103();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart104()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart104();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart104();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart105()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart105();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart105();
	            	
	            }
	        }
	        
	    }
	    public void smart106()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart106();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart106();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart107()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart107();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart107();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart108()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart108();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart108();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart109()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart109();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart109();
	            	
	            }
	        }
	        
	        
	    }
	    public void smart1090()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smart10();
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
	            	smart1090();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smart1090();
	            	
	            }
	        }
	        
	        
	    }
	    
	    
	    public void smarta1()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			System.out.println("Budget Series under 30k");
			System.out.println("             ");
			
			smart89.add("1.Techno Spark9");
			smart89.add("2.Techno Spark 9T");
			smart89.add("3.Techno Canon 20");
			smart89.add("4.Techno Canon 19 Neo");
			smart89.add("5.Techno Pop 7 Pro");
			smart89.add("6.Techno Canon 20 Pro");
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			
				
				LinkedList<String> smart91= new LinkedList<String>();
				System.out.println("             ");
				System.out.println("Premium Category series");
				System.out.println("             ");
				
				smart91.add("7.Techno Phantom X2");
				smart91.add("8.Techno Phantom X2 Pro");
				
				for(Object obj: smart91)
			   		  
			   	  {
			          
			          System.out.println( obj);
			   	  }
				System.out.println("             ");
				System.out.println("9. Back");
				System.out.println("10 Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smarta11();

					
				 break;
				case 2:smarta12();
				break;
				
				case 3:smarta13();
				break;
				
				case 4:smarta14();
				break;
				
				case 5:smarta15();
				break;
				
				case 6:smarta16();
				break;
				
				case 7:smarta17();
				break;
				
				case 8:smarta18();
				break;
				
				case 9:Smarts();
				break;
				
				case 10:broucher b1=new broucher();
				b1.brouchers();
				break;
				
				}
				
				
				
			    }
				
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smarta1();
		    	}
				
	    }
	    public void smarta11()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta1();
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
	            	smarta11();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta11();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smarta12()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta1();
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
	            	smarta12();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta12();
	            	
	            }
	        }
	        
	        
	    }
	    public void smarta13()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta1();
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
	            	smarta13();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta13();
	            	
	            }
	        }
	        
	    }
	    public void smarta14()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta1();
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
	            	smarta14();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta14();
	            	
	            }
	        }
	        
	        
	    }
	    public void smarta15()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta1();
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
	            	smarta15();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta15();
	            	
	            }
	        }
	        
	        
	    }
	    public void smarta16()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta1();
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
	            	smarta16();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta16();
	            	
	            }
	        }
	        
	        
	    }
	    public void smarta17()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta1();
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
	            	smarta17();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta17();
	            	
	            }
	        }
	        
	    }
	    public void smarta18()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta1();
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
	            	smarta18();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta18();
	            	
	            }
	        }
	        
	        
	    }
	   
	    
	    
	    public void smarta3()
	    {
	    	LinkedList<String> smart89 = new LinkedList<String>();
	    	
	    	System.out.println("             ");
			
			
			smart89.add("1.Lava Blaze");
			smart89.add("2.Lava Blaze 2");
			smart89.add("3.Lava Agni 2");
			
			
			 for(Object obj: smart89)
		   		  
		   	  {
		          
		          System.out.println( obj);
		   	  }
			 
			 
				System.out.println("             ");
				System.out.println("4. Back");
				System.out.println("5. Main Menu");
				
				try {
				System.out.print(" Enter Choice: ");

				Scanner sm = new Scanner(System.in);
				int choiceM= sm.nextInt();
				switch(choiceM) 
				{
				case 1:	smarta31();

					
				 break;
				case 2:smarta32();
				break;
				
				case 3:smarta33();
				break;
				
				case 4:Smarts();
				break;
				
				case 5:broucher b1=new broucher();
				b1.brouchers();
				break;
				
				
			    }
				
				}
				
				catch(InputMismatchException ie)
		    	{
		    		System.out.println("Invalid input");
		    		System.out.println("Please try again");
		    		smarta3();
		    	}
				
	    }
	    public void smarta31()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta3();
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
	            	smarta31();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta31();
	            	
	            }
	        }
	        
	        
	    }
	    
	    public void smarta32()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta3();
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
	            	smarta32();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta32();
	            	
	            }
	        }
	        
	        
	        
	    }
	    public void smarta33()
	    {
	    	ArrayList<smartphone> smartphoneDetails = new ArrayList<>();
	        smartphone p = new smartphone();
	        p.setBrand("a");
	        p.setModelno("a");
	        p.setPrice("a");
	        p.setColour("a");
	        p.setRAM("a");
	        p.setStorage("a");
	        p.setProcessor("a");
	        p.setRarecamera("a");
	        p.setFrontcamera("a");
	        p.setBattery("a");
	        
	        smartphoneDetails.add(p);
	        
	        ArrayList<touchscreen> smartphoneDetails1= new ArrayList<>();
	        touchscreen t = new touchscreen();
	        t.displaytype("b");
	        t.resolution("b");
	        t.displaysize("b");
	        t.refreshrate("b");
	        t.Chargingpoint("b");
	        t.speakertype("b");
	       
	        smartphoneDetails1.add(t);

	        for (smartphone smartphone : smartphoneDetails) {
	        	System.out.println("              ");
	            System.out.println("Brand: " + smartphone.getBrand());
	            System.out.println("Modelno: " + smartphone.getModelno());
	            System.out.println("Price: " + smartphone.getPrice());
	            System.out.println("Colour: " + smartphone.getColour());
	            System.out.println("RAM: " + smartphone.getRAM());
	            System.out.println("Storage: " + smartphone.getStorage());
	            System.out.println("Processor: " + smartphone.getProcessor());
	            System.out.println("Rarecamera: " + smartphone.getRarecamera());
	            System.out.println("Frontcamera: " + smartphone.getFrontcamera());
	            System.out.println("Battery: " + smartphone.getBattery());
	            
	            
	        }
	        for(touchscreen touch : smartphoneDetails1)
	        {
	        	System.out.println("Displaytype: " + touch.displaytype());
	        	System.out.println("Resolution: " + touch.resolution());
	        	System.out.println("Displaysize: " + touch.displaysize());
	        	System.out.println("Refreshrate: " + touch.refreshrate());
	        	System.out.println("Chargingpoint: " + touch.Chargingpoint());
	        	System.out.println("Speakertype: " + touch.speakertype());
	        	
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
	            	smarta3();
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
	            	smarta33();
	            	break;
	            }
	            }
	            catch(InputMismatchException ie)
	            {
	            	System.out.println("Invalid Entry. Please try again!");
	            	smarta33();
	            	
	            }
	        }
	        
	        
	        
	    }
	   
	    
	   
	    
	    
	    
	    
	    
	    public void Smarts()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("             Smartphones                 ");
			System.out.println("__________________________________________");
			System.out.println("             ");
    	
	    	LinkedList<String> smart88 = new LinkedList<String>();
	   	  smart88.add("1.Samsung");
	   	  smart88.add("2.Oneplus");
	   	smart88.add("3.Vivo");
		 smart88.add("4.Oppo");
		 smart88.add("5.Redmi");
		 smart88.add("6.Realme");
		 smart88.add("7.Motorola");
		 smart88.add("8.Nokia");
		 smart88.add("9.Nothing");
		 smart88.add("10.Poco");
		 smart88.add("11.Techno");
		 smart88.add("12.Lava");
		
	   	 // smart88.add("samsung");
	   	 //  String Brand = smart88.get(0).getBrand();
	// System.out.println("Brand of the smartphone: ");
	   	  for(Object obj: smart88)
	   		  
	   	  {
	          
	          System.out.println( obj);
	   	  }
	   	System.out.println("             ");
		System.out.println("13. Back");
		System.out.println("14. Main Menu");
		
		try {
		System.out.print(" Enter Choice: ");

		Scanner sc101 = new Scanner(System.in);
		int choice101 = sc101.nextInt();
		switch(choice101) 
		{
		case 1:	smart1();
		 break;
		case 2:smart2();
		break;
		case 3:smart3();
		break;
		case 4:smart4();
		break;
		case 5:smart5();
		break;
		case 6:smart6();
		break;
		case 7:smart7();
		break;
		case 8:smart8();
		break;
		case 9:smart9();
		break;
		case 10: smart10();
		break;
		case 11: smarta1();
		break;
		case 12: smarta3();
		break;
		case 13:        Touchscreen();
		break;
		case 14:    broucher b1=new broucher();
		b1.brouchers();      
		break;
	    }
		
		}catch(InputMismatchException ie)
    	{
    		System.out.println("Invalid input");
    		System.out.println("Please try again");
    		Smarts();
    	}
	    }
	    public void Touchscreen()
	    {
	    	System.out.println("__________________________________________");
			System.out.println("           TouchScreen Devices            ");
			System.out.println("__________________________________________");
			System.out.println("             ");
	    	
	    	System.out.println("1. Tablet");
	    	System.out.println("2. Foldables and Flips");
	    	System.out.println("3. Smartphones");
	    	System.out.println("4. Back");
	    	System.out.println("5. Main menu");
	    	//System.out.println("5. Search");

	    	try 
	    	{
	    		
	    		
	    	System.out.print(" Enter Choice: ");
	    	Scanner sc = new Scanner(System.in);
	    	int choice = sc.nextInt();
	    		
	    	
	    	switch(choice)
	    	{
	    	case 1:
	    		
	    		Tab();
	    			
	    		break;
	    	case 2:
	    		
	    		Fold();
	    		
	    		break;
	    		
	    	case 3:
	    		
	    		Smarts();
	    		
	    		break;
	    		
	    	case 4: Android();
	    	
	    	case 5:
				broucher b1=new broucher();
				b1.brouchers();
				break;
	    		
	    	}
	    	}
	    	catch(InputMismatchException ie)
	    	{
	    		System.out.println("Invalid input");
	    		System.out.println("Please enter from 1 to 5");
	    		Touchscreen();
	    	}
	    }
	    
	    
	    
	    
}
