class FortRunner
{
	public static void main(String[] values)
	{
		Kingdom kingdom = Kingdom.KADHAMBA;
		Fort fort=new Fort(true,"banavasi,uttara kannada",kingdom);
		fort.printFortDetail();
		System.out.println("---------------------------------------------------");
		
		Fort fort1=new Fort(true,"badami, bagalkot",Kingdom.CHALUKYA);
		fort1.printFortDetail();
		System.out.println("---------------------------------------------------");
		
		Fort fort2=new Fort(true,"Malhked,kalaburgi",Kingdom.RASHTRAKUTA);
		fort2.printFortDetail();
		System.out.println("---------------------------------------------------");
		
		Fort fort3=new Fort(true,"Hampi,vijayangara",Kingdom.VIJAYANAGARA);
		fort3.printFortDetail();
	}
}