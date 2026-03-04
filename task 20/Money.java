class Money
{
	void deposit()
	{
		System.out.println("executing deposit in Money"); 
	}
	void withdraw()
	{
		System.out.println("executing withdraw in Money"); }
	}	
	void transfer()
	{
		System.out.println("executing transfer in Money"); 
	}
	void checkBalance()
	{
		System.out.println("executing checkBalance in Money"); 
	}
	void calculateInterest()
	{
		System.out.println("executing calculateInterest in Money"); 
	}
	void convertCurrency()
	{
		System.out.println("executing convertCurrency in Money"); 
	}
	void displayCurrency()
	{
		System.out.println("executing displayCurrency in Money"); 
	}
	void validateTransaction()
	{
		System.out.println("executing validateTransaction in Money"); 
	}
	void generateReceipt()
	{
		System.out.println("executing generateReceipt in Money"); 
	}
	void applyTax()
	{
		System.out.println("executing applyTax in Money"); 
	}
	void save()
	{
		System.out.println("executing save in Money"); 
	}
	void invest()
	{
		System.out.println("executing invest in Money"); 
	}
	void donate()
	{
		System.out.println("executing donate in Money"); 
	}
	void loan()
	{
		System.out.println("executing loan in Money"); 
	}
	void audit()
	{
		System.out.println("executing audit in Money"); 
	}
}

class MoneyRunner
{
	public static void main(String... args)
	{
		Money money=new Money();
		money.deposit(); money.withdraw(); money.transfer();
		money.checkBalance(); money.calculateInterest();
		money.convertCurrency(); money.displayCurrency();
		money.validateTransaction(); money.generateReceipt();
		money.applyTax(); money.save(); money.invest();
		money.donate(); money.loan(); money.audit();
	}
}