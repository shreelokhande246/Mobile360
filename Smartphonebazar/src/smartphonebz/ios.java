package smartphonebz;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class ios extends smartphone{
public void iOS()
{
	System.out.println("__________________________________________");
	System.out.println("               iOS Devices                ");
	System.out.println("__________________________________________");
	LinkedList<String> apple = new LinkedList<String>();
	
	System.out.println("             ");
	
	
	apple.add("1.Apple iPhones");
	
	
	
	 for(Object obj: apple)
   		  
   	  {
          
          System.out.println( obj);
   	  }
	 
		System.out.println("             ");
		System.out.println("2. Back");
		System.out.println("3. Main Menu");
		
		try {
		System.out.print(" Enter Choice: ");

		Scanner io = new Scanner(System.in);
		int choiceM= io.nextInt();
		switch(choiceM) 
		{
		case 1:	Ts();

			
		 break;
		case 2: broucher b1=new broucher();
		b1.brouchers();
		break;
		
		case 3:broucher b2=new broucher();
		b2.brouchers();
		break;
		
		
		
		default: System.out.println("Invalid choice! Please try again");
		iOS();
		
		
		
	    }
		
		}
		
		catch(InputMismatchException ie)
    	{
    		System.out.println("Invalid input");
    		System.out.println("Please try again");
    		iOS();
    	}
}
public void Ts()
{
LinkedList<String> apple = new LinkedList<String>();
	
	System.out.println("             ");
	
	
	apple.add("1.iPhone 13");
	apple.add("2.iPhone 14");
	apple.add("3.iPhone 14 Plus");
	apple.add("4.iPhone 14 Pro");
	apple.add("5.iPhone 14 Pro Max");
	
	
	
	 for(Object obj: apple)
   		  
   	  {
          
          System.out.println( obj);
   	  }
	 
		System.out.println("             ");
		System.out.println("6. Back");
		System.out.println("7. Main Menu");
		
		try {
		System.out.print(" Enter Choice: ");

		Scanner io = new Scanner(System.in);
		int choiceM= io.nextInt();
		switch(choiceM) 
		{
		case 1:	ts1();

			
		 break;
		case 2: ts2();
		break;
		case 3: ts3();
			break;
		case 4: ts4();
			break;
		case 5: ts5();
			break;
		
		case 6:iOS();
		break;
		
		case 7:broucher b2=new broucher();
		b2.brouchers();
		break;
		
		
		
		default: 
		System.out.println("Invalid choice! Please try again");
			Ts();
		
		
		
	    }
		
		}
		
		catch(InputMismatchException ie)
    	{
    		System.out.println("Invalid input");
    		System.out.println("Please try again");
    		Ts();
    	}
}
public void Tb()
{
	
}
public void tb1()
{
	
}

public void ts1()
{
	ArrayList<smartphone> io1 = new ArrayList<>();
    smartphone p = new smartphone();
    p.setBrand("Apple iPhone");
    p.setModelno("13");
    p.setPrice("69,999");
    p.setColour("Green,Midnight,Pink");
    p.setRAM("_");
    p.setStorage("256GB");
    p.setProcessor("A15 bionic chip");
    p.setRarecamera("12MP + 12 MP");
   
    
    io1.add(p);
    
    ArrayList<touchscreen> io2= new ArrayList<>();
    touchscreen t = new touchscreen();
    t.displaytype("OLED");
   
    t.refreshrate("60Hz");
 
   
    io2.add(t);

    for (smartphone smartphone : io1) {
    	System.out.println("              ");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Modelno: " + smartphone.getModelno());
        System.out.println("Price: " + smartphone.getPrice());
        System.out.println("Colour: " + smartphone.getColour());
        System.out.println("RAM: " + smartphone.getRAM());
        System.out.println("Storage: " + smartphone.getStorage());
        System.out.println("Processor: " + smartphone.getProcessor());
        System.out.println("Rarecamera: " + smartphone.getRarecamera());
      
        
    }
    for(touchscreen touch : io2)
    {
    	System.out.println("Displaytype: " + touch.displaytype());
    	System.out.println("Refreshrate: " + touch.refreshrate());
    	
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
        	Ts();
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
        	ts1();
        	break;
        }
        }
        catch(InputMismatchException ie)
        {
        	System.out.println("Invalid Entry. Please try again!");
        	ts1();
        	
        }
    }
}

public void ts2()
{
	ArrayList<smartphone> io1 = new ArrayList<>();
    smartphone p = new smartphone();
    p.setBrand("Apple iPhone");
    p.setModelno("14");
    p.setPrice("69,999/97,999");
    p.setColour("Blue,Midnight,Purple");
    p.setRAM("_");
    p.setStorage("256GB/512GB");
    p.setProcessor("A15 bionic chip");
    p.setRarecamera("12MP + 12 MP");
   
    
    io1.add(p);
    
    ArrayList<touchscreen> io2= new ArrayList<>();
    touchscreen t = new touchscreen();
    t.displaytype("OLED");
   
    t.refreshrate("60Hz");
 
   
    io2.add(t);

    for (smartphone smartphone : io1) {
    	System.out.println("              ");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Modelno: " + smartphone.getModelno());
        System.out.println("Price: " + smartphone.getPrice());
        System.out.println("Colour: " + smartphone.getColour());
        System.out.println("RAM: " + smartphone.getRAM());
        System.out.println("Storage: " + smartphone.getStorage());
        System.out.println("Processor: " + smartphone.getProcessor());
        System.out.println("Rarecamera: " + smartphone.getRarecamera());
      
        
    }
    for(touchscreen touch : io2)
    {
    	System.out.println("Displaytype: " + touch.displaytype());
    	System.out.println("Refreshrate: " + touch.refreshrate());
    	
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
        	Ts();
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
        	ts2();
        	break;
        }
        }
        catch(InputMismatchException ie)
        {
        	System.out.println("Invalid Entry. Please try again!");
        	ts2();
        	
        }
    }
}

public void ts3()
{
	ArrayList<smartphone> io1 = new ArrayList<>();
    smartphone p = new smartphone();
    p.setBrand("Apple iPhone");
    p.setModelno("14 Plus");
    p.setPrice("1,06,999");
    p.setColour("Blue,Midnight,Purple,Red,Yellow");
    p.setRAM("_");
    p.setStorage("512GB");
    p.setProcessor("A15 bionic chip");
    p.setRarecamera("12MP + 12 MP");
   
    
    io1.add(p);
    
    ArrayList<touchscreen> io2= new ArrayList<>();
    touchscreen t = new touchscreen();
    t.displaytype("OLED");
   
    t.refreshrate("60Hz");
 
   
    io2.add(t);

    for (smartphone smartphone : io1) {
    	System.out.println("              ");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Modelno: " + smartphone.getModelno());
        System.out.println("Price: " + smartphone.getPrice());
        System.out.println("Colour: " + smartphone.getColour());
        System.out.println("RAM: " + smartphone.getRAM());
        System.out.println("Storage: " + smartphone.getStorage());
        System.out.println("Processor: " + smartphone.getProcessor());
        System.out.println("Rarecamera: " + smartphone.getRarecamera());
      
        
    }
    for(touchscreen touch : io2)
    {
    	System.out.println("Displaytype: " + touch.displaytype());
    	System.out.println("Refreshrate: " + touch.refreshrate());
    	
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
        	Ts();
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
        	ts3();
        	break;
        }
        }
        catch(InputMismatchException ie)
        {
        	System.out.println("Invalid Entry. Please try again!");
        	ts3();
        	
        }
    }
}

public void ts4()
{
	ArrayList<smartphone> io1 = new ArrayList<>();
    smartphone p = new smartphone();
    p.setBrand("Apple iPhone");
    p.setModelno("14 Pro");
    p.setPrice("1,19,999/1,34,990");
    p.setColour("Space Black,Deep Purple,Gold,Silver");
    p.setRAM("_");
    p.setStorage("128GB/256GB");
    p.setProcessor("A16 bionic chip");
    p.setRarecamera("48MP + 12MP + 12 MP");
   
    
    io1.add(p);
    
    ArrayList<touchscreen> io2= new ArrayList<>();
    touchscreen t = new touchscreen();
    t.displaytype("Always on Dynamic Island Display");
   
    t.refreshrate("120Hz");
 
   
    io2.add(t);

    for (smartphone smartphone : io1) {
    	System.out.println("              ");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Modelno: " + smartphone.getModelno());
        System.out.println("Price: " + smartphone.getPrice());
        System.out.println("Colour: " + smartphone.getColour());
        System.out.println("RAM: " + smartphone.getRAM());
        System.out.println("Storage: " + smartphone.getStorage());
        System.out.println("Processor: " + smartphone.getProcessor());
        System.out.println("Rarecamera: " + smartphone.getRarecamera());
      
        
    }
    for(touchscreen touch : io2)
    {
    	System.out.println("Displaytype: " + touch.displaytype());
    	System.out.println("Refreshrate: " + touch.refreshrate());
    	
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
        	Ts();
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
        	ts4();
        	break;
        }
        }
        catch(InputMismatchException ie)
        {
        	System.out.println("Invalid Entry. Please try again!");
        	ts4();
        	
        }
    }
}

public void ts5()
{
	ArrayList<smartphone> io1 = new ArrayList<>();
    smartphone p = new smartphone();
    p.setBrand("Apple iPhone");
    p.setModelno("14 Pro Max");
    p.setPrice("1,27,999/1,43,990");
    p.setColour("Space Black,Deep Purple,Gold,Silver");
    p.setRAM("_");
    p.setStorage("128GB/256GB");
    p.setProcessor("A16 bionic chip");
    p.setRarecamera("48MP + 12MP + 12 MP");
   
    
    io1.add(p);
    
    ArrayList<touchscreen> io2= new ArrayList<>();
    touchscreen t = new touchscreen();
    t.displaytype("Always on Dynamic Island Display");
    
    t.refreshrate("120Hz");
 
   
    io2.add(t);

    for (smartphone smartphone : io1) {
    	System.out.println("              ");
        System.out.println("Brand: " + smartphone.getBrand());
        System.out.println("Modelno: " + smartphone.getModelno());
        System.out.println("Price: " + smartphone.getPrice());
        System.out.println("Colour: " + smartphone.getColour());
        System.out.println("RAM: " + smartphone.getRAM());
        System.out.println("Storage: " + smartphone.getStorage());
        System.out.println("Processor: " + smartphone.getProcessor());
        System.out.println("Rarecamera: " + smartphone.getRarecamera());
      
        
    }
    for(touchscreen touch : io2)
    {
    	System.out.println("Displaytype: " + touch.displaytype());
    	System.out.println("Refreshrate: " + touch.refreshrate());
    	
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
        	Ts();
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
        	ts5();
        	break;
        }
        }
        catch(InputMismatchException ie)
        {
        	System.out.println("Invalid Entry. Please try again!");
        	ts5();
        	
        }
    }
}




}













