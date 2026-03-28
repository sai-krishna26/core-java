class Profile
{
	String type;
	String name;
	int size;
	String color;
	boolean hasHuman;
	
	Profile(String type,
	String name,
	int size,
	String color,
	boolean hasHuman)
	{
		this.type=type;
		this.name=name;
		this.size=size;
		this.color=color;
		this.hasHuman=hasHuman;
	}
	
	void showProfile()
	{
		System.out.println("---------------------------------------------");
		System.out.println("executing the showProfile in Profile");
		System.out.println("type: "+this.type);
		System.out.println("name: "+this.name);
		System.out.println("size: "+this.size);
		System.out.println("color: "+this.color);
		System.out.println("hasHuman: "+this.hasHuman);
	}
}