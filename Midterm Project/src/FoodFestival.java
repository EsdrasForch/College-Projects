//https://youtu.be/rA2hUxIBE8M
import java.util.Scanner;
public class FoodFestival {
		
		//Menu strings 
		public static String Nothing[] = {""};
		public static String Appetizer[] = {"Mozzarella Sticks", "Garlic Bread", "Mini Cream Cheese Stuffed Bagels "};
		public static String mainCourse[] = {"Turkey Sandwich", "Captain Crunch Chicken", "Steak Burger", "The Minecraft Meat Lovers Special"};
		public static String Dessert[] = {"Creme Brulee", "Butterbeer", "Pokemon Cookies"};
		public static String Toppings[] = {"Molten Cheese", "Special Sauce", "Frog shaped mini marshmallows"};
		
		public static void main(String[] args) {
			//scanner declaration for keyboard input
			Scanner scnr = new Scanner(System.in);
			String ans = "";
			String name = "";
			String list ="";
			
			//first print statements that connect to decision branching
			System.out.println("Welcome to the food festival!" );
			//do loop because we want the computer to keep repeating the next print statement until the user inputs yes or no.
			do {
				System.out.println("Would you like to place an order?");
				ans = scnr.nextLine();
			}while (!ans.equalsIgnoreCase("YES") && !ans.equalsIgnoreCase("NO"));
			
		//yes or no inputs 
	    if (ans.equalsIgnoreCase("YES")) {
	    	System.out.println("What is your name for the order?");
	    	name = scnr.nextLine();
	    	
	    	//menu loops
	    	int choice = -1;
	    	int top;
	    	
	    	do {
	    		System.out.println();
	    		System.out.println("Select from menu, " + name);
	    		System.out.println ("*********************************");
	    		System.out.println("Enter number of your selection:");
	    		System.out.println("0 - Nothing");
	    		System.out.println("1 - Appetizers");
	    		System.out.println("2 - Main Course");
	    		System.out.println("3 - Dessert");
	    		System.out.println("*********************************");
	    		choice = scnr.nextInt();
	    		
	    		
	    		switch (choice) {
	    		//appetizer menu
	    		case 1: {
	    			int choice1 = -1;
	    	    	
	    	    	do {
	    	    		System.out.println();
	    	    		System.out.println("Appetizer Menu:");
	    	    		System.out.println ("*********************************");
	    	    		System.out.println("Enter the number for your appetizer selection:");
	    	    		System.out.println("0 - Nothing");
	    	    		System.out.println("1 - " + Appetizer [0]);
	    	    		System.out.println("2 - " + Appetizer [1]);
	    	    		System.out.println("3 - " + Appetizer [2]);
	    	    		System.out.println();
	    	    		System.out.println("*********************************");
	    	    		choice1 = scnr.nextInt();
	    	    		//string that saves input
	    	    		list = list + "Appetizer:[" + Appetizer[choice1] + ": " ;
	    	    		//toppings
	    	    		while(true){
	    	    			System.out.println("0 - Nothing");
	                        System.out.println("1 - " + Toppings[0]);
	                        System.out.println("2 - " + Toppings [1]);
	                        System.out.println("3 - " + Toppings [2]);                
	                        top = scnr.nextInt();
	                        if(top == 0) break;
	                        list = list + Toppings[top] + "";
	                       }
	                       list = list + "]\n";
	    	    		
	    	    		switch (choice) {
	    	    		case 1: {break;}
	    	    		case 2: {break;}
	    	    		case 3: {break;}
	    	    		case 4: {break;}
	    	    		}
	    	    	}while (choice1 != 0);
	    	    	break;
	    		}
	    		
	    		//main course menu
	    		case 2: {
	    			int choice2 = -1;
	    	    	
	    	    	do {
	    	    		System.out.println();
	    	    		System.out.println("Main Course Menu:");
	    	    		System.out.println ("*********************************");
	    	    		System.out.println("Enter the number for your main selection:");
	    	    		System.out.println("0 - Nothing");
	    	    		System.out.println("1 - " + mainCourse [0]);
	    	    		System.out.println("2 - " + mainCourse [1]);
	    	    		System.out.println("3 - " + mainCourse [2]);
	    	    		System.out.println("4 - " + mainCourse [3]);
	    	    		System.out.println();
	    	    		System.out.println("*********************************");
	    	    		choice2 = scnr.nextInt();
	    	    		//string that saves input
	    	    		list = list + "Main Course: [" + mainCourse[choice2] + ": ";
	    	    		//toppings 
	    	    		/*https://www.youtube.com/watch?v=3lq9EKTgzYE&t=65s*/
	    	    		//The hyperlink above is where I got the following while loop. All credit goes to the creator.
	    	    		while(true){
	    	    			System.out.println("0 - Nothing");
	                        System.out.println("1 - " + Toppings[0]);
	                        System.out.println("2 - " + Toppings [1]);
	                        System.out.println("3 - " + Toppings [2]);                
	                        top = scnr.nextInt();
	                        if(top == 0) break;
	                        list = list + Toppings[top] + "";
	                       }
	                       list = list + "]\n";
	                       
	    	    		switch (choice) {
	    	    		case 1: {break;}
	    	    		case 2: {break;}
	    	    		case 3: {break;}
	    	    		case 4: {break;}
	    	    		}
	    	    	}while (choice2 != 0);
	    			break;
	    			}
	    		
	    		//dessert menu
	    		case 3: {
	    			int choice3 = -1;
	    	    	do {
	    	    		System.out.println();
	    	    		System.out.println("Dessert Menu:");
	    	    		System.out.println ("*********************************");
	    	    		System.out.println("Enter the number for your dessert selection:");
	    	    		System.out.println("0 - Nothing");
	    	    		System.out.println("1 - " + Dessert [0]);
	    	    		System.out.println("2 - " + Dessert [1]);
	    	    		System.out.println("3 - " + Dessert [2]);
	    	    		System.out.println();
	    	    		System.out.println("*********************************");
	    	    		choice3 = scnr.nextInt();
	    	    		//string that saves input
	    	    		list = list + "Dessert: [" + Dessert[choice3] + ": ";
	    	    		//toppings
	    	    		while(true){
	    	    			System.out.println("0 - Nothing");
	                        System.out.println("1 - " + Toppings[0]);
	                        System.out.println("2 - " + Toppings [1]);
	                        System.out.println("3 - " + Toppings [2]);                
	                        top = scnr.nextInt();
	                        if(top == 0) break;
	                        list = list + Toppings[top] + "";
	                       }
	                       list = list + "]\n";
	    	    		
						switch (choice) {
	    	    		case 1: {break;}
	    	    		case 2: {break;}
	    	    		case 3: {break;}
	    	    		case 4: {break;}
	    	    		}
	    	    	}while (choice3 != 0);
	    			break;
	    			}
	    		}
	    		//summary of your order after pressing zero
	    	}while (choice != 0);
	    	
	    	System.out.println("Here is your order " + name + ":");
	    	System.out.println(list);
	    	System.out.println("Enjoy your meal!");
	    			
	    	
	    }
	    
	    //program terminates if user inputs no
	    if (ans.equalsIgnoreCase("NO")) {
	    	System.out.println("Thank you for stopping by, maybe next time you'll sample our menu");
	    	System.exit(0);
	    }

	}

}
