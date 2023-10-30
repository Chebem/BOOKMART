import java.util.Scanner;


public class Welcome 
{
	static final int NUM_BOOK= 3; //
	static final int NUM_ITEM = 7; //

	public static void main(String[] args) 
	{
		String[][] mBook = new String[NUM_BOOK][NUM_ITEM];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input your name: ");
		String username = scanner.nextLine();
					
		System.out.print("Input your PhoneNumber: ");	
		int user_mobile_no = scanner.nextInt();
		
		String greeting = "Welcome to Shopping Mall";
		String tagLine= "welcome to Book Market";
		
		
		boolean quit = false;
		
		while(!quit)
		{
			System.out.println("**********************************************************");
			System.out.println("\t"  + greeting);
			System.out.println("\t"  + tagLine);
			System.out.println("**********************************************************");
			
			
			menuIntroduction();
			
			System.out.println("***********************************************************************************************************");
			System.out.print("Input your choice: ");
			int choice = scanner.nextInt(); // to read user's choice
			
			
			if (choice < 1 || choice > 8)
			{
				System.out.println("Wrong input!\n Enter between  numbers 1-8: ");
			}
			else
			{
				switch(choice)
				{
				case 1:
					Menu_Guest_Info(username, user_mobile_no);
					break;
				case 2:
					Menu_CartItem_List();
					break;
				case 3:
					Menu_Cart_Clear();
					break;
				case 4:
					Menu_Cart_AddItem(mBook);
					break;
				case 5:
					Menu_CartRemoveItem_Count();
					break;
				case 6:
					Menu_Cart_RemoveItem();
					break;
				case 7:
					Menu_Cart_Bill();
					break;
				case 8:
					Menu_Exit();
					quit = true;
					break;
				}
			}
			
			
				
			
			
		}
		
	}

	public static void menuIntroduction()
	{
		System.out.println("***********************************************************************************************************");
		System.out.println("1. Confrim Customer Infromation                   4. Add item into your cart");
		System.out.println("2.  View the list of items in the shopping cart   5. Reduce the quantity of items in the shopping cart");
		System.out.println("3. Empty Shooping Cart                            6. Delete items in the cart");
		System.out.println("7. Display Reciept                                8. Exit ");
		System.out.println("***********************************************************************************************************");
	}
	
	public static void Menu_Guest_Info(String name, int mobile_number)
	{
		System.out.println("1. Customer Present Infromation: " );
		System.out.println("Name: " +name);
		System.out.println("Contact Info: " + mobile_number);
		System.out.print("\n\n");
	}
	
	public static void Menu_CartItem_List()
	{
		System.out.println("2. View the list of items in the shopping cart: \n\n");
	}
	
	public static void Menu_Cart_Clear()
	{
		System.out.println("3. Empty Shooping Cart: \n\n");
	}
		
	public static void Menu_Cart_AddItem(String[][] book)
	{
		System.out.println("4. Add item into your cart: \n\n"   );
		BookList(book);
		for(int i = 0; i < NUM_BOOK; i++)
		{
			for (int j = 0; j < NUM_ITEM; j++)
			{
				System.out.println(book[i][j] + " | ");
			}
			System.out.println(" ");
		}
	}
	
	public static void Menu_CartRemoveItem_Count()
	{
		System.out.println("5. Reduce the quantity of items in the shopping cart: \n\n");
	}
	
	public static void Menu_Cart_RemoveItem()
	{
		System.out.println("6.Delete items in the cart: \n\n");
	}
	
	public static void Menu_Cart_Bill()
	{
		System.out.println("7. Display Reciept: \n\n");
	}
	
	public static void Menu_Exit()
	{
		System.out.println("8. Exit: \n\n");
	}
	
	public static void BookList(String[][] book)
	{
		book[0][0] = "ISBN1234";
		book[0][1] = "Easy Learning JSP Programming";
		book[0][2] = "27,000";
		book[0][3] = "Song Mi-young";
		book[0][4] = "JSP Wall programming to find and learn shopping step by step";
		book[0][5] = "IT Specialized Book";
		book[0][6] = "2018/10/08";
		
		
		
		book[1][0] = "ISBN1235";
		book[1][1] = "Android Programming";
		book[1][2] = "33,000";
		book[1][3] = "Woo Jae-nam";
		book[1][4] = "Practice Step by Step clear mentoring";
		book[1][5] = "IT Specialized Book";
		book[1][6] = "2022/01/22";
		
		
		book[2][0] = "ISBN1236";
		book[2][1] = "Scratching";
		book[2][2] = "22,000";
		book[2][3] = "Go Gwa-Yeoul";
		book[2][4] = "Block coding to develop computer thinking skills";
		book[2][5] = "Computer Introduction";
		book[2][6] = "2019/06/10";
	}
}

