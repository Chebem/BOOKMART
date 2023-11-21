package book;

public class Person 
{
	 private String Name;
	 private  int Phone;
	private  String  Address;

	public Person(String name, int phone) 
	{
		this.Name = name;
		this.Phone = phone;
		
	}
	
	public Person(String name, int phone, String address)
	{ 
		this.Name = name;
		this.Phone = phone;
		this.Address= address;
	
	}
	
	public String getName()

	{
		return Name;
	}
	
	
	public void setName(String name)
	{
		this.Name = name;	
	}
	
	public int getPhone()
	{
		return Phone;
	}
	
	public void setPhone(int phone)
	{
		this.Phone = phone;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public void setAddress(String address)
	{
		this.Address = address; 
	}
	
	

}
