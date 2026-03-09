class Ticket
{
	int price;
	Ticket(int price)
	{
		this.price=price;
		System.out.println("created price using Ticket");
	}
	void getTicket()
	{
		System.out.println("ticket price:" + this.price);
	}
}