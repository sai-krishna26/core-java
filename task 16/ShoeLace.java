class ShoeLace
{
	String brand="Nike";
	int length=120;
	double price=250.5;
	boolean strong=true;
	char type='R';
	float thickness=2.5f;
	long code=555;
	int stock=40;
	double discount=5.5;
	boolean washable=true;

	ShoeLace(String brand,int length,double price,
	boolean strong,char type,float thickness,
	long code,int stock,double discount,boolean washable)
	{
		this.brand=brand;
		this.length=length;
		this.price=price;
		this.strong=strong;
		this.type=type;
		this.thickness=thickness;
		this.code=code;
		this.stock=stock;
		this.discount=discount;
		this.washable=washable;

		System.out.println("Brand: "+brand);
	}
}