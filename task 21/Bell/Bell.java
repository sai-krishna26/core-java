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
		System.out.println("weight: "+this.weight);
		System.out.println("size: "+this.size);
		System.out.println("templeUse: "+this.templeUse);
		if(this.handle!=null)
		{
			this.handle.getHandle();
		}
		if(this.metal!=null)
		{
			this.metal.getMetal();
		}
		if(this.striker!=null)
		{
			this.striker.getStriker();
		}
		if(this.stand!=null)
		{
			this.stand.getStand();
		}
		if(this.sound!=null)
		{
			this.sound.getSound();
		}
		if(this.temple!=null)
		{
			this.temple.getTemple();
		}
	}
	
}