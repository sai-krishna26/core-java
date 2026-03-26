class AcidStoreRunner
{
	public static void main(String... val)
	{
		Acid[] acids=new Acid[10];
		AcidStore acidStore=new AcidStore(acids);
		
		Acid acid1=new Acid("Nitric Acid","HNO3",11.0,22.56,2,true);
		acidStore.acidStore(acid1);
		
		Acid acid2 = new Acid("Hydrochloric Acid", "HCl", 1.1, 12.0, 5, true);
		acidStore.acidStore(acid2);

		Acid acid3 = new Acid("Sulfuric Acid", "H2SO4", 0.5, 18.4, 3, true);
		acidStore.acidStore(acid3);

		Acid acid4 = new Acid("Acetic Acid", "CH3COOH", 2.4, 1.0, 10, false);
		acidStore.acidStore(acid4);

		Acid acid5 = new Acid("Phosphoric Acid", "H3PO4", 1.5, 14.6, 4, true);
		acidStore.acidStore(acid5);

		Acid acid6 = new Acid("Citric Acid", "C6H8O7", 3.2, 0.5, 20, false);
		acidStore.acidStore(acid6);

		Acid acid7 = new Acid("Carbonic Acid", "H2CO3", 4.1, 0.01, 50, false);
		acidStore.acidStore(acid7);

		Acid acid8 = new Acid("Hydrofluoric Acid", "HF", 2.1, 28.0, 1, true);
		acidStore.acidStore(acid8);

		Acid acid9 = new Acid("Boric Acid", "H3BO3", 5.1, 0.1, 15, false);
		acidStore.acidStore(acid9);

		Acid acid10 = new Acid("Formic Acid", "HCOOH", 2.3, 5.0, 8, true);
		acidStore.acidStore(acid10);

		
	}
}