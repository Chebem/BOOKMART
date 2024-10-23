-# **BOOK_MARKET** - Online Book Ordering System

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



