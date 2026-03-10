class Syrup
{
	String type;
	int quantity;
	
	Syrup(String type,int quantity)
	{
		this.type=type;
		this.quantity=quantity;
	}
	
	void displaySyrup()
	{
		System.out.println("syrup type: "+this.type);
		System.out.println("quantity: "+this.quantity);
	}
}