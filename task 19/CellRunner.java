class CellRunner
{
	public static void main(String... value)
	{
		Cell c1 = new Cell("Red Blood Cell","Animal","Biconcave","Carries Oxygen","Blood","Robert Hooke","Human","Eukaryotic","None","Fluid",8,46,1665,120,true,7.4,"Mitosis","Glucose","Hemoglobin",false);
		c1.show();
		System.out.println("------------------------------------------------");

		Cell c2 = new Cell("Neuron","Animal","Branched","Transmit Signals","Brain","Camillo Golgi","Human","Eukaryotic","None","Gel",100,46,1873,1000,true,7.2,"Mitosis","Glucose","Axon",false);
		c2.show();
		System.out.println("------------------------------------------------");

		Cell c3 = new Cell("Muscle Cell","Animal","Long","Movement","Muscle","Antonie van Leeuwenhoek","Human","Eukaryotic","None","Dense",50,46,1674,300,true,7.1,"Mitosis","ATP","Myofibrils",false);
		c3.show();
		System.out.println("------------------------------------------------");

		Cell c4 = new Cell("Plant Cell","Plant","Rectangular","Photosynthesis","Leaf","Robert Hooke","Plant","Eukaryotic","Cellulose","Fluid",100,20,1665,365,true,7.0,"Mitosis","Sunlight","Chloroplast",false);
		c4.show();
		System.out.println("------------------------------------------------");

		Cell c5 = new Cell("Bacteria","Prokaryote","Rod","Decomposition","Soil","Louis Pasteur","Bacteria","Prokaryotic","Peptidoglycan","Simple",2,1,1857,1,false,6.5,"Binary Fission","Organic Matter","Flagella",false);
		c5.show();
		System.out.println("------------------------------------------------");

		Cell c6 = new Cell("White Blood Cell","Animal","Irregular","Immunity","Blood","Elie Metchnikoff","Human","Eukaryotic","None","Fluid",12,46,1882,13,true,7.4,"Mitosis","Glucose","Phagocytosis",false);
		c6.show();
		System.out.println("------------------------------------------------");

		Cell c7 = new Cell("Egg Cell","Animal","Round","Reproduction","Ovary","Karl Ernst von Baer","Human","Eukaryotic","None","Rich",120,23,1827,1,true,7.3,"Meiosis","Nutrients","Large Size",false);
		c7.show();
		System.out.println("------------------------------------------------");

		Cell c8 = new Cell("Sperm Cell","Animal","Tadpole","Fertilization","Testes","Antonie van Leeuwenhoek","Human","Eukaryotic","None","Minimal",60,23,1677,5,true,7.2,"Meiosis","Fructose","Flagellum",false);
		c8.show();
		System.out.println("------------------------------------------------");

		Cell c9 = new Cell("Stem Cell","Animal","Round","Regeneration","Bone Marrow","Ernest McCulloch","Human","Eukaryotic","None","Soft",15,46,1961,200,true,7.4,"Mitosis","Glucose","Differentiation",false);
		c9.show();
		System.out.println("------------------------------------------------");

		Cell c10 = new Cell("Fungal Cell","Fungi","Oval","Absorption","Mushroom","Anton de Bary","Fungi","Eukaryotic","Chitin","Dense",10,8,1853,30,true,6.8,"Mitosis","Organic Matter","Spore Formation",false);
		c10.show();
		System.out.println("------------------------------------------------");
	}
}