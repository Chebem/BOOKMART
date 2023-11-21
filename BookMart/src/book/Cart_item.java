package book;

public class Cart_item 
{
	
	private String[] Item_book = new String[7];
	private String Book_id;
	private int Quantity;
	private int Total_price;
	
	
	
	public Cart_item()
	{
		
	}
	
	public Cart_item(String[] book)
	{
		this.Item_book = book;
		this.Book_id = book[0];
		this.Quantity = 1;
		update_total_price();
	}
	
	public String[] get_item_book()
	{
		return Item_book;
	}
	
	public void set_item_book(String[]item_book)
	{
		this.Item_book = item_book;
	}
	
	public String get_book_id()
	{
		return Book_id;
	}
	
	
	public void set_book_id(String book_id)
	{
		this.Book_id = book_id;
		this.update_total_price();
	}
	
	public int get_quantity()
	{
		return Quantity;
	}
	
	public void set_quantity(int quantity)
	{
		this.Quantity = quantity;
		this.update_total_price();
	}
	
	public int get_total_price()
	{
		return Total_price;
	}
	
	
	public void update_total_price()
	{
		
		Total_price = Integer.parseInt(this.Item_book[2]) * this.Quantity;
		
	}
}
