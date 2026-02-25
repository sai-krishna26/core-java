class ChessBoard
{
	String material;
	String color;
	double price;
	int size;
	boolean portable;

	ChessBoard()
	{
		System.out.println("Non-parameterized ChessBoard constructor");
	}

	ChessBoard(String material)
	{
		this.material=material;
		System.out.println(material);
	}

	ChessBoard(double price)
	{
		this.price=price;
		System.out.println(price);
	}

	ChessBoard(int size)
	{
		this.size=size;
		System.out.println(size);
	}

	ChessBoard(boolean portable)
	{
		this.portable=portable;
		System.out.println(portable);
	}

	ChessBoard(String material,String color)
	{
		this.material=material;
		this.color=color;
		System.out.println(material+", "+color);
	}
}