class Bird
{
	static String getColorByName(String name)
	{
		System.out.println("\nexecuting getColorByName in Bird \nname: "+name);
		
		if(name==null)
		{
			System.out.println("name cannot be null");
			return "null";
		}
		
		if(name.equals("peacock"))return "blue";
		if(name.equals("parroat"))return "green";
		if(name.equals("crow"))return "black";
		if(name.equals("sparrow"))return "brown";
		if(name.equals("pigeo"))return "grey";
		if(name.equals("flamingo")) return "pink";
		if(name.equals("canary")) return "yellow";
		if(name.equals("eagle")) return "brown";
		if(name.equals("owl")) return "brown";
		if(name.equals("kingfisher")) return "blue";
		if(name.equals("woodpecker")) return "red";
		if(name.equals("duck")) return "white";
		if(name.equals("swan")) return "white";
		if(name.equals("turkey")) return "brown";
		if(name.equals("penguin")) return "black and white";
		if(name.equals("robin")) return "red";
		if(name.equals("hummingbird")) return "green";
		if(name.equals("falcon")) return "grey";
		if(name.equals("heron")) return "grey";
		if(name.equals("macaw")) return "multicolor";
		if(name.equals("cockatoo")) return "white";
		if(name.equals("nightingale")) return "brown";
		if(name.equals("crane")) return "white";
	
	System.out.println("the bird type does not matched with DB");
	return null;
	}
	
	
	static int getLifespanByName(String name)
	{
		System.out.println("\nexecuting getLifespanByName in Bird \nname: "+name);
		
		if(name==null)
		{
			System.out.println("name cannot be null");
			return -1;
		}
		
		if(name.equals("peacock"))return 50;
		if(name.equals("parroat"))return 20;
		if(name.equals("crow"))return 30;
		if(name.equals("sparrow"))return 15;
		if(name.equals("pigeo"))return 23;
		if(name.equals("flamingo")) return 23;
		if(name.equals("canary")) return 44;
		if(name.equals("eagle")) return 42;
		if(name.equals("owl")) return 65;
		if(name.equals("kingfisher")) return 11;
		if(name.equals("woodpecker")) return 56;
		if(name.equals("duck")) return 25;
		if(name.equals("swan")) return 13;
		if(name.equals("turkey")) return 45;
		if(name.equals("penguin")) return 21;
		if(name.equals("robin")) return 45;
		if(name.equals("hummingbird")) return 12;
		if(name.equals("falcon")) return 14;
		if(name.equals("heron")) return 5;
		if(name.equals("macaw")) return 42;
		if(name.equals("cockatoo")) return 4;
		if(name.equals("nightingale")) return 45;
		if(name.equals("crane")) return 41;
	
	System.out.println("the bird type does not matched with DB");
	return 0;
	}
}