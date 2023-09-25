package Java;
import java.util.Scanner;

public class Menu_display {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);   //  To read the users input
	
		System.out.print("Enter  Your Name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter your Phone Number: ");
		int number = scanner.nextInt();
		
		
		//Display Menu
			
			System.out.println("***********************************************************");
			System.out.println("                   Welcome to Shopping Mall");
			System.out.println("                   Welcome to Book Market");
			
			System.out.println("************************************************************");
			System.out.println("1. Confrim Customer Infromation                   4. Add item into your cart");
			System.out.println("2.  View the list of items in the shopping cart   5. Reduce the quantity of items in the shopping cart");
			System.out.println("3. Empty Shooping Cart                            6. Delete items in the cart");
			System.out.println("7. Display Reciept                                8. Exit ");
			
			System.out.print("Enter Menu Number: ");
			int n = scanner.nextInt();
			
				
			if(n < 1 || n > 8)
		{
			System.out.println("Wrong input!\n Enter between  numbers 1-8: ");
			
		}
		else
		{
			switch(n)
			{
				case 1:
					System.out.println("1. Customer Present Infromation: " );
					System.out.print("Name: " +name);
					System.out.print("     Contact Info: " + number);
					break;
				case 2:
					System.out.println("2. View the list of items in the shopping cart: ");
					break;
				case 3:
					System.out.println("3. Empty Shooping Cart: ");
					break;
				case 4:
					System.out.println("4. Add item into your cart: ");
					break;
				case 5:
					System.out.println("5. Reduce the quantity of items in the shopping cart: ");
					break;
				case 6:
					System.out.println("6.Delete items in the cart: ");
					break;
				case 7:
					System.out.println("7. Display Reciept: ");
					break;
				case 8:
					System.out.println("8. Exit: ");
					break;
			}
						
			}
		}

	}



