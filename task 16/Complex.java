 /*Bucket: 5
 Jacket : 5
 Pocket: 3*/
 class Complex
 {
	class Bucket
	{
		int size=10;
		String color="white";
		double cost=299.88;
		
		Bucket(int size, String color, double cost)
		{
			this.size=size;
			this.color=color;
			this.cost=cost;
		}
	}
	
	class Jacket
	{
		String brand="wrong";
		String madePlace="MADE IN CHINA";
		String material="leather";
		double cost=1999.98;
		boolean forMen=true;
		
		Jacket(String brand,String madePlace,String material,double cost,boolean forMen)
		{
			this.brand=brand;
			this.madePlace=madePlace;
			this.material=material;
			this.cost=cost;
			this.forMen=forMen;
		
			System.out.println("-------------------------------------------------------");
			System.out.println("brand of jacket: "+brand+
			"\nmade in: "+madePlace+
			"\nmaterial used: "+material+
			"\ncost of jacket: "+cost+
			"\nis formen?: "+forMen);
		}
	}
	
	
	class Pocket
	{
		boolean forShirt=true;
		String pocketSide="left";
		float length=10.5f;
		
		Pocket(boolean forShirt,String pocketSide,float length)
		{
			this.forShirt=forShirt;
			this.pocketSide=pocketSide;
			this.length=length;
			
			System.out.println("-------------------------------------------------------");
			System.out.println("pocket is for shirt?: "+forShirt+
			"\npocket present at: "+pocketSide+
			"\nlength of pocket: "+length+" cm");
		}
		
	}
 }