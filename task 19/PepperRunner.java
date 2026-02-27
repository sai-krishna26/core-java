class PepperRunner
{
	public static void main(String... value)
	{
		Pepper pepper1 = new Pepper("Black Pepper", "Black", "India", 8, 0.5, 250.0, true, "SpiceHub", 100, "12-2026", "Strong", false, true, "Packet", "Ravi Traders", "SpiceHub Pvt Ltd", 2024, "A Grade", true, "Store in dry place");
		pepper1.show();
		System.out.println("------------------------------------------------");

		Pepper pepper2 = new Pepper("White Pepper", "White", "Vietnam", 6, 0.25, 180.0, false, "FreshSpice", 50, "08-2025", "Mild", true, false, "Bottle", "Anita Suppliers", "FreshSpice Ltd", 2023, "Premium", true, "Keep airtight");
		pepper2.show();
		System.out.println("------------------------------------------------");

		Pepper pepper3 = new Pepper("Green Pepper", "Green", "Brazil", 5, 0.3, 210.0, true, "NatureSpices", 75, "11-2025", "Fresh", false, true, "Box", "Global Traders", "NatureSpices Co", 2024, "A Grade", true, "Refrigerate after opening");
		pepper3.show();
		System.out.println("------------------------------------------------");

		Pepper pepper4 = new Pepper("Red Pepper", "Red", "China", 9, 0.4, 300.0, false, "HotSpice", 100, "05-2026", "Very Spicy", true, false, "Packet", "Spice World", "HotSpice Pvt Ltd", 2023, "Export Quality", true, "Avoid moisture");
		pepper4.show();
		System.out.println("------------------------------------------------");

		Pepper pepper5 = new Pepper("Pink Pepper", "Pink", "Peru", 4, 0.2, 350.0, true, "EliteSpices", 40, "09-2025", "Sweet Spicy", false, true, "Jar", "Premium Traders", "EliteSpices Ltd", 2024, "Premium", true, "Store in cool place");
		pepper5.show();
		System.out.println("------------------------------------------------");

		Pepper pepper6 = new Pepper("Crushed Pepper", "Black", "India", 7, 0.6, 270.0, false, "DailySpice", 150, "03-2026", "Strong", true, false, "Pouch", "Local Traders", "DailySpice Co", 2023, "Standard", true, "Seal tightly");
		pepper6.show();
		System.out.println("------------------------------------------------");

		Pepper pepper7 = new Pepper("Organic Pepper", "Black", "Sri Lanka", 8, 0.45, 320.0, true, "OrganicFarm", 80, "07-2026", "Rich", false, true, "Glass Bottle", "Farm Fresh", "OrganicFarm Pvt Ltd", 2024, "Organic Grade", true, "Keep away from sunlight");
		pepper7.show();
		System.out.println("------------------------------------------------");

		Pepper pepper8 = new Pepper("Smoked Pepper", "Dark Brown", "Mexico", 7, 0.35, 290.0, false, "SmokeSpice", 60, "10-2025", "Smoky", true, false, "Tin", "Smoke Traders", "SmokeSpice Ltd", 2023, "Premium", true, "Store dry");
		pepper8.show();
		System.out.println("------------------------------------------------");

		Pepper pepper9 = new Pepper("Lemon Pepper", "Yellow", "USA", 5, 0.3, 260.0, false, "CitrusSpice", 90, "06-2025", "Citrusy", true, false, "Bottle", "Citrus Suppliers", "CitrusSpice Co", 2023, "Standard", true, "Keep sealed");
		pepper9.show();
		System.out.println("------------------------------------------------");

		Pepper pepper10 = new Pepper("Garlic Pepper", "Brown", "Italy", 6, 0.5, 310.0, true, "FlavorMix", 120, "01-2026", "Garlic Spicy", true, false, "Packet", "Euro Traders", "FlavorMix Ltd", 2024, "A Grade", true, "Store in cool dry place");
		pepper10.show();
		System.out.println("------------------------------------------------");
	}
}