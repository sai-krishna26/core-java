class PaperRunner
{
	public static void main(String... values)
	{
		Paper paper1 = new Paper("Chart", "A4", "White", "JK", "Smooth", 80, 30, 21, true, 120.0, "JK Mills", "City Traders", 2023, "A Grade", false, true, "Drawing", "Bundle", "Rectangle", true);
		paper1.show();
		System.out.println("------------------------------------------------");

		Paper paper2 = new Paper("Glossy", "A3", "White", "Navneet", "Glossy", 100, 42, 29, true, 250.0, "Navneet Ltd", "Book Depot", 2024, "Premium", true, false, "Printing", "Pack", "Rectangle", true);
		paper2.show();
		System.out.println("------------------------------------------------");

		Paper paper3 = new Paper("Matte", "A5", "Cream", "Classmate", "Rough", 70, 21, 15, true, 90.0, "ITC", "Stationery Hub", 2022, "Standard", false, true, "Writing", "Bundle", "Rectangle", true);
		paper3.show();
		System.out.println("------------------------------------------------");

		Paper paper4 = new Paper("CardSheet", "A2", "Blue", "Oddy", "Hard", 200, 59, 42, false, 400.0, "Oddy Corp", "Wholesale Mart", 2023, "High Grade", true, false, "Craft", "Pack", "Rectangle", true);
		paper4.show();
		System.out.println("------------------------------------------------");

		Paper paper5 = new Paper("ButterPaper", "A4", "Transparent", "Generic", "Soft", 60, 30, 21, true, 150.0, "PaperWorks", "Retail Store", 2021, "Standard", true, true, "Baking", "Roll", "Rectangle", true);
		paper5.show();
		System.out.println("------------------------------------------------");

		Paper paper6 = new Paper("Newspaper", "Large", "Grey", "TimesPrint", "Thin", 45, 60, 40, true, 50.0, "News Corp", "Daily Supply", 2024, "Normal", false, true, "Reading", "Bundle", "Rectangle", true);
		paper6.show();
		System.out.println("------------------------------------------------");

		Paper paper7 = new Paper("PhotoPaper", "A4", "White", "HP", "Ultra Smooth", 180, 30, 21, false, 500.0, "HP Ltd", "Tech Store", 2024, "Premium", true, false, "Photography", "Pack", "Rectangle", true);
		paper7.show();
		System.out.println("------------------------------------------------");

		Paper paper8 = new Paper("TissuePaper", "Small", "White", "Softy", "Soft", 30, 10, 10, true, 60.0, "Softy Pvt Ltd", "Super Market", 2023, "Standard", false, true, "Cleaning", "Box", "Square", true);
		paper8.show();
		System.out.println("------------------------------------------------");

		Paper paper9 = new Paper("StickerPaper", "A4", "White", "StickIt", "Glossy", 120, 30, 21, false, 300.0, "StickIt Ltd", "Print Shop", 2024, "High Grade", true, false, "Labeling", "Pack", "Rectangle", true);
		paper9.show();
		System.out.println("------------------------------------------------");

		Paper paper10 = new Paper("Handmade", "A4", "Beige", "CraftHouse", "Textured", 150, 30, 21, true, 350.0, "CraftHouse Ltd", "Art Store", 2022, "Premium", false, true, "Art", "Bundle", "Rectangle", true);
		paper10.show();
		System.out.println("------------------------------------------------");
	}
}