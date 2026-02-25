class Bracelet
{
	String brand="Gold";
	double price=5000;
	int size=6;
	boolean original=true;
	char grade='A';
	float weight=20.5f;
	long code=12345;
	int stock=50;
	double discount=10.5;
	boolean available=true;
	String color="Yellow";
	int year=2025;
	float rating=4.5f;
	long warranty=1;
	char type='G';
	boolean returnable=true;
	double makingCharge=500;
	int pieces=10;
	float purity=91.6f;
	long id=1001;

	Bracelet(String brand,double price,int size,boolean original,char grade,
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

		System.out.println("Bracelet brand: "+brand);
	}
}

