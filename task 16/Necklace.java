class Necklace
{
	String brand="Malabar";
	double price=20000;
	int size=10;
	boolean original=true;
	char grade='A';
	float weight=50.5f;
	long code=2222;
	int stock=20;
	double discount=5.5;
	boolean available=true;
	String color="Gold";
	int year=2025;
	float rating=4.7f;
	long warranty=2;
	char type='T';
	boolean returnable=true;
	double makingCharge=2000;
	int pieces=5;
	float purity=91.6f;
	long id=3001;

	Necklace(String brand,double price,int size,boolean original,char grade,
	float weight,long code,int stock,double discount,boolean available,
	String color,int year,float rating,long warranty,char type,
	boolean returnable,double makingCharge,int pieces,float purity,long id)
	{
		this.brand=brand;
		this.price=price;
		this.size=size;
		this.original=original;
		this.grade=grade;
		this.weight=weight;
		this.code=code;
		this.stock=stock;
		this.discount=discount;
		this.available=available;
		this.color=color;
		this.year=year;
		this.rating=rating;
		this.warranty=warranty;
		this.type=type;
		this.returnable=returnable;
		this.makingCharge=makingCharge;
		this.pieces=pieces;
		this.purity=purity;
		this.id=id;

		System.out.println("Necklace brand: "+brand);
	}
}

