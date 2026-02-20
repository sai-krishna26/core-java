class AirConditionerRunner
{
	public static void main(String[] name)
	{
		AirConditioner airConditioner=new AirConditioner();
		AirConditioner airConditioner1=new AirConditioner();
		
		System.out.println("default brand :"+airConditioner.brand);
		System.out.println("default model :"+airConditioner.model);
		System.out.println("default price :"+airConditioner.price);
		System.out.println("default type :"+airConditioner.type);
		System.out.println("default weight :"+airConditioner.weight);
		System.out.println("default colors :"+airConditioner.colors);
		System.out.println("default warranty :"+airConditioner.warranty);
		System.out.println("default working :"+airConditioner.working);
		
		airConditioner.brand="samsung";
		airConditioner.model="Samsung Wind-Free AC";
		airConditioner.price=20000.5f;
		airConditioner.type="split AC";
		airConditioner.weight=20;
		airConditioner.colors=new String[]{"red","blue","white","gold"};
		airConditioner.warranty=5;
		airConditioner.working=true;
		
		System.out.println("\ninitialized brand :"+airConditioner.brand);
		System.out.println("initialized model :"+airConditioner.model);
		System.out.println("initialized price :"+airConditioner.price);
		System.out.println("initialized type :"+airConditioner.type);
		System.out.println("initialized weight :"+airConditioner.weight);
		
		System.out.println("initialized colors :");
		for(String col:airConditioner.colors)
		{
			System.out.print(col+", ");
		}
		System.out.println("\ninitialized warranty :"+airConditioner.warranty);
		System.out.println("initialized working :"+airConditioner.working);
		
	}
}