class Acid
{
	String acidName;
	String formula;
	double phLevel;
	double molariy;
	int quantity;
	boolean isCorrosive;
	
	Acid(String acidName,String formula,double phLevel,double molariy,int quantity,boolean isCorrosive)
	{
		this.acidName=acidName;
		this.formula=formula;
		this.phLevel=phLevel;
		this.molariy=molariy;
		this.quantity=quantity;
		this.isCorrosive=isCorrosive;
	}
	
	void printAcid()
	{
		System.out.println("------------------------------------");
		System.out.println("executing printAcid in Acid");
		System.out.println("acidName: "+this.acidName);
		System.out.println("formula: "+this.formula);
		System.out.println("phLevel: "+this.phLevel);
		System.out.println("molariy: "+this.molariy);
		System.out.println("quantity: "+this.quantity);
		System.out.println("isCorrosive: "+this.isCorrosive);
	}
}