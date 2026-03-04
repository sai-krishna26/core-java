class HamperRunner
{
	public static void main(String... values)
	{
		Hamper hamper=new Hamper();
		Hamper hamper1=new Hamper();
		hamper.hamperId();
		hamper.customerName();
		hamper.listOfItems();
		hamper.totalAmount();
		hamper.addItemToHamper();
		hamper.removeItemFromHamper();
		hamper.calculateTotalPrice();
		hamper.Discount();
		hamper.hamperDetails();
		hamper.updateCustomerDetails();
		hamper.checkIfEmpty();
		hamper.countTotalItems();
		hamper.calculateTax();
		hamper.generateBill();
		hamper.applyCouponCode();
		Hamper.checkDeliveryStatus();
		Hamper.updateDeliveryAddress();
		Hamper.compareByPrice();
		Hamper.saveHamperDataToFile();
		Hamper.sortItems();
	}
}