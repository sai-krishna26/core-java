class WallPaper
{
	String type;
	int size;
	String colour;
	String material;
	String message;
	int outerFrameSize;
	int innerFrameSize;
	boolean stickable;
	double cost;
	String wallPaperDesinger;
	String ownerName;
	int createdYear;
	String technologyUsed;
	String theme;
	boolean isfloatingWallpaper;
	boolean isAiGenrated;
	String publisherName;
	String publisherCompany;
	String shape;
	boolean isPortable;
	
	WallPaper(String type,
	int size,
	String colour,
	String material,
	String message,
	int outerFrameSize,
	int innerFrameSize,
	boolean stickable,
	double cost,
	String wallPaperDesinger,
	String ownerName,
	int createdYear,
	String technologyUsed,
	String theme,
	boolean isfloatingWallpaper,
	boolean isAiGenrated,
	String publisherName,
	String publisherCompany,
	String shape,
	boolean isPortable)
	{
		this.type=type;
		this.size=size;
		this.colour=colour;
		this.material=material;
		this.message=message;
		this.outerFrameSize=outerFrameSize;
		this.innerFrameSize=innerFrameSize;
		this.stickable=stickable;
		this.cost=cost;
		this.wallPaperDesinger=wallPaperDesinger;
		this.ownerName=ownerName;
		this.createdYear=createdYear;
		this.technologyUsed=technologyUsed;
		this.theme=theme;
		this.isfloatingWallpaper=isfloatingWallpaper;
		this.isAiGenrated=isAiGenrated;
		this.publisherName=publisherName;
		this.publisherCompany=publisherCompany;
		this.shape=shape;
		this.isPortable=isPortable;
	}
	
	void show()
	{
		System.out.println("type: " + this.type);
		System.out.println("size: " + this.size);
		System.out.println("colour: " + this.colour);
		System.out.println("material: " + this.material);
		System.out.println("message: " + this.message);
		System.out.println("outer frame size: " + this.outerFrameSize);
		System.out.println("inner frame size: " + this.innerFrameSize);
		System.out.println("stickable: " + this.stickable);
		System.out.println("cost: " + this.cost);
		System.out.println("wall paper designer: " + this.wallPaperDesinger);
		System.out.println("owner name: " + this.ownerName);
		System.out.println("created year: " + this.createdYear);
		System.out.println("technology used: " + this.technologyUsed);
		System.out.println("theme: " + this.theme);
		System.out.println("is floating wallpaper: " + this.isfloatingWallpaper);
		System.out.println("is AI generated: " + this.isAiGenrated);
		System.out.println("publisher name: " + this.publisherName);
		System.out.println("publisher company: " + this.publisherCompany);
		System.out.println("shape: " + this.shape);
		System.out.println("is portable: " + this.isPortable);
	}
}