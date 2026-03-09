class Mushroom
{
	boolean isEdible;
	String color;
	MushroomType type;

	Mushroom(boolean isEdible,String color,MushroomType type)
	{
		this.isEdible=isEdible;
		this.color=color;
		this.type=type;
	}

	void printInfo()
	{
		System.out.println("Edible: "+this.isEdible);

		if(this.color!=null)
		{
			System.out.println("Color: "+this.color);
		}

		if(this.type!=null)
		{
			System.out.println("Type: "+this.type);
		}
	}
}