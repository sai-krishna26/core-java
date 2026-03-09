class Leaf
{
	String type;
	Leaf(String type)
	{
		this.type=type;
		System.out.println("created type using Leaf");
	}
	void getLeaf()
	{
		System.out.println("Leaf type: "+this.type);
	}
}