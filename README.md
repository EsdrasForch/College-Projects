# CMP 167 - Project #1

# Description

- The program interacts with the user through the console and lets them choose options from a food menu by using the associated item number.
-  We used a scanner class in order to receive inputs from the user.
- Each menu string has its own public static method so that the entire program is able to access these strings. 
- We also used a do-loop for our item selections so that the program keeps on looping until the user finishes picking out all of items they want. 
- Finally, I used an orderString to represent the food order that is shown at the end.

# Program Sample
The program should begin by greeting the user with the following statement:
- Welcome to the food festival!
- Would you like to place an order?

The only valid inputs are “Yes” and “No” (case insensitive). 

Other input should not be allowed, and the user should be prompted again for a “Yes” or “No” input as follows:
- Would you like to place an order?

If the user responds “NO” (case insensitive), the user should be thanked as follows:
- Thank you for stopping by, maybe next time you’ll sample our menu.

If the user responds “YES” (case insensitive), the user should be asked their name as follows:
- What is your name for the order?
- The user’s name should be saved in a variable to be used later.

The user should now be prompted to select from a menu of options as follows:
- Select from menu, userName:
	
		0 - Nothing
	
		1 - Appetizer
	
		2 - Main Course
	
		3 - Dessert
  
- Enter the number for your selection:

The menu should then be displayed with each option having a number that will be used for the selection process.

All menus should include at least 3 items each in addition to 0 representing nothing selected. When a selection is made the submenu should be presented until the Toppings menu is reached. That menu should be repeatedly offered to the user until 0 is selected as an option for that category. When 0 is selected as an option for a menu, the menu at the previous level should then be presented. For the top level menu shown above, a selection of 0 should result in ending the application and displaying the following:

- Here is your order, userName:
- orderString
- Enjoy your meal!

