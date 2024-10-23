- ## **BOOK_MARKET** - Online Book Ordering System

## **Description**
**BOOK_MARKET** is a Java-based project that simulates a simple online bookstore. It allows users to browse available books, select and add books to their shopping cart, manage customer information, and place orders. Users can view detailed book descriptions, add or remove items from their cart, and upon finalizing the order, the system generates a receipt. The project is designed to offer a seamless online shopping experience similar to real-world e-commerce platforms.

## **Purpose**
The purpose of **BOOK_MARKET** is to simulate common interactions found in online bookstores, allowing users to:
- Browse a catalog of books.
- Add books to a shopping cart.
- View book details such as author, price, and description.
- Manage personal and customer information.
- Finalize purchases and generate receipts.
This project serves as an educational exercise in Java programming and object-oriented design.

## **Features**
- **Book Browsing**: Users can browse a list of available books with detailed information.
- **Shopping Cart**: Add books to the cart, view cart contents, and remove items.
- **Order Management**: Finalize orders and generate a detailed receipt.
- **Customer Management**: Register new users and manage personal details (name, contact information, etc.).
- **Receipt Generation**: Upon completing an order, a receipt is generated with itemized details of the purchase.

## **Usage**
- **Starting the Program**:After running the Main class, the user is greeted with a welcome message and is presented with a menu of options.

- **Browsing Books**: Select "Browse Books" from the main menu to view the list of available books. Choose any book to see more details or add it to the cart.

- **Shopping Cart**: View your cart to see all selected items. You can remove books or proceed to checkout.

- **Registering Customers**: If you are a new user, you will be prompted to register before proceeding to checkout.

- **Checking Out**: Finalize your order, review the receipt, and the program will display the total cost and a detailed summary of the books purchased.

## **Class Descriptions**
- **Main Class (Welcome)**: The central control class where the program execution begins. It displays the welcome message and offers navigation to other parts of the program like browsing books, registering customers, and accessing the cart.

- **Book Class (Book)**: Represents individual books in the system. It contains attributes such as title, author, price, and bookID. This class is responsible for storing and returning book details.

- **CartItem Class (CartItem)**: Manages individual items within the shopping cart. It tracks the book selected, the quantity ordered, and computes the price based on the quantity.

- **Person Class (Person)**: Manages customer information such as name, email, and phone number. This class is crucial for identifying the user when placing orders.

- **PersonnelReg Class (PersonnelReg)**: Handles the registration and management of customer details, allowing new users to sign up and existing users to modify their personal information.

- **Menu Methods (MenuMethods)**: Contains methods for displaying menus to the user, such as the main menu, book browsing menu, and checkout options.

- **Book List (BookList)**: Manages the collection of available books in the system. This class initializes the book catalog and provides access to the book list for browsing.

## **Functionalities**
- **1. Main Menu**
The Welcome class displays the main menu and allows users to select various actions:
- Browse available books
- View shopping cart
- Register as a new customer
- Proceed to checkout
  
 **2. Book Browsing**
The BookList class stores the book catalog. Users can view the list of available books, select a book to see more details, and add the selected books to their cart.

 **3. Cart Management**
The CartItem class is used to manage items in the shopping cart. Users can add multiple books, remove books, or view the current contents of their cart at any time.

 **4. Customer Registration**
New customers can register by providing their name, email, and other relevant details. The PersonnelReg class handles customer registration and updates.

 **5. Checkout and Receipt**
Once users are done shopping, they can proceed to checkout. The system will display a detailed receipt showing all items in the cart, their prices, and the total amount due.

## **Installation and Setup**
 **Prerequisites**
- Java Development Kit (JDK) installed on your system.
- Basic understanding of object-oriented programming in Java.

## **Project Structure**

```bash
src/
├── Main.java             # Entry point for the program
├── Welcome.java          # Main class that controls the flow of the program
├── Book.java             # Book class (book properties: title, author, price, etc.)
├── CartItem.java         # CartItem class (manages items in the user's cart)
├── Person.java           # Person class (manages customer information)
├── PersonnelReg.java     # Personnel registration class (handles user registration and data)
├── MenuMethods.java      # Class with methods for displaying menus
└── BookList.java         # Class that manages the list of available books



