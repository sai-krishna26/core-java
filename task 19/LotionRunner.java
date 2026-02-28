class LotionRunner
{
	public static void main(String... value)
	{
		Lotion l1 = new Lotion("Nivea","Soft","All","Mild","White","Jojoba Oil","Beiersdorf","Germany","Unisex","Bottle",200,2024,2027,15,false,250.0,"Plastic","Daily","Creamy",true);
		l1.show();
		System.out.println("------------------------------------------------");

		Lotion l2 = new Lotion("Vaseline","Cocoa Glow","Dry","Cocoa","Brown","Cocoa Butter","Unilever","India","Women","Bottle",300,2023,2026,10,false,220.0,"Pump","Daily","Thick",true);
		l2.show();
		System.out.println("------------------------------------------------");

		Lotion l3 = new Lotion("Himalaya","Aloe Vera","Sensitive","Herbal","Green","Aloe Vera","Himalaya","India","Unisex","Bottle",250,2024,2026,20,true,190.0,"Flip Cap","Daily","Light",true);
		l3.show();
		System.out.println("------------------------------------------------");

		Lotion l4 = new Lotion("Lakme","Peach Milk","Normal","Peach","Pink","Peach Extract","HUL","India","Women","Bottle",120,2024,2026,12,false,180.0,"Plastic","Daily","Smooth",true);
		l4.show();
		System.out.println("------------------------------------------------");

		Lotion l5 = new Lotion("Ponds","Light Moisturizer","Oily","Fresh","White","Vitamin E","HUL","India","Unisex","Tube",150,2023,2025,8,false,160.0,"Tube","Daily","Gel",true);
		l5.show();
		System.out.println("------------------------------------------------");

		Lotion l6 = new Lotion("Mamaearth","Ubtan","All","Turmeric","Yellow","Turmeric","Mamaearth","India","Unisex","Bottle",200,2024,2027,25,true,349.0,"Pump","Daily","Creamy",true);
		l6.show();
		System.out.println("------------------------------------------------");

		Lotion l7 = new Lotion("WOW","Coconut","Dry","Coconut","White","Coconut Oil","WOW Skin","India","Unisex","Bottle",300,2024,2027,18,true,299.0,"Pump","Daily","Thick",true);
		l7.show();
		System.out.println("------------------------------------------------");

		Lotion l8 = new Lotion("Biotique","Bio Almond","All","Herbal","Light Brown","Almond Oil","Biotique","India","Women","Bottle",190,2023,2026,14,true,210.0,"Plastic","Daily","Smooth",true);
		l8.show();
		System.out.println("------------------------------------------------");

		Lotion l9 = new Lotion("Garnier","Bright Complete","Normal","Citrus","White","Vitamin C","Loreal","France","Unisex","Tube",100,2024,2026,30,false,199.0,"Tube","Daily","Light",true);
		l9.show();
		System.out.println("------------------------------------------------");

		Lotion l10 = new Lotion("Cetaphil","Moisturizing","Sensitive","Mild","White","Glycerin","Galderma","USA","Unisex","Bottle",250,2024,2027,5,false,450.0,"Pump","Medical","Creamy",true);
		l10.show();
		System.out.println("------------------------------------------------");
	}
}