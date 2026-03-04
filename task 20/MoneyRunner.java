class MoneyRunner
{
	public static void main(String... args)
	{
		Money money=new Money();
		Money money1=new Money();
		money.deposit();
		money.withdraw();
		money.transfer();
		money.checkBalance();
		money.calculateInterest();
		money.convertCurrency();
		money.displayCurrency();
		money.validateTransaction();
		money.generateReceipt();
		money.applyTax();
		money.save();
		money.invest();
		money.donate();
		money.loan();
		money.audit();
	}
}