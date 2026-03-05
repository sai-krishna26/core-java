class Bell
{
	String shape;
	String color;
	int weight;
	int size;
	boolean templeUse;

	Handle handle;
	Metal metal;
	Striker striker;
	Stand stand;
	Sound sound;
	Temple temple;

	Bell(String shape,String color,int weight,int size,boolean templeUse,
	Handle handle,Metal metal,Striker striker,Stand stand,Sound sound,Temple temple)
	{
		this.shape=shape;
		this.color=color;
		this.weight=weight;
		this.size=size;
		this.templeUse=templeUse;
		this.handle=handle;
		this.metal=metal;
		this.striker=striker;
		this.stand=stand;
		this.sound=sound;
		this.temple=temple;

		System.out.println("created a Bell using primitive and non primitive variables");
	}

	void getBell()
	{
		System.out.println("shape: "+this.shape);
		System.out.println("color: "+this.color);
		System.out.println("metal object: "+this.metal);
	}
}