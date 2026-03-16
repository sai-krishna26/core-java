class PastaStoringRunner
{
	public static void main(String...values)
	{
		System.out.println("-------------------------------SAVING METHOD-----------------------------");
		String[] flavours=new String[8];
		PastaStoring pastaStoring =new PastaStoring(flavours);
		
		pastaStoring.getPastaFlavours("mionise");
		pastaStoring.getPastaFlavours("green souse");
		pastaStoring.getPastaFlavours("white souse");
		pastaStoring.getPastaFlavours("chilli souse");
		pastaStoring.getPastaFlavours("hot rider");
		pastaStoring.getPastaFlavours("lime pasta");
		pastaStoring.getPastaFlavours("masala pasta");
		pastaStoring.getPastaFlavours("pasta special");
		pastaStoring.getPastaFlavours(null);
		pastaStoring.getPastaFlavours("desi pasta");
		
		System.out.println("-------------------------------SEARCHING METHOD-----------------------------");
		
		pastaStoring.searchFlavour("mionise");
		pastaStoring.searchFlavour("desi pasta");
		pastaStoring.searchFlavour("chilli souse");
		pastaStoring.searchFlavour("pasta special");
		pastaStoring.searchFlavour("masala pasta");
		pastaStoring.searchFlavour("hot rider");
		pastaStoring.searchFlavour("lime pasta");
		pastaStoring.searchFlavour("white souse");
		pastaStoring.searchFlavour(null);
		pastaStoring.searchFlavour("makhani souse");
	}
}